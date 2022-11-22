package com.crud.SpaBella.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.SpaBella.Entity.Usuario;
import com.crud.SpaBella.Repository.UsuarioRepository;

@Service

public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    public Usuario save(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public List<Usuario> findAll()
    {
        return (List<Usuario>) usuarioRepository.findAll();
    }

    public Usuario update(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public String deleteById(Long id){
        usuarioRepository.deleteById(id);
        return "Registro eliminado";
    }

}
