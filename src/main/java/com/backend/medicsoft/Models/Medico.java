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
    @NotEmpty(message = "El campo id_medico no debe ser vacío")
    @Size(min = 2, max = 6,message = "El campo id_medico debe tener mínimo 2 caracteres y máximo 6")
    @Column(name="id_medico")
    private int id_medico;
    @ManyToOne
    @JoinColumn(name="id_usuario")//Solo para las llaves foráneas
    private Usuario id_usuario; //De esta forma se representa la llave foránea, es decir, creando un objeto de la clase
    @ManyToOne
    @JoinColumn(name="id_especialidad")//Solo para las llaves foráneas
    private Especialidad id_especialidad; //De esta forma se representa la llave foránea, es decir, creando un objeto de la clase    
    @ManyToOne
    @JoinColumn(name="id_consultorio")//Solo para las llaves foráneas
    private Consultorio id_consultorio; //De esta forma se representa la llave foránea, es decir, creando un objeto de la clase
    @NotEmpty(message = "El campo registro no debe ser vacío")
    @Column(name="registro")
    private String registro;
    @Override
    public String toString() {
        return "Medico [id_medico=" + id_medico + ", id_usuario=" + id_usuario + ", id_especialidad=" + id_especialidad
                + ", id_consultorio=" + id_consultorio + ", registro=" + registro + "]";
    }
    
}
