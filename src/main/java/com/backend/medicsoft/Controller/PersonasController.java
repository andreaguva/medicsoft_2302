package com.backend.medicsoft.Controller;

import com.backend.medicsoft.Models.Personas;
import com.backend.medicsoft.Segurity.Hash;
import com.backend.medicsoft.Dao.PersonasDao;
import com.backend.medicsoft.Service.PersonasService;

import java.util.List;
//import javax.validation.Valid;
//import javax.validation.constraints.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
//import org.springframework.web.bind.annotation.RequestHeader;
//import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/personas")
public class PersonasController {

    @Autowired
    private PersonasDao dao; 
    @Autowired
    private PersonasService servicio;

    //Método Get para Listar o mostrar todos los datos en la tabla de la BD
    @GetMapping("/list") 
    @ResponseBody
    public ResponseEntity<List<Personas>> consultarTodo(@RequestHeader("documento")String documento,@RequestHeader("clave")String clave){   
        Personas obj= new Personas();
        obj=dao.login(documento, Hash.sha1(clave));        
        if (obj!=null) {            
            return new ResponseEntity<>(servicio.findAll(),HttpStatus.OK);
        } else {
           return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
        }            
    }    
    //Método Get para Listar o mostrar por id los datos en la tabla de la BD
    @GetMapping("/list/{id}") 
    @ResponseBody
    public ResponseEntity<Personas>  consultaPorId(@PathVariable String id,
    @RequestHeader("clave")String clave,
    @RequestHeader("documento")String documento){    
        Personas obj= new Personas();
        obj=dao.login(documento, Hash.sha1(clave));
        if (obj!=null) {
            return new ResponseEntity<>(servicio.findById(id),HttpStatus.OK);            
        } else {
            return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
        }         
    } 
    //Método Get para validar los datos documento y clave en la vista persona de la BD
    @GetMapping("/login")
    @ResponseBody
    public Personas ingresar(@RequestParam ("documento") String documento,@RequestParam ("clave") String clave) {
        clave=Hash.sha1(clave);
        return servicio.login(documento, clave); 
    }
    
}
    

