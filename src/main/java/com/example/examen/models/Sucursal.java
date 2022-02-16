package com.example.examen.models;

import javax.persistence.*;

@Entity
@Table(name="Sucursal")
public class Sucursal{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true , nullable = false )
    private Long id;
    private String ciudad;
    private String direccion;
    public String getCiudad() {
        return ciudad;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}