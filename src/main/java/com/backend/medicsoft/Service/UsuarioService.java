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
    private UsuarioDao dao;
    
    //Creamos el método para Guardar datos en la Tabla de la BD
    public Usuario save(Usuario objeto){
        return dao.save(objeto);
    }

    //Creamos el método para Eliminar datos en la Tabla de la BD
    @Transactional(readOnly=false)
    public void delete(Integer id) {
        dao.deleteById(id);
    }

    //Creamos el método para buscar un solo registro en la Tabla de la BD
    @Transactional(readOnly=true)
    public Usuario findById(Integer id) {
        return dao.findById(id).orElse(null);
    }

    //Creamos el método para buscar todos los registros en la Tabla de la BD
    @Transactional(readOnly=true)
    public List<Usuario> findAll() {
        return (List<Usuario>) dao.findAll();
    }

    //@Transactional(readOnly=true)
    //public Usuario login(String usuario, String clave) {
        //return dao.login(usuario, clave);
    //}

}
