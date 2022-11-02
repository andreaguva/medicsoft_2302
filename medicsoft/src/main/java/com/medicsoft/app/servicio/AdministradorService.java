package com.medicsoft.app.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicsoft.app.entidades.Administrador;
import com.medicsoft.app.repositorio.AdministradorRepository;

//anotacion de jpa de un servicio que va a manejar un crud que viene del html de los controladores que son los formularios creados//
@Service
public class AdministradorService {
	
	//se agrega la anotacion del repositorio con anotacion de autowired//
	@Autowired
	AdministradorRepository administradorRepository;
	
	public List<Administrador> listar(){
		return (List<Administrador>)administradorRepository.findAll();
	}
	
	public Administrador obtenerPorId(Long id) {
		return administradorRepository.findById(id).get();
	}
	
	public void agregar(Administrador administrador) {
		administradorRepository.save(administrador);
	}
	
	public void actualizar(Administrador administrador) {
		administradorRepository.save(administrador);
	}

	public void eliminar(Long id) {
		// TODO Auto-generated method stub
		
	}

}
