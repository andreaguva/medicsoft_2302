package com.backend.medicsoft.Models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
// Para validar errores
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="especialidad")
public class Especialidad implements Serializable {

    @Id
    @NotEmpty(message = "El campo id_especialidad no debe ser vacío")
    @Size(min = 2, max = 6,message = "El campo id_especialidad debe tener mínimo 2 caracteres y máximo 6")
    @Column(name="id_especialidad")
    private int id_especialidad;
    @Column(name="nombre")
    private String nombre;
    @Override
    public String toString() {
        return "Especialidad [id_especialidad=" + id_especialidad + ", nombre=" + nombre + "]";
    }
    
    
}
