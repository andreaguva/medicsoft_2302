package com.backend.medicsoft.Controller;

import com.backend.medicsoft.Models.Consultorio;
//import com.backend.medicsoft.Dao.ConsultorioDao;
import com.backend.medicsoft.Service.ConsultorioService;

import java.util.List;
import javax.validation.Valid;
//import javax.validation.constraints.Null;

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
@RequestMapping("/consultorio")
public class ConsultorioController {

    //@Autowired
    //private ConsultorioDao dao; 
    @Autowired
    private ConsultorioService servicio;
    
    //Método Post para Insertar datos en la tabla de la BD
    @PostMapping(value="/")
    @ResponseBody
    public ResponseEntity<Consultorio> agregar(@Valid @RequestBody Consultorio dato){   
        Consultorio obj = servicio.save(dato);
        return new ResponseEntity<>(obj, HttpStatus.OK);     
    }

    //Método Delete para Eliminar datos en la tabla de la BD
    @DeleteMapping(value="/{id}") 
    public ResponseEntity<Consultorio> eliminar(@PathVariable Integer id){ 
        Consultorio obj = servicio.findById(id); 
            if(obj!=null) //Encontró al registro
            servicio.delete(id);
            else 
                return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR); 
            return new ResponseEntity<>(obj, HttpStatus.OK); 
    }

    //Método Put para Modificar datos en la tabla de la BD
    @PutMapping(value="/") 
    @ResponseBody
    public ResponseEntity<Consultorio> editar(@Valid @RequestBody Consultorio dato){ 
        Consultorio obj = servicio.findById(dato.getId_consultorio()); 
        if(obj!=null) { //Lo encotró
            //obj.setId_consultorio(dato.getId_consultorio());
            obj.setNombre(dato.getNombre());
            obj.setId_especialidad(dato.getId_especialidad());
            servicio.save(dato); 
        } 
        else 
        return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR); 
        return new ResponseEntity<>(obj, HttpStatus.OK); 
    }

    //Método Put para Modificar datos en la tabla de la BD
    @GetMapping("/list") 
    //@ResponseBody
    public List<Consultorio> consultarTodo(){        
        return servicio.findAll();          
    }

    @GetMapping("/list/{id}") 
    @ResponseBody
    public Consultorio consultaPorId(@PathVariable Integer id){ 
        return servicio.findById(id); 
    }
    
}
