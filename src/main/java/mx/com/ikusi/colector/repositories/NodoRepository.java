package mx.com.ikusi.colector.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface NodoRepository extends CrudRepository<Nodo, Integer> {

	public Nodo findByNodeid(Integer id);
}
