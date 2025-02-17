package com.example.economiafacil.model;

import java.time.LocalDateTime;

public class Movimientos {
    private Conceptos concepto;
    private double monto;
    private LocalDateTime hora;

    public Movimientos(Conceptos concepto, double monto, LocalDateTime hora) {
        this.concepto = concepto;
        this.monto = monto;
        this.hora = hora;
    }

    public Conceptos getConcepto() {
        return concepto;
    }

    public double getMonto() {
        return monto;
    }

    public LocalDateTime getHora() {
        return hora;
    }
}
