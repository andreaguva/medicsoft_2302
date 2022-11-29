package com.backend.medicsoft.Models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
import javax.persistence.Table;
// Para validar errores
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="paciente")
public class Paciente implements Serializable{

    @Id
    @Column(name="id_paciente")
    private int id_paciente;
    @NotEmpty(message = "El campo clave_paciente no debe ser vacío")
    @Size(min = 4, max = 150,message = "El campo clave_paciente debe tener mínimo 4 caracteres y máximo 150")    
    @Column(name="clave_paciente")
    private String clave_paciente;
    @NotEmpty(message = "El campo rol no debe ser vacío")    
    private String rol;
    @NotEmpty(message = "El campo documento_paciente no debe ser vacío")
    @Size(min = 8, max = 10,message = "El campo documento_paciente debe tener mínimo 8 caracteres y máximo 10")      
    @Column(name="documento_paciente")
    private String documento_paciente;
    @NotEmpty(message = "El campo nombre_paciente no debe ser vacío")         
    @Column(name="nombre_paciente")
    private String nombre_paciente;
    @NotEmpty(message = "El campo apellido_paciente no debe ser vacío")      
    @Column(name="apellido_paciente")
    private String apellido_paciente;
    @NotEmpty(message = "El campo tel_paciente no debe ser vacío")      
    @Column(name="tel_paciente")
    private String tel_paciente;
    @NotEmpty(message = "El campo email_paciente no debe ser vacío")      
    @Column(name="email_paciente")
    private String email_paciente;
    @NotEmpty(message = "El campo fnacim_paciente no debe ser vacío")      
    @Column(name="fnacim_paciente")
    private Date fnacim_paciente;
    @NotEmpty(message = "El campo genero_paciente no debe ser vacío")      
    @Column(name="genero_paciente")
    private String genero_paciente;
    @NotEmpty(message = "El campo ocupacion no debe ser vacío")      
    @Column(name="ocupacion")
    private String ocupacion;
    @NotEmpty(message = "El campo estado_civil no debe ser vacío")      
    @Column(name="estado_civil")
    private String estado_civil;
    @Override
    public String toString() {
        return "Paciente [id_paciente=" + id_paciente + ", clave_paciente=" + clave_paciente + ", rol=" + rol
                + ", documento_paciente=" + documento_paciente + ", nombre_paciente=" + nombre_paciente
                + ", apellido_paciente=" + apellido_paciente + ", tel_paciente=" + tel_paciente + ", email_paciente="
                + email_paciente + ", fnacim_paciente=" + fnacim_paciente + ", genero_paciente=" + genero_paciente
                + ", ocupacion=" + ocupacion + ", estado_civil=" + estado_civil + "]";
    }
    
}
