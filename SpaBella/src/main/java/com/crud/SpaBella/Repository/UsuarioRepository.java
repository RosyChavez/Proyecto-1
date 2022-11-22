package com.crud.SpaBella.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crud.SpaBella.Entity.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario,Long> {
   // public Usuario findByNombre (String nombre);

}


