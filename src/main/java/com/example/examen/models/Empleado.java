package com.example.examen.models;

import javax.persistence.*;

//Modelo para Empleado
@Entity
@Table(name="Empleado")
public class Empleado{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true , nullable = false )
    private Long id;
    private String nombre;
    private Integer n_Empleado;
    private Integer numeroseguro_s;
    private String turno;
    public String getNombre() {
        return nombre;
    }
    public String getTurno() {
        return turno;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }
    public Integer getNumeroseguro_s() {
        return numeroseguro_s;
    }
    public void setNumeroseguro_s(Integer numeroseguro_s) {
        this.numeroseguro_s = numeroseguro_s;
    }
    public Integer getN_Empleado() {
        return n_Empleado;
    }
    public void setN_Empleado(Integer n_Empleado) {
        this.n_Empleado = n_Empleado;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}