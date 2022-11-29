package com.backend.medicsoft.Models;

import org.hibernate.annotations.Immutable;
import org.hibernate.annotations.Subselect;
//import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

@Getter
@Setter
@Entity
@Immutable
@Table(name = "`historia_clinica`")
@Subselect("select * from historia_clinica")
public class Historia_clinica implements Serializable {
    @Id
    @Column(name="id_cita")
    private int id_cita;
    @Column(name="nom_paciente")
    private String nom_paciente;
    @Column(name="doc_paciente")
    private String doc_paciente;
    @Column(name="fecha_de_cita")
    private Date fecha_de_cita;
    @Column(name="hora_cita")
    private Time hora_cita;
    @Column(name="consultorio")
    private String consultorio;
    @Column(name="nom_medico")
    private String nom_medico;
    @Column(name="especialidad")
    private String especialidad;
    @Column(name="motivo_consulta")
    private String motivo_consulta;
    @Column(name="diagnostico")
    private String diagnostico;
    @Column(name="antecedentes")
    private String antecedentes;
    @Column(name="recomendaciones")
    private String recomendaciones;
    @Override
    public String toString() {
        return "Historia_clinica [id_cita=" + id_cita + ", nom_paciente=" + nom_paciente + ", doc_paciente="
                + doc_paciente + ", fecha_de_cita=" + fecha_de_cita + ", hora_cita=" + hora_cita + ", consultorio="
                + consultorio + ", nom_medico=" + nom_medico + ", especialidad=" + especialidad + ", motivo_consulta="
                + motivo_consulta + ", diagnostico=" + diagnostico + ", antecedentes=" + antecedentes
                + ", recomendaciones=" + recomendaciones + "]";
    }     
}
