package com.example.pgweb.service;

import java.util.List;

import com.example.pgweb.entity.Usuarios;

public interface UsuariosService {

    public abstract Usuarios addUsuarios(Usuarios usuarios);
    
    public abstract List<Usuarios> ListAllUsuarios();

    public abstract Usuarios findUsuariosById(int id);

    public abstract void removeUsuarios(int id);

}
