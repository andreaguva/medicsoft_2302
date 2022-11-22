package com.backend.medicsoft.Models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
// Para validar errores
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="medico")
public class Medico implements Serializable{

    @Id      
    @Column(name="id_medico")
    private int id_medico;          
    @NotEmpty(message = "El campo clave_medico no debe ser vacío")
    @Size(min = 4, max = 10,message = "El campo clave_medico debe tener mínimo 4 caracteres y máximo 10")    
    @Column(name="clave_medico")
    private String clave_medico;
    @NotEmpty(message = "El campo rol no debe ser vacío")
    @Size(min = 1, max = 1,message = "El campo rol debe tener mínimo 1 caracteres y máximo 1")      
    @Column(name="rol")
    private String rol;
    @NotEmpty(message = "El campo registro_medico no debe ser vacío")
    @Column(name="registro_medico")
    private String registro_medico;    
    @NotEmpty(message = "El campo nombre_medico no debe ser vacío")          
    @Column(name="nombre_medico")
    private String nombre_medico;
    @NotEmpty(message = "El campo apellido_paciente no debe ser vacío")      
    @Column(name="apellido_medico")
    private String apellido_medico;
    @NotEmpty(message = "El campo tel_paciente no debe ser vacío")      
    @Column(name="tel_medico")
    private String tel_medico;
    @NotEmpty(message = "El campo email_paciente no debe ser vacío")      
    @Column(name="email_medico")
    private String email_medico;
    @ManyToOne
    @JoinColumn(name="id_especialidad")//Solo para las llaves foráneas
    private Especialidad id_especialidad; //De esta forma se representa la llave foránea, es decir, creando un objeto de la clase 
    @Override
    public String toString() {
        return "Medico [id_medico=" + id_medico + ", clave_medico=" + clave_medico + ", rol=" + rol
                + ", registro_medico=" + registro_medico + ", nombre_medico=" + nombre_medico + ", apellido_medico="
                + apellido_medico + ", tel_medico=" + tel_medico + ", email_medico=" + email_medico
                + ", id_especialidad=" + id_especialidad + "]";
    }
    
}
