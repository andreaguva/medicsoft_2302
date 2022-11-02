package com.medicsoft.app.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicsoft.app.entidades.CitaMedica;
import com.medicsoft.app.repositorio.CitaMedicaRepository;

//anotacion de jpa de un servicio que va a manejar un crud que viene del html de los controladores que son los formularios creados//
@Service
public class CitaMedicaService {
	
	//se agrega la anotacion del repositorio con anotaacion de autowired//
	@Autowired
	CitaMedicaRepository citamedicaRepository;
	
	public List<CitaMedica> listar(){
		return (List<CitaMedica>)citamedicaRepository.findAll();
	}
	
	public CitaMedica obtenerPorId(Long id) {
		return citamedicaRepository.findById(id).get();
	}
	
	public void agregar(CitaMedica citamedica) {
		citamedicaRepository.save(citamedica);
	}
	
	public void actualizar(CitaMedica citamedica) {
		citamedicaRepository.save(citamedica);
	}
	
	public void eliminar(Long id) {
		citamedicaRepository.delete(obtenerPorId(id));
	}

}
