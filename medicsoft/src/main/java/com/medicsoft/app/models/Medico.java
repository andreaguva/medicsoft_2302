package com.backend.bancog58.Models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="medico")
public class Medico implements Serializable{
   @Id
   @Column(name="id_medico")
   private Interger id_medico;
   @Column(name="cedula")
   private BigInteger cedula;
   @Column(name="nombre")
   private String nombre;
   @Column(name="apellidos")
   private String apellidos;
   @Column(name="telefono")
   private String telefono;
   @Column(name="genero")
   private String genero;
   @ManyToOne
   @JoinColumn(name="id_consultorio")//Solo para las llaves foráneas
   private Consultorio consultorio; //De esta forma se representa la llave foránea, es decir, creando un objeto de la clase
   @JoinColumn(name="id_especialidad")//Solo para las llaves foráneas
   private Especialidad especialidad; //De esta forma se representa la llave foránea, es decir, creando un objeto de la clase


   @Override
    public String toString() {
        return "medico [consultorio=" + consultorio + especialidad=" + especialidad +", id_medico=" + id_medico"
            + ",cedula=" + cedula + ", nombre=" + nombre + ",cedula=" + cedula + ", ",apellidos=" + apellidos + ", ",genero=" + genero + "]";
    }

}
