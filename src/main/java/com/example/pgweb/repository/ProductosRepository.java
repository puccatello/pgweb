package com.example.pgweb.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.pgweb.entity.Productos;

@Repository("productosrepository")
public interface ProductosRepository extends JpaRepository<Productos, Serializable> {
    public abstract Productos findById(int id);

    
    
}
