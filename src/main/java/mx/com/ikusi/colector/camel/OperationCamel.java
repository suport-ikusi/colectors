package mx.com.ikusi.colector.camel;

import org.apache.activemq.camel.component.ActiveMQComponent;
import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

/**
 * 
 * @author interware
 *
 */
public class OperationCamel {

	/**
	 * Metodo que copia un archivos
	 * 
	 * @throws Exception
	 */
	public static void FileComponentCopy() throws Exception {
		System.out.println("Copiando archivos con CamelContext");
		CamelContext context = new DefaultCamelContext();
		context.addRoutes(new RouteBuilder() {
			@Override
			public void configure() {
				from("file:data/inbox?noop=true").to("file:data/outbox");
			}

		});
		context.start();
		Thread.sleep(10000);
		context.stop();
	}

	/**
	 * Envia mensajes a la cola
	 * 
	 * Datos de produccion ip: 192.168.1.25 username: ods password: ods.2015
	 * 
	 * @param msj
	 *            Mensaje a enviar
	 * @throws Exception
	 */
	
	public static void JMSComponent(String msj) throws Exception {

		ActiveMQComponent activemq = new ActiveMQComponent();
		activemq.setBrokerURL("tcp://10.3.159.249:61616");
		activemq.setUserName("admin");
		activemq.setPassword("admin");

		CamelContext context = new DefaultCamelContext();
		context.addComponent("activemq", activemq);

		// Para leer mensajes de la cola
		// context.addRoutes(new RouteBuilder() {
		// @Override
		// public void configure() throws Exception {
		// from("activemq:queue:Q.EVENT").to("stream:out");
		// }
		// });

		ProducerTemplate template = context.createProducerTemplate();
		context.start();
		template.sendBody("activemq:Q.MON.EVENT", msj);
		Thread.sleep(2000);
		context.stop();

	}
}
