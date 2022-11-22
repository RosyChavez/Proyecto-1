package com.crud.SpaBella.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.SpaBella.Entity.Cuenta;
import com.crud.SpaBella.Repository.CuentaRepository;

@Service
public class CuentaService {
    @Autowired
    CuentaRepository cuentaRepository;

    public Cuenta save(Cuenta cuenta){
        return cuentaRepository.save(cuenta);
    }

    public List<Cuenta> findAll(){
        return (List<Cuenta>) cuentaRepository.findAll();
    }

}
