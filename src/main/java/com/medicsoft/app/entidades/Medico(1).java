package com.medicsoft.app.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//utilizando JPA para mapear la base de datos que voy a construir en la base de datos medicsoft//
@Entity
@Table(name="medico")

public class Medico {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private long id_medico;
	private long id_consultorio;
	private long id_especialidad;
	private String apellidos;
	private String nombres;
	private String celular;
	private String email;
	
	public Medico(long id_medico, long id_consultorio, long id_especialidad, String apellidos, String nombres,
			String celular, String email) {
		super();
		this.id_medico = id_medico;
		this.id_consultorio = id_consultorio;
		this.id_especialidad = id_especialidad;
		this.apellidos = apellidos;
		this.nombres = nombres;
		this.celular = celular;
		this.email = email;
	}

	public long getId_medico() {
		return id_medico;
	}

	public void setId_medico(long id_medico) {
		this.id_medico = id_medico;
	}

	public long getId_consultorio() {
		return id_consultorio;
	}

	public void setId_consultorio(long id_consultorio) {
		this.id_consultorio = id_consultorio;
	}

	public long getId_especialidad() {
		return id_especialidad;
	}

	public void setId_especialidad(long id_especialidad) {
		this.id_especialidad = id_especialidad;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	

}
