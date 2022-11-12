package com.backend.medicsoft.Controller;

import com.backend.medicsoft.Models.Usuario;
//import com.backend.medicsoft.Dao.UsuarioDao;
import com.backend.medicsoft.Service.UsuarioService;

import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.Null;

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
@RequestMapping("/usuario")
public class UsuarioController {

    //@Autowired
    //private ClienteDao clienteDao; 
    @Autowired
    private UsuarioService objSrv;
    
    //Método Post para Insertar datos en la tabla de la BD
    @PostMapping(value="/")
    @ResponseBody
    public ResponseEntity<Usuario> agregar(@Valid @RequestBody Usuario dato){   
        Usuario obj = objSrv.save(dato);
        return new ResponseEntity<>(obj, HttpStatus.OK);    
        //return new ResponseEntity<>(dato, HttpStatus.OK);    
    }

    //Método Delete para Eliminar datos en la tabla de la BD
    @DeleteMapping(value="/{id}") 
    public ResponseEntity<Usuario> eliminar(@PathVariable Integer id){ 
        Usuario obj = objSrv.findById(id); 
            if(obj!=null) //Encontró al registro
            objSrv.delete(id);
            else 
                return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR); 
            return new ResponseEntity<>(obj, HttpStatus.OK); 
    }

    //Método Put para Modificar datos en la tabla de la BD
    @PutMapping(value="/") 
    @ResponseBody
    public ResponseEntity<Usuario> editar(@Valid @RequestBody Usuario dato){ 
        Usuario obj = objSrv.findById(dato.getId_usuario()); 
        if(obj!=null) { //Lo encotró
            obj.setCedula(dato.getCedula());
            obj.setNombres(dato.getNombres());
            obj.setApellidos(dato.getApellidos());
            obj.setTelefono(dato.getTelefono());
            obj.setGenero(dato.getGenero());
            obj.setClave(dato.getClave());
            obj.setRol(dato.getRol());
            objSrv.save(dato); 
        } 
        else 
        return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR); 
        return new ResponseEntity<>(obj, HttpStatus.OK); 
    }

    //Método Put para Modificar datos en la tabla de la BD
    @GetMapping("/list") 
    //@ResponseBody
    public List<Usuario> consultarTodo(){        
        return objSrv.findAll();          
    }

    @GetMapping("/list/{id}") 
    @ResponseBody
    public Usuario consultaPorId(@PathVariable Integer id){ 
        return objSrv.findById(id); 
    }
}
