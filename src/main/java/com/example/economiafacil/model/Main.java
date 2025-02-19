package com.example.economiafacil.model;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Registro registro = new Registro();
        Movimientos movimiento = new Movimientos(entrada.nextLine(),
                entrada.nextDouble(),
                new LocalDateTime());

        System.out.println("Ingrese un movimiento indicando concepto y monto"); //esto después es front, el print está para ir viendo

        registro.nuevoMovimiento();
    }//fin main
}
