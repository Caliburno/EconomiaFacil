package com.example.economiafacil.model;

public class Conceptos {

//El concepto es el tipo de gasto o ingreso, es lo que le da un nombre y una clásificiación
//Hay una lista de conceptos preestablecidos y cada concepto tiene una de las cinco categorías preestablecidas
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
