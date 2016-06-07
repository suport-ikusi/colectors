package mx.com.ikusi.colector.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import mx.com.ikusi.colector.repositories.Evento;
import mx.com.ikusi.colector.repositories.Inter;
import mx.com.ikusi.colector.repositories.InterRepository;
import mx.com.ikusi.colector.repositories.Nodo;
import mx.com.ikusi.colector.repositories.NodoRepository;
import mx.com.ikusi.colector.repositories.EventRepository;

@Component
public class Colector {

	@Autowired
	public EventRepository eventRepo;
	
	@Autowired
	public NodoRepository nodeRepository;
	
	@Autowired
	public InterRepository interRepository;
	
	
	public Evento getEventById(Integer id){
		
		 return eventRepo.findByEventId(id);
			
	}
	
	public Nodo getNodeById(Integer id){
		return nodeRepository.findByNodeid(id);
	}
	
	
	public Inter getInterByNodeid(Integer id){
		
		return interRepository.findInterById(id).get(0);
	}
	
	
	
}
