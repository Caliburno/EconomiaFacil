package com.example.economiafacil.model;

import java.time.LocalDateTime;

public class Movimientos { //El movimiento es el registro individual que ingresa el usuario
    private Conceptos concepto; //Se elige un tipo de gasto o ingreso
    private double monto; //Y se agrega cuánto dinero salió o entró
    private LocalDateTime fecha; //Y se registra en qué fecha ocurrió el movimiento individual

    public Movimientos() {
    }

    public Movimientos(Conceptos concepto, double monto, LocalDateTime fecha) {
        this.concepto = concepto;
        this.monto = monto;
        this.fecha = fecha;
    }

    public Conceptos getConcepto() {
        return concepto;
    }

    public double getMonto() {
        return monto;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }
}
