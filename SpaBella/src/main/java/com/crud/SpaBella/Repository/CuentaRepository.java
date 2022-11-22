package com.crud.SpaBella.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crud.SpaBella.Entity.Cuenta;

@Repository
public interface CuentaRepository  extends CrudRepository<Cuenta,Long>{
    
}

