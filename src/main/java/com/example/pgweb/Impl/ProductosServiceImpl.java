package com.example.pgweb.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.pgweb.entity.Productos;
import com.example.pgweb.repository.ProductosRepository;
import com.example.pgweb.service.ProductosService;

@Service("productosservice")
public class ProductosServiceImpl implements ProductosService{

    @Autowired
    @Qualifier("productosrepository")
    private ProductosRepository productosRepository;

    @Override
    public Productos addProductos(Productos productos) {
        return productosRepository.save(productos);
    }

    @Override
    public List<Productos> ListAllProductos() {
        List<Productos> productos = new ArrayList<>();
        productos=productosRepository.findAll();
        return productos;
    }

    @Override
    public Productos findProductosById(int id) {
        
        return productosRepository.findById(id);
    }

    @Override
    public void removeProductos(int id) {
        Productos p=findProductosById(id);
        if(null!= p){
            productosRepository.delete(p);
        }
    
        
    }
    
}
