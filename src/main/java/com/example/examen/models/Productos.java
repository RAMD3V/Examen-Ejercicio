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
    private Integer precio;
    private Integer cantidad;
    private String tipo_material;
    public Integer getPrecio() {
        return precio;
    }
    public Integer getCantidad() {
        return cantidad;
    }
    public void setCantidad(Integer cantidad) {
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
    public void setPrecio(Integer precio) {
        this.precio = precio;
    }
}