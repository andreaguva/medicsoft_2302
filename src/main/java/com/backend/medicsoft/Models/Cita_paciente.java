package com.backend.medicsoft.Models;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
// Para validar errores
//import javax.validation.constraints.NotEmpty;
//import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="cita_paciente")
public class Cita_paciente implements Serializable{

    @Id
    @Column(name="id_citapaciente")
    private int id_citapaciente;
    @ManyToOne
    @JoinColumn(name="id_horaatencion")//Solo para las llaves foráneas
    private Hora_atencion id_horaatencion;//De esta forma se representa la llave foránea, es decir, creando un objeto de la clase  
    @ManyToOne
    @JoinColumn(name="id_paciente")//Solo para las llaves foráneas
    private Paciente id_paciente;//De esta forma se representa la llave foránea, es decir, creando un objeto de la clase
    @Override
    public String toString() {
        return "Cita_paciente [id_citapaciente=" + id_citapaciente + ", id_horaatencion=" + id_horaatencion
                + ", id_paciente=" + id_paciente + "]";
    }
      
}
