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
@Table(name="historia")
public class Historia implements Serializable{

    @Id     
    @Column(name="id_historia")
    private int id_historia;
    @ManyToOne
    @JoinColumn(name="id_cita")//Solo para las llaves foráneas
    private Citamedica id_cita; //De esta forma se representa la llave foránea, es decir, creando un objeto de la clase   
    @NotEmpty(message = "El campo motivocita no debe ser vacío")
    @Column(name="motivocita")
    private String motivocita;
    @NotEmpty(message = "El campo enfermedad no debe ser vacío")
    @Column(name="enfermedad")
    private String enfermedad;
    @NotEmpty(message = "El campo antecedentes no debe ser vacío")
    @Column(name="antecedentes")
    private String antecedentes;
    @NotEmpty(message = "El campo observaciones no debe ser vacío")
    @Column(name="observaciones")
    private String observaciones;
    @Override
    public String toString() {
        return "Historia [id_historia=" + id_historia + ", id_cita=" + id_cita + ", motivocita=" + motivocita
                + ", enfermedad=" + enfermedad + ", antecedentes=" + antecedentes + ", observaciones=" + observaciones
                + "]";
    }
    
    
}
