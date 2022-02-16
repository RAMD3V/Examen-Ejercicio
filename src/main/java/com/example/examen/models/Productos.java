package com.example.examen.models;

import javax.persistence.*;

@Entity
@Table(name="Productos")
public class Productos{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true , nullable = false )
    private Long id;
    private String nombre;
    private Float precio;
    private Float cantidad;//Al ser materiales varia la cantidad
    private String tipo_material;


    public Float getCantidad() {
        return cantidad;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public void setCantidad(Float cantidad) {
        this.cantidad = cantidad;
    }

    public String getTipo_material() {
        return tipo_material;
    }
    public void setTipo_material(String tipo_material) {
        this.tipo_material = tipo_material;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}