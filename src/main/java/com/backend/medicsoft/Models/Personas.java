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

@Getter
@Setter
@Entity
@Immutable
@Table(name = "`personas`")
@Subselect("select * from personas")
public class Personas implements Serializable {
    @Id
    @Column(name="documento")
    private String documento;
    @Column(name="clave")
    private String clave;
    @Column(name="rol")
    private String rol;
    @Override
    public String toString() {
        return "Personas [documento=" + documento + ", clave=" + clave + ", rol=" + rol + "]";
    }
}