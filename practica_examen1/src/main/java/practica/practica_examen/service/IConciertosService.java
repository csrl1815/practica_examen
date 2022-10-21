
package practica.practica_examen.service;

import java.util.List;
import practica.practica_examen.entity.Conciertos;

/**
 *
 * @author redet
 */
public interface IConciertosService {
    public List<Conciertos> getAllConciertos();
    public Conciertos getConciertosById (long id);
    public void saveConcierto (Conciertos concierto);
    public void delete (long id);

    public List<Conciertos> listConciertos();
}
