package com.example.economiafacil.model;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Registro registro = new Registro();

        System.out.println("Ingrese un movimiento indicando concepto y monto"); //esto después es front, el print está para ir viendo

        Movimientos movimiento = new Movimientos(ocio, entrada.nextDouble(), LocalDateTime.now()); //verificar cómo se pone un time stamp y que LocalDateTime.now() no se actualice constantemente
       // registro


    }//fin main
}
