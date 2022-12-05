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
public class EJERCICIO15 {
    public static void main(String[] args) {
        int x,y,aux;
        //aux: es una variable que funciona como auxiliar
        Scanner lector=new Scanner(System.in);
        System.out.println("Ingrese el valor de x: ");
        x=lector.nextInt();
        System.out.println("Ingrese el valor de y: ");
        y=lector.nextInt();
        
        aux=x;
        x=y;
        y=aux;
        
        System.out.println("El valor de x es: "+x);
        System.out.println("El valor de y es: "+y);
    }
}
