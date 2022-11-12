package com.backend.bancog58.Service;

import com.backend.bancog58.Models.Medico;
import com.backend.bancog58.Dao.MedicoDao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service; 
import org.springframework.transaction.annotation.Transactional;


@Service
public class MedicoService {
    @Autowired
    private MedicoDao medicoDao;

    //Creamos el método para Guardar datos en la Tabla de la BD
    public Medico save(Medico medico) {
        return medicoDao.save(medico);
    }


    //Creamos el método para Eliminar datos en la Tabla de la BD
    @Transactional(readOnly=false)
    public void delete(String id) {
        medicoDao.deleteById(id);
    }


    //Creamos el método para buscar un solo registro en la Tabla de la BD
    @Transactional(readOnly=true)
    public Medico findById(String id) {
        return medicoDao.findById(id).orElse(null);
    }


    //Creamos el método para buscar todos los registros en la Tabla de la BD
    @Transactional(readOnly=true)
    public List<Medico> findAll() {
        return (List<Medico>) medicoDao.findAll();
    }
    
}
