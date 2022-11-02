package com.medicsoft.app.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//utilizando JPA para mapear la base de datos que voy a construir en la base de datos medicsoft//
@Entity
@Table(name="especialidad")
public class Especialidad {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private long id_especialidad;
	private String nombre;
	
	public Especialidad(long id_especialidad, String nombre) {
		super();
		this.id_especialidad = id_especialidad;
		this.nombre = nombre;
	}

	public long getId_especialidad() {
		return id_especialidad;
	}

	public void setId_especialidad(long id_especialidad) {
		this.id_especialidad = id_especialidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
