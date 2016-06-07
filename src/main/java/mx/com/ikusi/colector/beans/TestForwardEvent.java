package mx.com.ikusi.colector.beans;

import mx.com.ikusi.colector.snow.Colector;
import mx.com.ikusi.colector.snow.Customer;
import mx.com.ikusi.colector.snow.Destination;
import mx.com.ikusi.colector.snow.Device;
import mx.com.ikusi.colector.snow.Event;
import mx.com.ikusi.colector.snow.Metric;
import mx.com.ikusi.colector.snow.Siem;
import mx.com.ikusi.colector.snow.Source;

public class TestForwardEvent implements Fordware {

	private static Event event = new Event();

	public TestForwardEvent() {
		// TODO Auto-generated constructor stub
	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.out.println("Start Sendd mail....");
//		
//		EventMarshall em = new EventMarshall();
//		em.cag.findEventById(28328);
//		//em.process();
//		//ForwardEvent fordwar = new ForwardEvent();
//	
//		// fordwar.forward(event);
//		//
//		//ColectorAgent agent = new ColectorAgent();
//		//mx.com.ikusi.colector.repositories.Event e = agent.findEventById(28010);
//
//		
//		//System.out.println("Loaad AppContext Ok"+  e.toString());
//
//	}

	public static void setEvent() {

		event.setName(EVENT_NODE_DOWN);
		event.setContext("Network");
		event.setId("39482");
		event.setItsm("Snow");
		event.setUei("394845-Node Down-23499");
		event.setSeverity("medium");
		event.setTime("2015-12-22");

		// colector
		Colector colector = new Colector();
		colector.setName("OpenNMS");
		colector.setIp("10.2.12.45");
		colector.setHostname("OpenNMS-HostName");
		colector.setPlatform("Linux");
		colector.setPort("2387");
		event.setColector(colector);

		// customer
		Customer customer = new Customer();
		customer.setName("Gamesa_testbus");
		customer.setId("123085df4f795200fab7029d0210c710");
		event.setCustomer(customer);

		// device
		Device device = new Device();
		device.setIp("");
		device.setName("");
		device.setSerialNumber("");
		device.setProvider("");
		device.setMac("");
		device.setModelId("");
		event.setDevice(device);

		// siem
		Source source = new Source();
		source.setId("DKEK3-2W9D");
		source.setPort("80");
		Destination destination = new Destination();
		destination.setId("MSWSW-928EW");
		destination.setPort("8080");
		Siem siem = new Siem();
		siem.setSource(source);
		siem.setDestination(destination);
		event.setSiem(siem);

		// messages
		event.setMessage("Dispositivos fuera de cominucacion");

		// metrics
		Metric metric = new Metric();
		metric.setName("CPU");
		metric.setValue("70");
		event.getMetrics().add(metric);
		metric = new Metric();
		metric.setName("Memory");
		metric.setValue("80");
		event.getMetrics().add(metric);

	}

}
