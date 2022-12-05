/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNIDAD2;

import java.util.Scanner;

/**
 *
 * @author propietario
 */
public class EJERCICIO14 {
    public static void main(String[] args) {
        //Declaración de constantes
        final double DESCUENTO=0.10;
        
        Scanner lector=new Scanner(System.in);
        double subtotal,total;
        System.out.println("Ingrese el total de compra: ");
        subtotal=lector.nextDouble();
        total=subtotal-(subtotal*DESCUENTO);
        System.out.println("El total de compra con descuento es: "+total);
    }
}
