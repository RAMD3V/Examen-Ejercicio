package com.example.examen.models;

import java.sql.Date;

import javax.persistence.*;

//Modelo para Cuentas corrientes
@Entity
@Table(name="Cuentas_Corrientes")
public class Cuentas_C{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true , nullable = false )
    private Long id;
    private String cliente;
    private Float cuenta;
    private Date fecha;
    private String tipo_material;
    public String getCliente() {
        return cliente;
    }
    public String getTipo_material() {
        return tipo_material;
    }
    public void setTipo_material(String tipo_material) {
        this.tipo_material = tipo_material;
    }
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public Float getCuenta() {
        return cuenta;
    }
    public void setCuenta(Float cuenta) {
        this.cuenta = cuenta;
    }
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
}