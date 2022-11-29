package com.backend.medicsoft.Service;

import com.backend.medicsoft.Models.Personas;
import com.backend.medicsoft.Dao.PersonasDao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonasService {

    @Autowired
    private PersonasDao dao;

    //Creamos el método para buscar un solo registro en la Tabla de la BD
    @Transactional(readOnly=true)
    public Personas findById(String id) {
        return dao.findById(id).orElse(null);
    }
    
    //Creamos el método para buscar todos los registros en la Tabla de la BD
    @Transactional(readOnly=true)
    public List<Personas> findAll() {
        return (List<Personas>) dao.findAll();
    }

    //Creamos el método para validar login la Tabla de la BD
    @Transactional(readOnly=true)
    public Personas login(String documento, String clave) {
        return dao.login(documento, clave);
    }

}
    

