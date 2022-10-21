
package practica.practica_examen.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import practica.practica_examen.entity.Conciertos;

/**
 *
 * @author redet
 */

@Repository

public interface ConciertosRepository extends CrudRepository<Conciertos,Long>{
    
}
