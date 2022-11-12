package com.backend.medicsoft.Models;
//simport java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="historia")
public class Historiaclinica {
@Id

@NotEmpty(message = "El campo identificador de la cuenta no debe ser vacío")
@Size(min = 2, max = 6,message = "El campo id_historia debe tener mínimo 2 caracteres y máximo 6")
@Column(name="id_historia")
private int   id_historia ;

@ManyToOne
@JoinColumn(name="id_paciente")//Solo para las llaves foráneas
private Paciente id_paciente; //De esta forma se representa la llave foránea, es decir, creando un objeto de la clase

@ManyToOne
@JoinColumn(name="id_medico")//Solo para las llaves foráneas
private Medico id_medico; //De esta forma se representa la llave foránea, es decir, creando un objeto de la clase

@NotEmpty(message = "El campo fecha no debe ser vacío")
@Column(name="fecha")
private Date      fecha;

@NotEmpty(message = "El campo edad no debe ser vacío")
@Column(name="edad")
private int edad ;

@NotEmpty(message = "El campo ocupacion no debe ser vacío")
@Column(name="ocupacion")
private String  ocupacion ;

@NotEmpty(message = "El campo estado civiil no debe ser vacío")
@Column(name="estadocivil")
private String   estadocivil ;

@NotEmpty(message = "El campo motivo de cita no debe ser vacío")
@Column(name="motivocita")
private String   motivocita ;

@NotEmpty(message = "El campo enfermedad no debe ser vacío")

@Column(name="enfermedad")
private String     enfermedad ;

@Column(name="antecedentes")
private String   antecedentes ;

@Column(name="observaciones")
private String   observaciones;
@Override

public String toString() {
    return "Historiaclinica [id_historia=" + id_historia + ", id_paciente=" + id_paciente + ", id_medico=" + id_medico
            + ", fecha=" + fecha + ", edad=" + edad + ", ocupacion=" + ocupacion + ", estadocivil=" + estadocivil
            + ", motivocita=" + motivocita + ", enfermedad=" + enfermedad + ", antecedentes=" + antecedentes
            + ", observaciones=" + observaciones + "]";
}


}
