package com.backend.medicsoft.Models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
    @Column(name="nom_consultorio")
    private String nom_consultorio;
    @Override
    public String toString() {
        return "Consultorio [id_consultorio=" + id_consultorio + ", nom_consultorio=" + nom_consultorio + "]";
    }
    
    
}
