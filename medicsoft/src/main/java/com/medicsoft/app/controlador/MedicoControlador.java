package com.backend.bancog58.Controller;

import com.backend.bancog58.Models.Medico;
//import com.backend.bancog58.Dao.MedicoDao;
import com.backend.bancog58.Service.MedicoService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin("*")
@RequestMapping("/medico")
public class MedicoController {
   //@Autowired
    //private ClienteDao clienteDao; 
    @Autowired
    private MedicoService medicoService;
    
    //Método Post para Insertar datos en la tabla de la BD
    @PostMapping(value="/")
    @ResponseBody
    public ResponseEntity<Medico> agregar(@RequestBody Medico medico){   
        Medico obj = medicoService.save(medico);
        return new ResponseEntity<>(obj, HttpStatus.OK);     
    }
   

    //Método Delete para Eliminar datos en la tabla de la BD
    @DeleteMapping(value="/{id}") 
    public ResponseEntity<Medico> eliminar(@PathVariable String id){ 
        
        Medico obj = medicoService.findById(id); 
            if(obj!=null) //Encontró al registro
            medicoService.delete(id);
            else 
                return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR); 
            return new ResponseEntity<>(obj, HttpStatus.OK); 
 
    }
    

    //Método Put para Modificar datos en la tabla de la BD
    @PutMapping(value="/") 
    @ResponseBody
    public ResponseEntity<Medico> editar(@RequestBody Medico medico){ 
        Medico obj = medicoService.findById(medico.getId_medico()); 
        if(obj!=null) { //Lo encotró
            obj.setCedula(medico.getCedula());
            obj.setNombres(medico.getNombres());
			obj.setApellidos(medico.getApellidos());
			obj.setTelefono(medico.getTelefono());
            obj.setGenero(medico.getGenero());
			
            medicoService.save(medico); 
        } 
        else 
        return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR); 
        return new ResponseEntity<>(obj, HttpStatus.OK); 
    }
   

    //Método Put para Modificar datos en la tabla de la BD
    @GetMapping("/list") 
    //@ResponseBody
    public List<Medico> consultarTodo(){
        
        return medicoService.findAll();
          
    }
    
    @GetMapping("/list/{id}") 
    @ResponseBody
    public Medico consultaPorId(@PathVariable String id){ 
        return medicoService.findById(id); 
    }
    
   
    
}
