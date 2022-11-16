package com.backend.medicsoft.Models;

import java.io.Serializable;
import java.util.Date;

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
@Table(name="paciente")
public class Paciente implements Serializable{

    @Id
    @NotEmpty(message = "El campo id_paciente no debe ser vacío")
    @Size(min = 2, max = 6,message = "El campo id_paciente debe tener mínimo 2 caracteres y máximo 6")
    @Column(name="id_paciente")
    private int id_paciente;
    @ManyToOne
    @JoinColumn(name="id_usuario")//Solo para las llaves foráneas
    private Usuario id_usuario; //De esta forma se representa la llave foránea, es decir, creando un objeto de la clase
    @Column(name="financiamiento")
    private Date financiamiento;
    @Override
    public String toString() {
        return "Paciente [id_paciente=" + id_paciente + ", id_usuario=" + id_usuario + ", financiamiento="
                + financiamiento + "]";
    }
    
    
}
