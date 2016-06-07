package mx.com.ikusi.colector;

import mx.com.ikusi.colector.beans.EventMarshall;
import mx.com.ikusi.colector.beans.ForwardEvent;
import mx.com.ikusi.colector.repositories.Evento;
import mx.com.ikusi.colector.repositories.EventRepository;
import mx.com.ikusi.colector.repositories.EventoRepository;
import mx.com.ikusi.colector.repositories.Inter;
import mx.com.ikusi.colector.repositories.InterRepository;
import mx.com.ikusi.colector.repositories.Nodo;
import mx.com.ikusi.colector.repositories.NodoRepository;
import mx.com.ikusi.colector.service.Colector;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class EventRepositoryIntegrationTest {

	private static final Logger log = Logger.getLogger(EventRepositoryIntegrationTest.class);


	@Autowired
	public EventRepository eventRepository;
	
	@Autowired
	public NodoRepository nodeRepository;
	
	@Autowired
	public InterRepository interRepository;
	
	@Autowired
	public Colector colector;  


//	@Test
//	public void sampleTestsd() {
//		System.out.println("Start App Context....");
//		Long numEvents = eventRepository.count();
//
//		System.out.println("End App Context...." + numEvents);
//	}

	@Test
	public void findById() {

		System.out.println("Start Find Event By  Id...............");
		Evento ev = this.eventRepository.findByEventId(33199);
		System.out.println("Event by Id...--------" + ev.toString());
		
	}
//	
//	@Test
//	public void colectorService(){
//		
//		System.out.println("Load Serviceeeeeee ....");
//		
//		Colector c = new Colector();
//		Evento e = 
//		colector.getEventById(24249);
//		
//		System.out.println("Event for Service-------");
//		
//		
//	}
//	
//	@Test
//	public void findNodeById() {
//
//		System.out.println("Start Find NODE--- By  Id...............");
//		Nodo n = nodeRepository.findByNodeid(8);
//		System.out.println("Event by Id...--------" + n.getNodelabel());
//	}
//	
//	@Test
//	public void findIntByNodeId(){
//		System.out.println("Get node ById");
//		List<Inter>  i = new ArrayList<Inter>();
//		i = interRepository.findInterById(6);
//		
//		System.out.println("Interface---" +i.size());
//		System.out.println("IP----" + i.get(0).getIpaddr());
//	}

}
