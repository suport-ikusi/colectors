/**
 * 
 */
package mx.com.ikusi.colector.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
 


/**
 * @author interware
 *
 */
public interface EventRepository extends CrudRepository<Evento, Integer> {
	
	public Evento  findByEventId(Integer id);
	
	
	public List<Evento> findByEventUei(String uei);

}
