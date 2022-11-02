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

import com.medicsoft.app.entidades.Paciente;
import com.medicsoft.app.servicio.PacienteService;

@RestController
@RequestMapping("/api/paciente")
public class PacienteControladorApi {
	
	//se invoca el servicio que invoca la logica del negocio//
	@Autowired
	
PacienteService pacienteService;
	
	@GetMapping("/Lista") //HTTP:GET
	public List<Paciente> listar(){
		return pacienteService.listar();
	}
	
	@GetMapping("/obtenerPorId(id)") //HTTP:GET
	public Paciente obtenerPorId(@PathVariable("id") Long id) {
		return pacienteService.obtenerPorId(id);
	}
	
	@PostMapping("/agregar") //HTTP:POST
	public void agregar(@RequestBody Paciente paciente) {
		pacienteService.agregar(paciente);
	}
	
	@PutMapping("/actualizar") //HTTP:PUT
	public void actualizar(@RequestBody Paciente paciente) {
		pacienteService.actualizar(paciente);
	}
	
	@DeleteMapping("/eliminar") //HTTP:DELETE
	public void eliminar(Long id) {
		pacienteService.eliminar(id);
	}

}
