
package practica.practica_examen.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import practica.practica_examen.entity.Conciertos;
import practica.practica_examen.service.IConciertosService;

/**
 *
 * @author redet
 */

@Controller
public class ConciertosController {
    @Autowired
    private IConciertosService conciertosService;
    
    
    @GetMapping("/conciertos")
    public String index(Model model){
        List<Conciertos> listaConciertos = conciertosService.getAllConciertos();
        model.addAttribute("titulo","Tabla Conciertos");
        model.addAttribute("conciertos", listaConciertos);
        return "conciertos";
    }
    
     @GetMapping("/conciertosN")
    public String crearConciertos(Model model){
        List<Conciertos> listaConciertos = conciertosService.listConciertos();
        model.addAttribute("conciertos",new Conciertos());
        model.addAttribute("conciertos", listaConciertos);
        return "crear";
    }
}
