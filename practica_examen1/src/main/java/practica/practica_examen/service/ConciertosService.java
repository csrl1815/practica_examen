
package practica.practica_examen.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import practica.practica_examen.entity.Conciertos;
import practica.practica_examen.repository.ConciertosRepository;

/**
 *
 * @author redet
 */

@Service
public class ConciertosService implements IConciertosService {

    @Autowired
    private ConciertosRepository conciertosRepository;

    @Override
    public Conciertos getConciertosById(long id) {
         return conciertosRepository.findById(id).orElse(null);
    }

    @Override
    public void saveConcierto(Conciertos concierto) {
        conciertosRepository.save(concierto);
    }

    @Override
    public void delete(long id) {
       conciertosRepository.deleteById(id);
    }

    @Override
    public List<Conciertos> getAllConciertos() {
       return (List<Conciertos>) conciertosRepository.findAll();
    }

    @Override
    public List<Conciertos> listConciertos() {
        return (List<Conciertos>) conciertosRepository.findAll();
    }
    
}
