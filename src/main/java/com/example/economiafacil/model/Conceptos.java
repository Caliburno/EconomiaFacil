package com.example.economiafacil.model;

public class Conceptos {

    String nombre;
    Categorias categoria;

    public Conceptos() {
    }

    public Conceptos(String nombre, Categorias categoria) {
        this.nombre = nombre;
        this.categoria = categoria;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Categorias getCategoria() {
        return categoria;
    }

    public void setCategoria(Categorias categoria) {
        this.categoria = categoria;
    }

}
