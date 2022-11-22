package com.backend.medicsoft.Controller;

import com.backend.medicsoft.Models.Especialidad;
//import com.backend.medicsoft.Dao.EspecialidadDao;
import com.backend.medicsoft.Service.EspecialidadService;

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
@RequestMapping("/especialidad")
public class EspecialidadController {

    //@Autowired
    //private EspecialidadDao dao; 
    @Autowired
    private EspecialidadService servicio;
    
    //Método Post para Insertar datos en la tabla de la BD
    @PostMapping(value="/")
    @ResponseBody
    public ResponseEntity<Especialidad> agregar(@Valid @RequestBody Especialidad dato){   
        Especialidad obj = servicio.save(dato);
        return new ResponseEntity<>(obj, HttpStatus.OK);     
    }

    //Método Delete para Eliminar datos en la tabla de la BD
    @DeleteMapping(value="/{id}") 
    public ResponseEntity<Especialidad> eliminar(@PathVariable Integer id){ 
        Especialidad obj = servicio.findById(id); 
            if(obj!=null) //Encontró al registro
            servicio.delete(id);
            else 
                return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR); 
            return new ResponseEntity<>(obj, HttpStatus.OK); 
    }

    //Método Put para Modificar datos en la tabla de la BD
    @PutMapping(value="/") 
    @ResponseBody
    public ResponseEntity<Especialidad> editar(@Valid @RequestBody Especialidad dato){ 
        Especialidad obj = servicio.findById(dato.getId_especialidad()); 
        if(obj!=null) { //Lo encotró
            //obj.setId_especialidad(dato.getId_especialidad());
            obj.setNom_especialidad(dato.getNom_especialidad());;
            servicio.save(dato); 
        } 
        else 
        return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR); 
        return new ResponseEntity<>(obj, HttpStatus.OK); 
    }

    //Método Put para Modificar datos en la tabla de la BD
    @GetMapping("/list") 
    //@ResponseBody
    public List<Especialidad> consultarTodo(){        
        return servicio.findAll();          
    }

    @GetMapping("/list/{id}") 
    @ResponseBody
    public Especialidad consultaPorId(@PathVariable Integer id){ 
        return servicio.findById(id); 
    }
}
