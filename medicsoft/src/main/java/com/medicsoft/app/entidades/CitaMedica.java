package com.medicsoft.app.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//utilizando JPA para mapear la base de datos que voy a construir en la base de datos medicsoft//
@Entity
@Table(name="citamedica")

public class CitaMedica {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private long id_consultorio;
	private long id_medico;
	private long id_paciente;
	private String fecha;
	private Integer horainicial;
	private Integer horafinal;
	private String especialidad;
	private String consultorio;
	
	public CitaMedica(long id_consultorio, long id_medico, long id_paciente, String fecha, Integer horainicial,
			Integer horafinal, String especialidad, String consultorio) {
		super();
		this.id_consultorio = id_consultorio;
		this.id_medico = id_medico;
		this.id_paciente = id_paciente;
		this.fecha = fecha;
		this.horainicial = horainicial;
		this.horafinal = horafinal;
		this.especialidad = especialidad;
		this.consultorio = consultorio;
	}

	public long getId_consultorio() {
		return id_consultorio;
	}

	public void setId_consultorio(long id_consultorio) {
		this.id_consultorio = id_consultorio;
	}

	public long getId_medico() {
		return id_medico;
	}

	public void setId_medico(long id_medico) {
		this.id_medico = id_medico;
	}

	public long getId_paciente() {
		return id_paciente;
	}

	public void setId_paciente(long id_paciente) {
		this.id_paciente = id_paciente;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public Integer getHorainicial() {
		return horainicial;
	}

	public void setHorainicial(Integer horainicial) {
		this.horainicial = horainicial;
	}

	public Integer getHorafinal() {
		return horafinal;
	}

	public void setHorafinal(Integer horafinal) {
		this.horafinal = horafinal;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public String getConsultorio() {
		return consultorio;
	}

	public void setConsultorio(String consultorio) {
		this.consultorio = consultorio;
	}

}
