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
@Table(name="usuario")
public class Usuario implements Serializable{
    //Creamos los atributos de la clase de acuerdo a los
    //Campos de la tabla en la BD    
    @Id      
    @Column(name="id_usuario")
    private int id_usuario;
    @NotEmpty(message = "El campo cedula no debe ser vacío")
    @Size(min = 8, max = 10,message = "El campo id_usuario debe tener mínimo 2 caracteres y máximo 6")
    @Column(name="cedula")
    private String cedula;
    @NotEmpty(message = "El campo nombres cliente no debe ser vacío")
    @Column(name="nombres")
    private String nombres;
    @NotEmpty(message = "El campo apellidos no debe ser vacío")
    @Column(name="apellidos")
    private String apellidos;
    @NotEmpty(message = "El campo telefono no debe ser vacío")
    @Column(name="telefono")
    private String telefono;
    @NotEmpty(message = "El campo genero no debe ser vacío")
    @Column(name="genero")
    private String genero;
    @NotEmpty(message = "El campo nombres cliente no debe ser vacío")
    @Size(min = 5, max = 10,message = "El campo clave debe tener mínimo 5 caracteres y máximo 10")
    @Column(name="clave")
    private String clave;
    @NotEmpty(message = "El campo rol no debe ser vacío")
    @Column(name="rol")
    private String rol;
    @Override
    public String toString() {
        return "Usuario [id_usuario=" + id_usuario + ", cedula=" + cedula + ", nombres=" + nombres + ", apellidos="
                + apellidos + ", telefono=" + telefono + ", genero=" + genero + ", clave=" + clave + ", rol=" + rol
                + "]";
    }
    
}
