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
@Table(name="citamedica")
public class Citamedica implements Serializable {

    //Creamos los atributos de la clase de acuerdo a los
    //Campos de la tabla en la BD
    
    @Id
    @NotEmpty(message = "El campo id_cita no debe ser vacío")
    @Size(min = 2, max = 6,message = "El campo id_cita debe tener mínimo 2 caracteres y máximo 6")
    @Column(name="id_cita")
    private int id_cita;
    @ManyToOne
    @JoinColumn(name="id_especialidad")//Solo para las llaves foráneas
    private Especialidad id_especialidad; //De esta forma se representa la llave foránea, es decir, creando un objeto de la clase
    @ManyToOne
    @JoinColumn(name="id_medico")//Solo para las llaves foráneas
    private Medico id_medico; //De esta forma se representa la llave foránea, es decir, creando un objeto de la clase
    @ManyToOne
    @JoinColumn(name="id_consultorio")//Solo para las llaves foráneas
    private Consultorio id_consultorio; //De esta forma se representa la llave foránea, es decir, creando un objeto de la clase    
    @ManyToOne
    @JoinColumn(name="id_paciente")//Solo para las llaves foráneas
    private Paciente id_paciente; //De esta forma se representa la llave foránea, es decir, creando un objeto de la clase
    @NotEmpty(message = "El campo fecha no debe ser vacío")
    @Column(name="fecha")
    private Date fecha;
    @NotEmpty(message = "El campo horainicial no debe ser vacío")
    @Column(name="horainicial")
    private String horainicial;
    @NotEmpty(message = "El campo horafinal no debe ser vacío")
    @Column(name="horafinal")
    private String horafinal;
    @Override
    public String toString() {
        return "Citamedica [id_cita=" + id_cita + ", id_especialidad=" + id_especialidad + ", id_medico=" + id_medico
                + ", id_consultorio=" + id_consultorio + ", id_paciente=" + id_paciente + ", fecha=" + fecha
                + ", horainicial=" + horainicial + ", horafinal=" + horafinal + "]";
    }
}
