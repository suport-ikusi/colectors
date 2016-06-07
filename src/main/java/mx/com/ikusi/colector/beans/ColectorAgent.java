/**
 * 
 */
package mx.com.ikusi.colector.beans;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import mx.com.ikusi.colector.AppConfig;
import mx.com.ikusi.colector.repositories.Event;
import mx.com.ikusi.colector.repositories.Evento;
import mx.com.ikusi.colector.repositories.Inter;
import mx.com.ikusi.colector.repositories.Nodo;
import mx.com.ikusi.colector.service.Colector;


/**
 * @author interware
 *
 */
public class ColectorAgent {

	public Colector colector = null;

	public Evento event = null;
	
	public Nodo node = null;
	
	public Inter inter = null;
	
	public ColectorAgent() {
		ApplicationContext context = 
				   new AnnotationConfigApplicationContext(AppConfig.class);
				   

		this.colector = context.getBean(Colector.class);

	}

	

	public Evento findEventById(Integer id) {

		return this.event = this.colector.getEventById(id);
	}
	
	public Nodo findNodeById(Integer id) {

		return this.node = this.colector.getNodeById(id);
	}
	
	public Inter findInterById(Integer id){
		
		return this.inter = this.colector.getInterByNodeid(id);
	}
	
	
	
	
	
	

}
