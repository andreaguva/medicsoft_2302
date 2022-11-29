package com.backend.medicsoft.Service;

import com.backend.medicsoft.Models.Historia_clinica;
import com.backend.medicsoft.Dao.Historia_clinicaDao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class Historia_clinicaService {
    @Autowired
    private Historia_clinicaDao dao;

    //Creamos el método para buscar un solo registro en la Tabla de la BD
    @Transactional(readOnly=true)
    public Historia_clinica findById(Integer id) {
        return dao.findById(id).orElse(null);
    }
    
    //Creamos el método para buscar todos los registros en la Tabla de la BD
    @Transactional(readOnly=true)
    public List<Historia_clinica> findAll() {
        return (List<Historia_clinica>) dao.findAll();
    }
}
