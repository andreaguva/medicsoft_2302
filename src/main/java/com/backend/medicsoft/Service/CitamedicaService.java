package com.backend.medicsoft.Service;

import com.backend.medicsoft.Models.Citamedica;
import com.backend.medicsoft.Dao.CitamedicaDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CitamedicaService {

    @Autowired
    private CitamedicaDao objDao;
    
    //Creamos el método para Guardar datos en la Tabla de la BD
    public Citamedica save(Citamedica dato){
        return objDao.save(dato);
    }

    //Creamos el método para Eliminar datos en la Tabla de la BD
    @Transactional(readOnly=false)
    public void delete(Integer id) {
        objDao.deleteById(id);
    }

    //Creamos el método para buscar un solo registro en la Tabla de la BD
    @Transactional(readOnly=true)
    public Citamedica findById(Integer id) {
        return objDao.findById(id).orElse(null);
    }

    //Creamos el método para buscar todos los registros en la Tabla de la BD
    @Transactional(readOnly=true)
    public List<Citamedica> findAll() {
        return (List<Citamedica>) objDao.findAll();
    }
    
}
