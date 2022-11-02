package com.medicsoft.app.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medicsoft.app.entidades.CitaMedica;
import com.medicsoft.app.servicio.CitaMedicaService;

@RestController
@RequestMapping("/api/citamedica")
public class CitaMedicaControladorApi {
	
	//se invoca el servicio que invoca la logica del negocio//
	@Autowired
	CitaMedicaService citamedicaService;
	
	@GetMapping("/Lista") //HTTP:GET
	public List<CitaMedica> listar(){
		return citamedicaService.listar();
	}
	
	@GetMapping("/obtenerPorId(id)") //HTTP:GET
	public CitaMedica obtenerPorId(@PathVariable("id") Long id) {
		return citamedicaService.obtenerPorId(id);
	}
	
	@PostMapping("/agregar") //HTTP:POST
	public void agregar(@RequestBody CitaMedica citamedica) {
		citamedicaService.agregar(citamedica);
	}
	
	@PutMapping("/actualizar") //HTTP:PUT
	public void actualizar(@RequestBody CitaMedica citamedica) {
		citamedicaService.actualizar(citamedica);
	}
	
	@DeleteMapping("/eliminar") //HTTP:DELETE
	public void eliminar(Long id) {
		citamedicaService.eliminar(id);
	}

}
