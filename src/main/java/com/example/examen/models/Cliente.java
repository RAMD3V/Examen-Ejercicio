package com.example.examen.models;

import javax.persistence.*;

//Modelo para clientes
@Entity
@Table(name="Cliente")
public class Cliente{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true , nullable = false )
    private Long id;
    private String nombre;
    private String direccion;
    private Number telefono;
    public String getNombre() {
        return nombre;
    }

    public Number getTelefono() {
        return telefono;
    }

    public void setTelefono(Number telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    

}