package com.medicsoft.app.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//utilizando JPA para mapear la base de datos que voy a construir en la base de datos medicsoft//
@Entity
@Table(name="consultorio")
public class Consultorio {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private long idconsultorio;
	private String nombre;
	private String ubicacion;
	private String id_especialidad;
	
	public Consultorio(long idconsultorio, String nombre, String ubicacion, String id_especialidad) {
		super();
		this.idconsultorio = idconsultorio;
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.id_especialidad = id_especialidad;
	}

	public long getIdconsultorio() {
		return idconsultorio;
	}

	public void setIdconsultorio(long idconsultorio) {
		this.idconsultorio = idconsultorio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getId_especialidad() {
		return id_especialidad;
	}

	public void setId_especialidad(String id_especialidad) {
		this.id_especialidad = id_especialidad;
	}

}
