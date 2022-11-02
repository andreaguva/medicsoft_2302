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

import com.medicsoft.app.entidades.Login;
import com.medicsoft.app.servicio.LoginService;

@RestController
@RequestMapping("/api/login")
public class LoginControladorApi {
	
	//se invoca el servicio que invoca la logica del negocio//
	@Autowired
	LoginService loginService;
	
	@GetMapping("/Lista") //HTTP:GET
	public List<Login> listar(){
		return loginService.listar();
	}
	
	@GetMapping("/obtenerPorId(id)") //HTTP:GET
	public Login obtenerPorId(@PathVariable("id") Long id) {
		return loginService.obtenerPorId(id);
	}
	
	@PostMapping("/agregar") //HTTP:POST
	public void agregar(@RequestBody Login login) {
		loginService.agregar(login);
	}
	
	@PutMapping("/actualizar") //HTTP:PUT
	public void actualizar(@RequestBody Login login) {
		loginService.actualizar(login);
	}
	
	@DeleteMapping("/eliminar") //HTTP:DELETE
	public void eliminar(Long id) {
		loginService.eliminar(id);
	}

}
