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
public class EJERCICIO18 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        double r, a, b, c, d;
        double problema1, problema2, problema3, resultado;
        
        System.out.println("ingresar valor letra r");
        r=leer.nextDouble();
        System.out.println("ingresar valor letra a");
        a=leer.nextDouble();
        System.out.println("ingresar valor letra b");
        b=leer.nextDouble();
        System.out.println("ingresar valor letra c");
        c=leer.nextDouble();
        System.out.println("ingresar valor letra d");
        d=leer.nextDouble();
        
        problema1=(4)/3*(r+34);
        problema2=9*(a+(b*c));
        problema3= 3+d*(2+a)/(a+(b*d));
        resultado=problema1-problema2+problema3;
        System.out.println("el resultado de la operacion es: "+resultado);      
    }
}
   
