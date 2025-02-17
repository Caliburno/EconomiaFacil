package com.example.economiafacil.model;
import java.util.ArrayList;

public class Registro {

    private ArrayList<Movimientos> movimientos = new ArrayList<>();

    public void nuevoMovimiento(Movimientos movimiento) {

        movimientos.add(movimiento);

    }


}
