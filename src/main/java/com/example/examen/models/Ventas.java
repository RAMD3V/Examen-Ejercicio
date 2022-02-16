package com.example.examen.models;

import javax.persistence.*;

@Entity
@Table(name="Ventas")
public class Ventas{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true , nullable = false )
    private Long id;
    private String productos;
    private Integer cantidad;
    private Float precio;
    private String forma_pago;
    public String getProductos() {
        return productos;
    }
    public String getForma_pago() {
        return forma_pago;
    }
    public void setForma_pago(String forma_pago) {
        this.forma_pago = forma_pago;
    }
    public Float getPrecio() {
        return precio;
    }
    public void setPrecio(Float precio) {
        this.precio = precio;
    }
    public Integer getCantidad() {
        return cantidad;
    }
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    public void setProductos(String productos) {
        this.productos = productos;
    }
}