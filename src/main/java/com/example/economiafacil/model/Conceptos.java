package com.example.economiafacil.model;

public class Conceptos {

    String nombre;
    Categorias categoria;
    Double monto;

    public Conceptos() {
    }

    public Conceptos(String nombre, Categorias categoria, Double monto) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.monto = monto;
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

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

}
