package com.backend.medicsoft.Controller;

import com.backend.medicsoft.Models.Paciente;
//import com.backend.medicsoft.Dao.PacienteDao;
import com.backend.medicsoft.Service.PacienteService;

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
@RequestMapping("/paciente")
public class PacienteController {

    //@Autowired
    //private ClienteDao clienteDao; 
    @Autowired
    private PacienteService objSrv;
    
    //Método Post para Insertar datos en la tabla de la BD
    @PostMapping(value="/")
    @ResponseBody
    public ResponseEntity<Paciente> agregar(@Valid @RequestBody Paciente dato){   
        Paciente obj = objSrv.save(dato);
        return new ResponseEntity<>(obj, HttpStatus.OK);     
    }

    //Método Delete para Eliminar datos en la tabla de la BD
    @DeleteMapping(value="/{id}") 
    public ResponseEntity<Paciente> eliminar(@PathVariable Integer id){ 
        Paciente obj = objSrv.findById(id); 
            if(obj!=null) //Encontró al registro
            objSrv.delete(id);
            else 
                return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR); 
            return new ResponseEntity<>(obj, HttpStatus.OK); 
    }

    //Método Put para Modificar datos en la tabla de la BD
    @PutMapping(value="/") 
    @ResponseBody
    public ResponseEntity<Paciente> editar(@Valid @RequestBody Paciente dato){ 
        Paciente obj = objSrv.findById(dato.getId_paciente()); 
        if(obj!=null) { //Lo encotró
            obj.setId_usuario(dato.getId_usuario());
            obj.setFinanciamiento(dato.getFinanciamiento());
            objSrv.save(dato); 
        } 
        else 
        return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR); 
        return new ResponseEntity<>(obj, HttpStatus.OK); 
    }

    //Método Put para Modificar datos en la tabla de la BD
    @GetMapping("/list") 
    //@ResponseBody
    public List<Paciente> consultarTodo(){        
        return objSrv.findAll();          
    }

    @GetMapping("/list/{id}") 
    @ResponseBody
    public Paciente consultaPorId(@PathVariable Integer id){ 
        return objSrv.findById(id); 
    }
}
