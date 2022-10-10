package com.example.pgweb.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.pgweb.entity.Usuarios;
import com.example.pgweb.repository.UsuariosRepository;
import com.example.pgweb.service.UsuariosService;

@Service("usuariosservice")
public class UsuariosServiceImpl implements UsuariosService{

    @Autowired
    @Qualifier("usuariosrepository")
    private UsuariosRepository usuariosRepository;

    @Override
    public Usuarios addUsuarios(Usuarios usuarios) {
        return usuariosRepository.save(usuarios);
    }

    @Override
    public List<Usuarios> ListAllUsuarios() {
        List<Usuarios> users = new ArrayList<>();
        users=usuariosRepository.findAll();
        return users;
    }

    @Override
    public Usuarios findUsuariosById(int id) {
        
        return usuariosRepository.findById(id);
    }

    @Override
    public void removeUsuarios(int id) {
        Usuarios us= findUsuariosById(id);
        if(null!= us){
            usuariosRepository.delete(us);
        }
    
        
    }
    
}
