package com.medicsoft.app.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//utilizando JPA para mapear la base de datos que voy a construir en la base de datos medicsoft//
@Entity
@Table(name="login")
public class Login {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Long idlogin;
	private String usuario;
	private String password;
	
	public Login(Long idlogin, String usuario, String password) {
		super();
		this.idlogin = idlogin;
		this.usuario = usuario;
		this.password = password;
	}

	public Long getIdlogin() {
		return idlogin;
	}

	public void setIdlogin(Long idlogin) {
		this.idlogin = idlogin;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
