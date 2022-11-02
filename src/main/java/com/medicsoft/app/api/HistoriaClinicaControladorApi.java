package com.medicsoft.app.api;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medicsoft.app.entidades.HistoriaClinica;
import com.medicsoft.app.servicio.HistoriaClinicaService;

@RestController
@RequestMapping("/api/historiaclinica")
public class HistoriaClinicaControladorApi {
	
	HistoriaClinicaService historiaclinicaService;
	
	@GetMapping("/Lista") //HTTP:GET
	public List<HistoriaClinica> listar(){
		return historiaclinicaService.listar();
	}
	
	@GetMapping("/obtenerPorId(id)") //HTTP:GET
	public HistoriaClinica obtenerPorId(@PathVariable("id") Long id) {
		return historiaclinicaService.obtenerPorId(id);
	}
	
	@PostMapping("/agregar") //HTTP:POST
	public void agregar(@RequestBody HistoriaClinica historiaclinica) {
		historiaclinicaService.agregar(historiaclinica);
	}
	
	@PutMapping("/actualizar") //HTTP:PUT
	public void actualizar(@RequestBody HistoriaClinica historiaclinica) {
		historiaclinicaService.actualizar(historiaclinica);
	}
	
	@DeleteMapping("/eliminar") //HTTP:DELETE
	public void eliminar(Long id) {
		historiaclinicaService.eliminar(id);
	}

	

}
