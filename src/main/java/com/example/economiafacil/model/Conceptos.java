package com.example.economiafacil.model;

public class Conceptos {

    String nombre;
    String descripción;
    Categorias categoria;

    public Conceptos() {
    }

    public Conceptos(String nombre, String descripcion, Categorias categoria) {
        this.nombre = nombre;
        this.descripción = descripcion;
        this.categoria = categoria;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public Categorias getCategoria() {
        return categoria;
    }

    public void setCategoria(Categorias categoria) {
        this.categoria = categoria;
    }

}
