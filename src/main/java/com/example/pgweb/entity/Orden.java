package com.example.pgweb.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ordenes")
public class Orden {
    @Id
    @GeneratedValue

    @Column(name="cantidad")
    private int id;

    @Column(name="numero")
    private String numero;

    @Column(name="fechacreacion")
    private Date fechaCreacion;

    @Column(name="fecharecibida")
    private Date fechaRecibida;

    @Column(name="total")
    private double total;

    @ManyToOne
    private Cliente cliente;

    @OneToOne(mappedBy="orden")
    private DetalleOrden detalle;
    
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public Date getFechaCreacion() {
        return fechaCreacion;
    }
    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    public Date getFechaRecibida() {
        return fechaRecibida;
    }
    public void setFechaRecibida(Date fechaRecibida) {
        this.fechaRecibida = fechaRecibida;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    public Orden(int id, String numero, Date fechaCreacion, Date fechaRecibida, double total) {
        this.id = id;
        this.numero = numero;
        this.fechaCreacion = fechaCreacion;
        this.fechaRecibida = fechaRecibida;
        this.total = total;
    }
    public Orden() {
    }
 
    @Override
    public String toString(){
        return "Orden[id="+id+", numero="+numero+", fechaCreacion="+fechaCreacion+", fechaRecibida="+fechaRecibida+", total="+total+"]";
    }
    public DetalleOrden getDetalle() {
        return detalle;
    }
    public void setDetalle(DetalleOrden detalle) {
        this.detalle = detalle;
    }
}
