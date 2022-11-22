package com.crud.SpaBella.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.SpaBella.Entity.Usuario;
import com.crud.SpaBella.Service.UsuarioService;

@RestController
@RequestMapping("/api/v1/usuario")

public class UsuarioController {
    
    @Autowired
    UsuarioService usuarioService;

    @PostMapping("/create")
    public Usuario save(@RequestBody Usuario usuario){
        return usuarioService.save(usuario);
    }

    @GetMapping("/list")
    public List<Usuario> findAll(){
        return usuarioService.findAll();
    }

    @PutMapping("/update/{id}")
    public Usuario update(@RequestBody Usuario usuario,@PathVariable Double id){
        usuario.setIdUsuario(id);
        
        return usuarioService.update(usuario);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteById(@PathVariable Long id){
        return usuarioService.deleteById(id);
    }

}
