package com.medicsoft.app.servicio;

import java.util.List;

import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;
import com.medicsoft.app.entidades.HistoriaClinica;
import com.medicsoft.app.repositorio.HistoriaClinicaRepository;

//anotacion de jpa de un servicio que va a manejar un crud que viene del html de los controladores que son los formularios creados//
@Service
public class HistoriaClinicaService {
	
	//se agrega la anotacion del repositorio con anotaacion de autowired//
	@Autowired
	HistoriaClinicaRepository historiaclinicaRepository;
	public List<HistoriaClinica> listar(){
		return (List<HistoriaClinica>)historiaclinicaRepository.findAll();
	}
	
	public HistoriaClinica obtenerPorId(Long id) {
		return historiaclinicaRepository.findById(id).get();
	}
	
	public void agregar(HistoriaClinica historiaclinica) {
		historiaclinicaRepository.save(historiaclinica);
	}
	
	public void actualizar(HistoriaClinica historiaclinica) {
		historiaclinicaRepository.save(historiaclinica);
	}
	
	public void eliminar(Long id) {
		historiaclinicaRepository.delete(obtenerPorId(id));
	}

}
