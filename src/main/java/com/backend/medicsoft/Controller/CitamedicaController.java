package com.backend.medicsoft.Controller;

import com.backend.medicsoft.Models.Citamedica;
//import com.backend.medicsoft.Dao.CitamedicaDao;
import com.backend.medicsoft.Service.CitamedicaService;

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
@RequestMapping("/citamedica")
public class CitamedicaController {

    //@Autowired
    //private ClienteDao clienteDao; 
    @Autowired
    private CitamedicaService objSrv;
    
    //Método Post para Insertar datos en la tabla de la BD
    @PostMapping(value="/")
    @ResponseBody
    public ResponseEntity<Citamedica> agregar(@Valid @RequestBody Citamedica dato){   
        Citamedica obj = objSrv.save(dato);
        return new ResponseEntity<>(obj, HttpStatus.OK);     
    }

    //Método Delete para Eliminar datos en la tabla de la BD
    @DeleteMapping(value="/{id}") 
    public ResponseEntity<Citamedica> eliminar(@PathVariable Integer id){ 
        Citamedica obj = objSrv.findById(id); 
            if(obj!=null) //Encontró al registro
            objSrv.delete(id);
            else 
                return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR); 
            return new ResponseEntity<>(obj, HttpStatus.OK); 
    }

    //Método Put para Modificar datos en la tabla de la BD
    @PutMapping(value="/") 
    @ResponseBody
    public ResponseEntity<Citamedica> editar(@Valid @RequestBody Citamedica dato){ 
        Citamedica obj = objSrv.findById(dato.getId_cita()); 
        if(obj!=null) { //Lo encotró
            obj.setId_cita(dato.getId_cita());
            obj.setId_especialidad(dato.getId_especialidad());
            obj.setId_medico(dato.getId_medico());
            obj.setId_consultorio(dato.getId_consultorio());
            obj.setId_paciente(dato.getId_paciente());
            obj.setFecha(dato.getFecha());
            obj.setHorainicial(dato.getHorainicial());
            obj.setHorafinal(dato.getHorafinal());
            objSrv.save(dato); 
        } 
        else 
        return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR); 
        return new ResponseEntity<>(obj, HttpStatus.OK); 
    }

    //Método Put para Modificar datos en la tabla de la BD
    @GetMapping("/list") 
    //@ResponseBody
    public List<Citamedica> consultarTodo(){        
        return objSrv.findAll();          
    }

    @GetMapping("/list/{id}") 
    @ResponseBody
    public Citamedica consultaPorId(@PathVariable Integer id){ 
        return objSrv.findById(id); 
    }
    
}
