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
public class EJERCICIO13 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double salario;
        System.out.println("Ingrese la cantidad de salario: ");
        salario=sc.nextDouble();
        salario=salario*1.25;
        System.out.println("Su salario con 25% de incremento es: "+salario);
        
    }
}
