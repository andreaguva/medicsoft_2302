package com.medicsoft.app.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//utilizando JPA para mapear la base de datos que voy a construir en la base de datos medicsoft//
@Entity
@Table(name="historiaclinica")

public class HistoriaClinica {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Long id_historia;
	private String fechaingre;
	private Long id_paciente;
	private int edad;
	private String ocupacion;
	private String esdadocivil;
	private String nacionalidad;
	private String dirresidencia;
	private String gradoinstruccion;
	private String motivocita;
	private String enfermedadactual;
	private String antecedentemalestar;
	private String antecedentefamiliar;
	private String antecedentepersonal;
	private String habitosfisiologicos;
	private String idmedico;
	
	public HistoriaClinica(Long id_historia, String fechaingre, Long id_paciente, int edad, String ocupacion,
			String esdadocivil, String nacionalidad, String dirresidencia, String gradoinstruccion, String motivocita,
			String enfermedadactual, String antecedentemalestar, String antecedentefamiliar, String antecedentepersonal,
			String habitosfisiologicos, String idmedico) {
		super();
		this.id_historia = id_historia;
		this.fechaingre = fechaingre;
		this.id_paciente = id_paciente;
		this.edad = edad;
		this.ocupacion = ocupacion;
		this.esdadocivil = esdadocivil;
		this.nacionalidad = nacionalidad;
		this.dirresidencia = dirresidencia;
		this.gradoinstruccion = gradoinstruccion;
		this.motivocita = motivocita;
		this.enfermedadactual = enfermedadactual;
		this.antecedentemalestar = antecedentemalestar;
		this.antecedentefamiliar = antecedentefamiliar;
		this.antecedentepersonal = antecedentepersonal;
		this.habitosfisiologicos = habitosfisiologicos;
		this.idmedico = idmedico;
	}

	public Long getId_historia() {
		return id_historia;
	}

	public void setId_historia(Long id_historia) {
		this.id_historia = id_historia;
	}

	public String getFechaingre() {
		return fechaingre;
	}

	public void setFechaingre(String fechaingre) {
		this.fechaingre = fechaingre;
	}

	public Long getId_paciente() {
		return id_paciente;
	}

	public void setId_paciente(Long id_paciente) {
		this.id_paciente = id_paciente;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getOcupacion() {
		return ocupacion;
	}

	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}

	public String getEsdadocivil() {
		return esdadocivil;
	}

	public void setEsdadocivil(String esdadocivil) {
		this.esdadocivil = esdadocivil;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getDirresidencia() {
		return dirresidencia;
	}

	public void setDirresidencia(String dirresidencia) {
		this.dirresidencia = dirresidencia;
	}

	public String getGradoinstruccion() {
		return gradoinstruccion;
	}

	public void setGradoinstruccion(String gradoinstruccion) {
		this.gradoinstruccion = gradoinstruccion;
	}

	public String getMotivocita() {
		return motivocita;
	}

	public void setMotivocita(String motivocita) {
		this.motivocita = motivocita;
	}

	public String getEnfermedadactual() {
		return enfermedadactual;
	}

	public void setEnfermedadactual(String enfermedadactual) {
		this.enfermedadactual = enfermedadactual;
	}

	public String getAntecedentemalestar() {
		return antecedentemalestar;
	}

	public void setAntecedentemalestar(String antecedentemalestar) {
		this.antecedentemalestar = antecedentemalestar;
	}

	public String getAntecedentefamiliar() {
		return antecedentefamiliar;
	}

	public void setAntecedentefamiliar(String antecedentefamiliar) {
		this.antecedentefamiliar = antecedentefamiliar;
	}

	public String getAntecedentepersonal() {
		return antecedentepersonal;
	}

	public void setAntecedentepersonal(String antecedentepersonal) {
		this.antecedentepersonal = antecedentepersonal;
	}

	public String getHabitosfisiologicos() {
		return habitosfisiologicos;
	}

	public void setHabitosfisiologicos(String habitosfisiologicos) {
		this.habitosfisiologicos = habitosfisiologicos;
	}

	public String getIdmedico() {
		return idmedico;
	}

	public void setIdmedico(String idmedico) {
		this.idmedico = idmedico;
	}
		
	

}
