package com.backend.medicsoft.Service;

import com.backend.medicsoft.Models.Usuario;
import com.backend.medicsoft.Dao.UsuarioDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioDao objDao;
    
    //Creamos el método para Guardar datos en la Tabla de la BD
    public Usuario save(Usuario dato){
        return objDao.save(dato);
    }

    //Creamos el método para Eliminar datos en la Tabla de la BD
    @Transactional(readOnly=false)
    public void delete(Integer id) {
        objDao.deleteById(id);
    }

    //Creamos el método para buscar un solo registro en la Tabla de la BD
    @Transactional(readOnly=true)
    public Usuario findById(Integer id) {
        return objDao.findById(id).orElse(null);
    }

    //Creamos el método para buscar todos los registros en la Tabla de la BD
    @Transactional(readOnly=true)
    public List<Usuario> findAll() {
        return (List<Usuario>) objDao.findAll();
    }

    

}
