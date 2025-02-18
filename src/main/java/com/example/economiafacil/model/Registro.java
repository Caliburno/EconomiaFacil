package com.example.economiafacil.model;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class Registro {

    private List<Movimientos> movimientos = new ArrayList<>();
    //La lista es un registro de todos los movimientos individuales, con sus respectivos montos y fechas

    public void nuevoMovimiento(Movimientos movimiento) {
        movimientos.add(movimiento); //Agrega un movimiento individual a la lista
    }

    public List<Movimientos> getMovimientos() {
        return movimientos; //Devuelve la lista completa
    }

    HashMap<Categorias, Double> totalesPorCategoria = new HashMap<>();



}
