package com.example.pgweb.service;

import java.util.List;

import com.example.pgweb.entity.Productos;

public interface ProductosService {

    public abstract Productos addProductos(Productos productos);
    
    public abstract List<Productos> ListAllProductos();

    public abstract Productos findProductosById(int id);

    public abstract void removeProductos(int id);

}
