package com.medicsoft.app.servicio;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.medicsoft.app.entidades.Administrador;
import com.medicsoft.app.repositorio.AdministradorRepository;
@Service
public class AdministradorService {
	
	@Autowired
	AdministradorRepository administradorrepositiry;
	public List<Administrador>listar(){
		return (List<Administrador>)administradorrepositiry.findAll();
	}
	
	public Administrador obtenerPorId(Long id) {
		return administradorrepositiry.findById(id).get() ;
	}
	
	public void agregar(Administrador administrador) {
		administradorrepositiry.save(administrador);
	}
	
	public void actualizar(Administrador administrador) {
		administradorrepositiry.save(administrador);
	}
	
	public void eliminar(Long id) {
		administradorrepositiry.delete(obtenerPorId(id));
	}

}
