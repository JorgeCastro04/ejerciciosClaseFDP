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
public class EJERCICIO8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int dia;
        System.out.println("Ingresa un numero del 1 al 7: ");
        dia= entrada.nextInt();
        
       
        
        
        System.out.println("\nSolucion2");
        if(dia==1)
            System.out.println("Lunes");
        
        if(dia==2)
            System.out.println("Martes");
        
        if(dia==3)
            System.out.println("Miercoles");
        
        if(dia==4)
            System.out.println("Jueves");
        
        if(dia==5)
            System.out.println("Viernes");
        
        if(dia==6)
            System.out.println("Sabado");
        
        if(dia==7)
            System.out.println("Domingo");
    }
}
