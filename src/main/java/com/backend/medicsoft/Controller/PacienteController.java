package com.backend.medicsoft.Controller;

import com.backend.medicsoft.Models.Paciente;
//import com.backend.medicsoft.Dao.PacienteDao;
import com.backend.medicsoft.Service.PacienteService;
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
@RequestMapping("/paciente")
public class PacienteController {

    //@Autowired
    //private PacienteDao dao; 
    @Autowired
    private PacienteService servicio;
    @Autowired
    private PersonasDao dao; 
        
    //Método Post para Insertar datos en la tabla de la BD
    @PostMapping(value="/")
    @ResponseBody
    public ResponseEntity<Paciente> agregar(@RequestHeader("clave")String clave,@RequestHeader("documento")String documento,@Valid @RequestBody Paciente dato){      
        Personas obj= new Personas();
        obj=dao.login(documento, Hash.sha1(clave));
        if (obj!=null) {  
            dato.setClave_paciente(Hash.sha1(dato.getClave_paciente()));       
            return new ResponseEntity<>(servicio.save(dato), HttpStatus.OK); 
        } else {
            return new ResponseEntity<>(HttpStatus.UNAUTHORIZED); 
        }            
    }
    
    //Método Delete para Eliminar datos en la tabla de la BD
    @DeleteMapping(value="/{id}") 
    public ResponseEntity<Paciente> eliminar(@PathVariable Integer id){ 
        Paciente obj = servicio.findById(id);                   
            if (obj!=null) {
                servicio.delete(id);
            }                
            else 
                return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR); 
                return new ResponseEntity<>(obj, HttpStatus.OK);           
    }
        
    //Método Put para Modificar datos en la tabla de la BD
    @PutMapping(value="/") 
    @ResponseBody
    public ResponseEntity<Paciente> editar(@RequestHeader("clave")String clave,@RequestHeader("documento")String documento,@RequestBody Paciente dato){ 
        Personas obj= new Personas();
        obj=dao.login(documento, Hash.sha1(clave));
        if(obj!=null){
            dato.setClave_paciente(Hash.sha1(dato.getClave_paciente()));
            Paciente objeto = servicio.findById(dato.getId_paciente()); 
            if(objeto!=null) { //Lo encotró       
                //obj.setId_paciente(dato.getId_paciente());
                objeto.setClave_paciente(dato.getClave_paciente());
                objeto.setRol(dato.getRol());
                objeto.setDocumento_paciente(dato.getDocumento_paciente());
                objeto.setNombre_paciente(dato.getNombre_paciente());
                objeto.setApellido_paciente(dato.getApellido_paciente());
                objeto.setTel_paciente(dato.getTel_paciente());
                objeto.setEmail_paciente(dato.getEmail_paciente());
                objeto.setFnacim_paciente(dato.getFnacim_paciente());
                objeto.setGenero_paciente(dato.getGenero_paciente());
                objeto.setOcupacion(dato.getOcupacion());
                objeto.setEstado_civil(dato.getEstado_civil());          
                servicio.save(dato);
            }
            else 
                return new ResponseEntity<>(objeto, HttpStatus.INTERNAL_SERVER_ERROR); 
                return new ResponseEntity<>(objeto, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
        }              
    }
    
    //Método Get para Listar o mostrar todos los datos en la tabla de la BD
    //Método Put para Modificar datos en la tabla de la BD    
    @GetMapping("/list") 
    @ResponseBody
    public ResponseEntity<List<Paciente>> consultarTodo(@RequestHeader("documento")String documento,@RequestHeader("clave")String clave){   
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
    public ResponseEntity<Paciente>  consultaPorId(@PathVariable Integer id,
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
