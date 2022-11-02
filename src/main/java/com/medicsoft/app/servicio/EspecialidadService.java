package com.medicsoft.app.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicsoft.app.entidades.Especialidad;
import com.medicsoft.app.repositorio.EspecialidadRepository;

//anotacion de jpa de un servicio que va a manejar un crud que viene del html de los controladores que son los formularios creados//
@Service
public class EspecialidadService {
	
	//se agrega la anotacion del repositorio con anotaacion de autowired//
	@Autowired
	EspecialidadRepository especialidadRepository;
	
	public List<Especialidad> listar(){
		return (List<Especialidad>)especialidadRepository.findAll();
	}
	
	public Especialidad obtenerPorId(Long id) {
		return especialidadRepository.findById(id).get();
	}
	
	public void agregar(Especialidad especialidad) {
		especialidadRepository.save(especialidad);
	}
	
	public void actualizar(Especialidad especialidad) {
		especialidadRepository.save(especialidad);
	}
	
	public void eliminar(Long id) {
		especialidadRepository.delete(obtenerPorId(id));
	}

}
