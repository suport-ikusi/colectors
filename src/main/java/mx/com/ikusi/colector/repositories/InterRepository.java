package mx.com.ikusi.colector.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface InterRepository extends CrudRepository<Inter, Integer> {

	public Inter findInterByNodeidAndIsmanaged(Integer id, String parm);

	@Query("SELECT i FROM Inter i WHERE i.nodeid = :nodeid AND i.issnmpprimary ='P'")
	public List<Inter> findInterById(@Param("nodeid") Integer id);

}
