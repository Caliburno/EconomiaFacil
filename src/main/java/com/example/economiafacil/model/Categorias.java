package com.example.economiafacil.model;

public class Categorias {
String nombre;
Conceptos[] conceptos;

    public Categorias() {
    }

    public Categorias(String nombre, Conceptos[] conceptos) {
        this.nombre = nombre;
        this.conceptos = conceptos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Conceptos[] getConceptos() {
        return conceptos;
    }

    public void setConceptos(Conceptos[] conceptos) {
        this.conceptos = conceptos;
    }
}
