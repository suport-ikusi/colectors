package mx.com.ikusi.colector.beans;


import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import mx.com.ikusi.colector.repositories.Evento;
import mx.com.ikusi.colector.repositories.Inter;
import mx.com.ikusi.colector.repositories.Nodo;
import mx.com.ikusi.colector.snow.Colector;
import mx.com.ikusi.colector.snow.Customer;
import mx.com.ikusi.colector.snow.Destination;
import mx.com.ikusi.colector.snow.Device;
import mx.com.ikusi.colector.snow.Event;
import mx.com.ikusi.colector.snow.Metric;
import mx.com.ikusi.colector.snow.Siem;
import mx.com.ikusi.colector.snow.Source;

public class EventMarshall implements Fordware {

	private static final Logger log = Logger.getLogger(EventMarshall.class);

	private Event event;

	private Evento e; 
	
	
	
	
	
	

	public static ColectorAgent ca = new ColectorAgent();

	public  void process(Integer id) {

		log.info("CALL COLECTOR AGENT");
		e = new Evento();
		System.out.println("Call Find Event By ID...");
		e = ca.findEventById(id);
		if (!e.equals(null)) {
			log.info("Object is not null");
			System.out.println("Evento-----" + e.getEventId());
			event = createByIdEvente(id);
			log.info("Object find in Data  Base" + e.toString());
		}else{
			System.out.println("Evento no encontrado");
		}
		
		
		
		log.info("==Name=======" + event.getName());
		log.info("==Severity===" + event.getSeverity());
		log.info("==Divice=====" + event.getDevice().getName());
		log.info("==Ip=========" + event.getDevice().getIp());
		log.info("==CollelerId=" + event.getCustomer().getCallerid());
		
		//setEvent();
		
		if (event.sendMessage())
			log.info("Mensaje recuperado, creado y enviado");
		else
			log.info("Error en envio de mensaje");
	}


	public static Event createByIdEvente(Integer id) {
		 Event event = new Event();
		 Nodo node = new Nodo();
		 Evento e = new Evento();
		 Inter inter = new Inter();
		 
		try {
			e = ca.findEventById(id);
			log.info("RECUPERA EVENTO--------------"+e.getEventId());
			event.setId(e.getEventId().toString());
			event.setName(converStrName(e.getEventUei()));
			event.setContext(CONTEXT_NETWORK);
			event.setItsm(ITSM_SMOW);
			event.setUei("");
			event.setSeverity(e.getEventSeverity());
			event.setTime(e.getEventTime().toString());
			
			Colector colector = new Colector();
			colector.setName(COlECTOR_NAME);
			colector.setIp("127.0.0.1");
			colector.setHostname(e.getEventHost());
			colector.setPlatform(COLECTOR_PLATFORM);
			colector.setPort("");
			event.setColector(colector);
			
			Customer customer = new Customer();
			customer.setName(CUSTOMER_NAME);
			customer.setId(CUSTOMER_ID);
			customer.setCallerid(CALLER_ID);
			event.setCustomer(customer);
			
			// colector
			


			// device
			node = ca.findNodeById(e.getNodeId());
			//inter = ca.findInterById(n.getNodeid());
			log.info("RECUPERA DIVICE"+ node.getNodelabel());
			Device device = new Device();
			
			inter = ca.findInterById(node.getNodeid());
			System.out.println("Find Node---" + inter.getIpaddr());
			device.setIp(inter.getIpaddr());
			device.setName(node.getNodelabel());
			device.setSerialNumber(node.getNodetype());
			device.setProvider("");
			device.setMac("");
			device.setModelId(node.getNodeid().toString());
			event.setDevice(device);
			
			
			
			// siem
			Source source = new Source();
			source.setId("");
			source.setPort("");
			Destination destination = new Destination();
			destination.setId("");
			destination.setPort("");
			Siem siem = new Siem();
			siem.setSource(source);
			siem.setDestination(destination);
			event.setSiem(siem);

			// messages
			event.setMessage(e.getEventDescr());

			// metrics
			Metric metric = new Metric();
			metric.setName("");
			metric.setValue("");
			event.getMetrics().add(metric);
			
			log.info("Crete Object OK");
			
		} catch (Exception ex) {
			log.info("Exception on Repository" + ex.getCause());
		}

		return event;
	}

	

	public static String converStrName(String name) {
		

		Map<String, String> map = new HashMap<String, String>();
		
		map.put("uei.opennms.org/nodes/nodeUp", EVENT_NODE_UP);
		map.put("uei.opennms.org/nodes/nodeDown", EVENT_NODE_DOWN);
		map.put("uei.opennms.org/nodes/powerFail", EVENT_POWER_FAIL);
		map.put("uei.opennms.org/nodes/powerRestore", EVENT_POWER_RESTORED);
		//Tests
		//uei.opennms.org/traps/DeltaUPS-MIB/dupsPowerFail
		map.put("uei.opennms.org/traps/DeltaUPS-MIB/dupsPowerFail", EVENT_POWER_FAIL);
		map.put("uei.opennms.org/traps/DeltaUPS-MIB/dupsPowerRestored", EVENT_POWER_RESTORED);
		


		return map.get(name);
	}

	

}
