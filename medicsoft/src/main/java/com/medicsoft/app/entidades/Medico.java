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
	private String tipodocumento;
	private String fechanacimiento;
	private Integer edad;
	private String genero;
	private String apellidos;
	private String nombres;
	private String celular;
	private String email;
	private String password;
	
	//constuctor
	public Medico(long id_medico, long id_consultorio, long id_especialidad, String tipodocumento,
			String fechanacimiento, Integer edad, String genero, String apellidos, String nombres, String celular,
			String email, String password) {
		super();
		this.id_medico = id_medico;
		this.id_consultorio = id_consultorio;
		this.id_especialidad = id_especialidad;
		this.tipodocumento = tipodocumento;
		this.fechanacimiento = fechanacimiento;
		this.edad = edad;
		this.genero = genero;
		this.apellidos = apellidos;
		this.nombres = nombres;
		this.celular = celular;
		this.email = email;
		this.password = password;
	}

	// getters y setters
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

	public String getTipodocumento() {
		return tipodocumento;
	}

	public void setTipodocumento(String tipodocumento) {
		this.tipodocumento = tipodocumento;
	}

	public String getFechanacimiento() {
		return fechanacimiento;
	}

	public void setFechanacimiento(String fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
		
}
