package com.backend.bancog58.Service;

import com.backend.bancog58.Models.HistoriaClinica;
import com.backend.bancog58.Dao.HistoriaClinicaDao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service; 
import org.springframework.transaction.annotation.Transactional;


@Service
public class HistoriaClinicaService {
    @Autowired
    private HistoriaClinicaDao historiaClinicaDao;

    //Creamos el método para Guardar datos en la Tabla de la BD
    public HistoriaClinica save(HistoriaClinica historiaClinica) {
        return historiaClinicaDao.save(historiaClinica);
    }


    //Creamos el método para Eliminar datos en la Tabla de la BD
    @Transactional(readOnly=false)
    public void delete(String id) {
        historiaClinicaDao.deleteById(id);
    }


    //Creamos el método para buscar un solo registro en la Tabla de la BD
    @Transactional(readOnly=true)
    public HistoriaClinica findById(String id) {
        return historiaClinicaDao.findById(id).orElse(null);
    }


    //Creamos el método para buscar todos los registros en la Tabla de la BD
    @Transactional(readOnly=true)
    public List<HistoriaClinica> findAll() {
        return (List<HistoriaClinica>) historiaClinicaDao.findAll();
    }
    
}
