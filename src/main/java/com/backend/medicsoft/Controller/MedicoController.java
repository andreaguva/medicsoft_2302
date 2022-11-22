package com.backend.medicsoft.Controller;

import com.backend.medicsoft.Models.Medico;
//import com.backend.medicsoft.Dao.MedicoDao;
import com.backend.medicsoft.Service.MedicoService;

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
import org.springframework.web.bind.annotation.RequestMapping;
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
    
    //Método Post para Insertar datos en la tabla de la BD
    @PostMapping(value="/")
    @ResponseBody
    public ResponseEntity<Medico> agregar(@Valid @RequestBody Medico dato){   
        Medico obj = servicio.save(dato);
        return new ResponseEntity<>(obj, HttpStatus.OK);     
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
    public ResponseEntity<Medico> editar(@Valid @RequestBody Medico dato){ 
        Medico obj = servicio.findById(dato.getId_medico()); 
        if(obj!=null) { //Lo encotró
            //obj.setId_medico(dato.getId_medico());
            obj.setClave_medico(dato.getClave_medico());
            obj.setRol(dato.getRol());
            obj.setRegistro_medico(dato.getRegistro_medico());
            obj.setNombre_medico(dato.getNombre_medico());
            obj.setApellido_medico(dato.getApellido_medico());
            obj.setTel_medico(dato.getTel_medico());
            obj.setEmail_medico(dato.getEmail_medico());
            //obj.setId_especialidad(dato.getId_especialidad());
            servicio.save(dato); 
        } 
        else 
        return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR); 
        return new ResponseEntity<>(obj, HttpStatus.OK); 
    }

    //Método Put para Modificar datos en la tabla de la BD
    @GetMapping("/list") 
    //@ResponseBody
    public List<Medico> consultarTodo(){        
        return servicio.findAll();          
    }

    @GetMapping("/list/{id}") 
    @ResponseBody
    public Medico consultaPorId(@PathVariable Integer id){ 
        return servicio.findById(id); 
    }
    
}
