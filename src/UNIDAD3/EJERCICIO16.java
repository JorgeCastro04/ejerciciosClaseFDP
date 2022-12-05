/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNIDAD3;

import java.util.Scanner;

/**
 *
 * @author propietario
 */
public class EJERCICIO16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int respuesta, contador=1;
        do {            
            //Se va mostrando cuantas vueltas van o se han ejecutado
            System.out.println("\nEsta es la vuelta #"+contador+". Yiiiiijaaaa!!!");
            
            System.out.println("\nQuieres dar otra vuelta?");
            System.out.println("1. Si\n0. No");
            respuesta=entrada.nextInt();
            contador++;
        } while (respuesta!=0);
    }
}


