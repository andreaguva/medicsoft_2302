package com.backend.medicsoft.Models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
import javax.persistence.Table;
// Para validar errores
import javax.validation.constraints.NotEmpty;
//import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="administrador")
public class Administrador implements Serializable{

    @Id
    @Column(name="id_administrador")
    private int id_administrador;
    @NotEmpty(message = "El campo clave_paciente no debe ser vacío")
    @Column(name="documento_administrador")
    private String documento_administrador;
    @Column(name="clave_administrador")
    @NotEmpty(message = "El campo clave_paciente no debe ser vacío")
    private String clave_administrador;
    @NotEmpty(message = "El campo clave_paciente no debe ser vacío")
    private String rol;
    @Override
    public String toString() {
        return "Administrador [id_administrador=" + id_administrador + ", documento_administrador="
                + documento_administrador + ", clave_administrador=" + clave_administrador + ", rol=" + rol + "]";
    }
    
       
}
