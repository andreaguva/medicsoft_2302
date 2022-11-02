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

import com.medicsoft.app.entidades.Especialidad;
import com.medicsoft.app.servicio.EspecialidadService;

@RestController
@RequestMapping("/api/especialidad")
public class EspecialidadControladorApi {
	
	//se invoca el servicio que invoca la logica del negocio//
	@Autowired
	EspecialidadService especialidadService;
	
	@GetMapping("/Lista") //HTTP:GET
	public List<Especialidad> listar(){
		return especialidadService.listar();
	}
	
	@GetMapping("/obtenerPorId(id)") //HTTP:GET
	public Especialidad obtenerPorId(@PathVariable("id") Long id) {
		return especialidadService.obtenerPorId(id);
	}
	
	@PostMapping("/agregar") //HTTP:POST
	public void agregar(@RequestBody Especialidad especialidad) {
		especialidadService.agregar(especialidad);
	}
	
	@PutMapping("/actualizar") //HTTP:PUT
	public void actualizar(@RequestBody Especialidad especialidad) {
		especialidadService.actualizar(especialidad);
	}
	
	@DeleteMapping("/eliminar") //HTTP:DELETE
	public void eliminar(Long id) {
		especialidadService.eliminar(id);
	}
	
}
