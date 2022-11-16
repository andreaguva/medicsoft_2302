package com.medicsoft.app.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//JPA para mapear la tabla que voy a construir en la base de datos //
@Entity
@Table(name="Administrador")
public class Administrador {
	//Anotacion para generar autoinclementable dentro de la tabla//
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private long id_administrador;

	private String apellidossss;
	private String nombres;
	private String tipodocumento;
	private long documento;
	private String celular;
	private String email;
	//constructor//
	public Administrador(long id_administrador, String apellidos, String nombres, String tipodocumento, long documento,
			String celular, String email) {
		super();
		this.id_administrador = id_administrador;
		this.apellidos = apellidos;
		this.nombres = nombres;
		this.tipodocumento = tipodocumento;
		this.documento = documento;
		this.celular = celular;
		this.email = email;
	}
	//get y set//
	public long getId_administrador() {
		return id_administrador;
	}
	public void setId_administrador(long id_administrador) {
		this.id_administrador = id_administrador;
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
	public String getTipodocumento() {
		return tipodocumento;
	}
	public void setTipodocumento(String tipodocumento) {
		this.tipodocumento = tipodocumento;
	}
	public long getDocumento() {
		return documento;
	}
	public void setDocumento(long documento) {
		this.documento = documento;
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
