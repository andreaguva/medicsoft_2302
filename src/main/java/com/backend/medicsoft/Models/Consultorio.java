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
//import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="consultorio")
public class Consultorio implements Serializable{

    @Id
    @Column(name="id_consultorio")
    private int id_consultorio;
    @NotEmpty(message = "El campo nombre no debe ser vacío")
    @Column(name="nombre")
    private String nombre;
    @ManyToOne
    @JoinColumn(name="id_especialidad")//Solo para las llaves foráneas
    private Especialidad id_especialidad; //De esta forma se representa la llave foránea, es decir, creando un objeto de la clase
    @Override
    public String toString() {
        return "Consultorio [id_consultorio=" + id_consultorio + ", nombre=" + nombre + ", id_especialidad="
                + id_especialidad + "]";
    }
    
}
