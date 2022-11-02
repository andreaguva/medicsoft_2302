package com.medicsoft.app.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//utilizando JPA para mapear la base de datos que voy a construir en la base de datos medicsoft//
@Entity
@Table(name="paciente")
public class Paciente {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private long id_paciente;
	private String tipoidpaciente;
	private String numeroidentificacion;
	private String apellidos;
	private String nombres;
	private String direccion;
	private String email;
	private String fechanicimiento;
	private String genero;
	
	public Paciente(long id_paciente, String tipoidpaciente, String numeroidentificacion, String apellidos,
			String nombres, String direccion, String email, String fechanicimiento, String genero) {
		super();
		this.id_paciente = id_paciente;
		this.tipoidpaciente = tipoidpaciente;
		this.numeroidentificacion = numeroidentificacion;
		this.apellidos = apellidos;
		this.nombres = nombres;
		this.direccion = direccion;
		this.email = email;
		this.fechanicimiento = fechanicimiento;
		this.genero = genero;
	}

	public long getId_paciente() {
		return id_paciente;
	}

	public void setId_paciente(long id_paciente) {
		this.id_paciente = id_paciente;
	}

	public String getTipoidpaciente() {
		return tipoidpaciente;
	}

	public void setTipoidpaciente(String tipoidpaciente) {
		this.tipoidpaciente = tipoidpaciente;
	}

	public String getNumeroidentificacion() {
		return numeroidentificacion;
	}

	public void setNumeroidentificacion(String numeroidentificacion) {
		this.numeroidentificacion = numeroidentificacion;
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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFechanicimiento() {
		return fechanicimiento;
	}

	public void setFechanicimiento(String fechanicimiento) {
		this.fechanicimiento = fechanicimiento;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

}
