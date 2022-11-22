package com.crud.SpaBella.Controller;

import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.SpaBella.Entity.Message;


@RestController
@RequestMapping("/prueba")

public class Prueba {
    
    @GetMapping
    public String Saludo (@RequestBody Message mensaje,@PathVariable String dia,@Param("dato") String dato ){
        return "Hola " +mensaje.getNombre() + " " +mensaje.getSaludo() +" "+dia+" "+dato;
    }
}

