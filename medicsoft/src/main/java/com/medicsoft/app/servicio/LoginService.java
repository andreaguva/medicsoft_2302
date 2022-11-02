package com.medicsoft.app.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicsoft.app.entidades.Login;
import com.medicsoft.app.repositorio.LoginRepository;

//anotacion de jpa de un servicio que va a manejar un crud que viene del html de los controladores que son los formularios creados//
@Service
public class LoginService {
	
	//se agrega la anotacion del repositorio con anotaacion de autowired//
	@Autowired
	LoginRepository loginRepository;
	
	public List<Login> listar(){
		return (List<Login>)loginRepository.findAll();
	}
	
	public Login obtenerPorId(Long id) {
		return loginRepository.findById(id).get();
	}
	
	public void agregar(Login login) {
		loginRepository.save(login);
	}
	
	public void actualizar(Login login) {
		loginRepository.save(login);
	}
	
	public void eliminar(Long id) {
		loginRepository.delete(obtenerPorId(id));
	}

}
