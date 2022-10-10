package com.example.pgweb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="detalles")
public class DetalleOrden {

    @Id
    @GeneratedValue

    @Column(name="id")
    private int id;

    @Column(name="nombre")
    private String nombre;

    @Column(name="cantidad")
    private double cantidad;
    
    @Column(name="precio")
    private double precio;

    @Column(name="total")
    private double total;

    @OneToOne
    private Orden orden;

    @ManyToOne
    private Productos productos;

    public Orden getOrden() {
        return orden;
    }
    public void setOrden(Orden orden) {
        this.orden = orden;
    }
    public Productos getProductos() {
        return productos;
    }
    public void setProductos(Productos productos) {
        this.productos = productos;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getCantidad() {
        return cantidad;
    }
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    public DetalleOrden(int id, String nombre, double cantidad, double precio, double total) {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.total = total;
    }
    public DetalleOrden() {
    }

    @Override
    public String toString(){
        return "DetalleOrden[id="+id+", nombre="+nombre+", cantidad="+cantidad+", precio="+precio+", total="+total+"]";
    }
    
    
}
