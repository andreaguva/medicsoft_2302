package com.backend.medicsoft.Controller;

import com.backend.medicsoft.Models.Medico;
//import com.backend.medicsoft.Dao.MedicoDao;
import com.backend.medicsoft.Service.MedicoService;
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
@RequestMapping("/medico")
public class MedicoController {

    //@Autowired
    //private MedicoDao dao; 
    @Autowired
    private MedicoService servicio;
    @Autowired
    private PersonasDao dao;
    
    //Método Post para Insertar datos en la tabla de la BD
    @PostMapping(value="/")
    @ResponseBody
    public ResponseEntity<Medico> agregar(@RequestHeader("clave")String clave,@RequestHeader("documento")String documento,@Valid @RequestBody Medico dato){   
        Personas obj= new Personas();
        obj=dao.login(documento, Hash.sha1(clave));
        if (obj!=null) { 
            dato.setClave_medico(Hash.sha1(dato.getClave_medico()));                    
            return new ResponseEntity<>(servicio.save(dato), HttpStatus.OK); 
        } else {
            return new ResponseEntity<>(HttpStatus.UNAUTHORIZED); 
        }   
    }

    //Método Delete para Eliminar datos en la tabla de la BD
    @DeleteMapping(value="/{id}") 
    public ResponseEntity<Medico> eliminar(@PathVariable Integer id){ 
        Medico obj = servicio.findById(id); 
            if(obj!=null) //Encontró al registro
            servicio.delete(id);
            else 
                return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR); 
            return new ResponseEntity<>(obj, HttpStatus.OK); 
    }

    //Método Put para Modificar datos en la tabla de la BD
    @PutMapping(value="/") 
    @ResponseBody
    public ResponseEntity<Medico> editar(@RequestHeader("clave")String clave,@RequestHeader("documento")String documento,@Valid @RequestBody Medico dato){ 
        Personas obj= new Personas();
        obj=dao.login(documento, Hash.sha1(clave));
        if(obj!=null){
            dato.setClave_medico(Hash.sha1(dato.getClave_medico()));
            Medico objeto = servicio.findById(dato.getId_medico()); 
            if(objeto!=null) { //Lo encotró
                //obj.setId_medico(dato.getId_medico());
                objeto.setClave_medico(dato.getClave_medico());
                objeto.setRol(dato.getRol());
                objeto.setRegistro_medico(dato.getRegistro_medico());
                objeto.setNombre_medico(dato.getNombre_medico());
                objeto.setApellido_medico(dato.getApellido_medico());
                objeto.setTel_medico(dato.getTel_medico());
                objeto.setEmail_medico(dato.getEmail_medico());
                //obj.setId_especialidad(dato.getId_especialidad());
                servicio.save(dato); 
            } 
            else 
            return new ResponseEntity<>(objeto, HttpStatus.INTERNAL_SERVER_ERROR); 
            return new ResponseEntity<>(objeto, HttpStatus.OK); 
        }else{
            return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
        }
        
    }

    @GetMapping("/list") 
    @ResponseBody
    public ResponseEntity<List<Medico>> consultarTodo(@RequestHeader("documento")String documento,@RequestHeader("clave")String clave){   
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
    public ResponseEntity<Medico>  consultaPorId(@PathVariable Integer id,
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
