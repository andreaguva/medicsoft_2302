package com.medicsoft.app.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//JPA para mapear la tabla que voy a construir en la base de datos //
@Entity
@Table(name="citamedica")
public class CitaMedica {
	//Anotacion para generar autoinclementable dentro de la tabla//
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id_consultorio;
	private String id_medico;
	private String id_paciente;
	private String fecha;
	private long horainicial;
	private long horafinal;
	private String especialidad;
	
	//constructor//
	public CitaMedica(long id_consultorio, String id_medico, String id_paciente, String fecha, long horainicial,
			long horafinal, String especialidad) {
		super();
		this.id_consultorio = id_consultorio;
		this.id_medico = id_medico;
		this.id_paciente = id_paciente;
		this.fecha = fecha;
		this.horainicial = horainicial;
		this.horafinal = horafinal;
		this.especialidad = especialidad;
	}
	
	//get y set//
	public long getId_consultorio() {
		return id_consultorio;
	}
	public void setId_consultorio(long id_consultorio) {
		this.id_consultorio = id_consultorio;
	}
	public String getId_medico() {
		return id_medico;
	}
	public void setId_medico(String id_medico) {
		this.id_medico = id_medico;
	}
	public String getId_paciente() {
		return id_paciente;
	}
	public void setId_paciente(String id_paciente) {
		this.id_paciente = id_paciente;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public long getHorainicial() {
		return horainicial;
	}
	public void setHorainicial(long horainicial) {
		this.horainicial = horainicial;
	}
	public long getHorafinal() {
		return horafinal;
	}
	public void setHorafinal(long horafinal) {
		this.horafinal = horafinal;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

}
