package com.crud.SpaBella.Entity;

public class Message {
    private String saludo;
    private String nombre;
    public String getSaludo() {
        return saludo;
    }
    public void setSaludo(String saludo) {
        this.saludo = saludo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Message() {
    }
    public Message(String saludo, String nombre) {
        this.saludo = saludo;
        this.nombre = nombre;
    }

    
}
