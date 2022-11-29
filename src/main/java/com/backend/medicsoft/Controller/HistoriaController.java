package com.backend.medicsoft.Controller;

import com.backend.medicsoft.Models.Historia;
//import com.backend.medicsoft.Dao.HistoriaDao;
import com.backend.medicsoft.Service.HistoriaService;
import com.backend.medicsoft.Models.Personas;
import com.backend.medicsoft.Dao.PersonasDao;
//import com.backend.medicsoft.Service.PersonasService;

import java.util.List;
import javax.validation.Valid;
import com.backend.medicsoft.Segurity.Hash;
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
import org.springframework.web.bind.annotation.RequestHeader;
//import org.springframework.web.bind.annotation.RequestHeader;
//import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/historia")
public class HistoriaController {
    //@Autowired
    //private HistoriaDao dao;
    @Autowired
    private HistoriaService servicio;
    @Autowired
    private PersonasDao dao;
    
    //Método Post para Insertar datos en la tabla de la BD
    @PostMapping(value="/")
    @ResponseBody
    public ResponseEntity<Historia> agregar(@RequestHeader("clave")String clave,@RequestHeader("documento")String documento,@Valid @RequestBody Historia dato){   
        Personas obj= new Personas();
        obj=dao.login(documento, Hash.sha1(clave));
        if (obj!=null) {            
            return new ResponseEntity<>(servicio.save(dato), HttpStatus.OK); 
        } else {
            return new ResponseEntity<>(HttpStatus.UNAUTHORIZED); 
        }     
    }

    //Método Delete para Eliminar datos en la tabla de la BD
    @DeleteMapping(value="/{id}") 
    public ResponseEntity<Historia> eliminar(@PathVariable Integer id){ 
        Historia obj = servicio.findById(id); 
            if(obj!=null) //Encontró al registro
            servicio.delete(id);
            else 
                return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR); 
            return new ResponseEntity<>(obj, HttpStatus.OK); 
    }

    //Método Put para Modificar datos en la tabla de la BD
    @PutMapping(value="/") 
    @ResponseBody
    public ResponseEntity<Historia> editar(@Valid @RequestBody Historia dato){ 
        Historia obj = servicio.findById(dato.getId_historia()); 
        if(obj!=null) { //Lo encotró
            //obj.setId_historia(dato.getId_historia());
            //obj.setId_cita(dato.getId_cita());
            obj.setMotivocita(dato.getMotivocita());
            obj.setEnfermedad(dato.getEnfermedad());
            obj.setAntecedentes(dato.getAntecedentes());
            obj.setObservaciones(dato.getObservaciones());           
            servicio.save(dato); 
        } 
        else 
        return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR); 
        return new ResponseEntity<>(obj, HttpStatus.OK); 
    }

    //Método Put para Modificar datos en la tabla de la BD    
    @GetMapping("/list") 
    @ResponseBody
    public ResponseEntity<List<Historia>> consultarTodo(@RequestHeader("documento")String documento,@RequestHeader("clave")String clave){   
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
    public ResponseEntity<Historia>  consultaPorId(@PathVariable Integer id,
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
}
