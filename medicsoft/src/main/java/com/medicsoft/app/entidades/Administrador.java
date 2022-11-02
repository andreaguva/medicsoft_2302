package com.medicsoft.app.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//utilizando JPA para mapear la base de datos que voy a construir en la base de datos medicsoft//
@Entity
@Table(name="administrador")

public class Administrador {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Long idAdministrador;
	private String apellidos;
	private String nombres;
	private String tiodocumento;
	private Long numerodocumento;
	private String celular;
	private String email;
	
	public Administrador(Long idAdministrador, String apellidos, String nombres, String tiodocumento,
			Long numerodocumento, String celular, String email) {
		super();
		this.idAdministrador = idAdministrador;
		this.apellidos = apellidos;
		this.nombres = nombres;
		this.tiodocumento = tiodocumento;
		this.numerodocumento = numerodocumento;
		this.celular = celular;
		this.email = email;
	}

	public Long getIdAdministrador() {
		return idAdministrador;
	}

	public void setIdAdministrador(Long idAdministrador) {
		this.idAdministrador = idAdministrador;
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

	public String getTiodocumento() {
		return tiodocumento;
	}

	public void setTiodocumento(String tiodocumento) {
		this.tiodocumento = tiodocumento;
	}

	public Long getNumerodocumento() {
		return numerodocumento;
	}

	public void setNumerodocumento(Long numerodocumento) {
		this.numerodocumento = numerodocumento;
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
