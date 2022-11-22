package com.crud.SpaBella.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.SpaBella.Entity.Cuenta;
import com.crud.SpaBella.Service.CuentaService;

@RestController
@RequestMapping("/api/v1/cuenta")

public class CuentaController {
    
    @Autowired
    CuentaService cuentaService;

    @PostMapping("/create")
    public Cuenta save(@RequestBody Cuenta cuenta){
        return cuentaService.save(cuenta);
    }

    @GetMapping("/list")
    public List<Cuenta> findAll(){
        return cuentaService.findAll();
    }
    

}
