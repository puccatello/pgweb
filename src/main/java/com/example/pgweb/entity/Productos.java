package com.example.pgweb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="productos")
public class Productos {

    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;

    @Column(name="nombrepro")
    private String nombrepro;

    @Column(name="categoria")
    private String categoria;

    @Column(name="precio")
    private String precio;

    @Column(name="tamano")
    private String tamano;

    @Column(name="imagen")
    private String imagen;

    @Column(name = "descripción")
    private String descripcion;

    @Column(name="cantidad")
    private String cantidad;

    @ManyToOne
    private Cliente cliente;
    
    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombrepro() {
        return nombrepro;
    }

    public void setNombrepro(String nombrepro) {
        this.nombrepro = nombrepro;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    
    public Productos() {
    
    }

    

    public Productos(int id, String nombrepro, String categoria, String precio, String tamano, String imagen,
            String descripcion, String cantidad, Cliente cliente) {
        this.id = id;
        this.nombrepro = nombrepro;
        this.categoria = categoria;
        this.precio = precio;
        this.tamano = tamano;
        this.imagen = imagen;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}