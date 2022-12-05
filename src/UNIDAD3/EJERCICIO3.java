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
public class EJERCICIO3 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int edad;
        System.out.println("\t\tPrograma que determina si UD es mayor de edad");
        System.out.println("Ingrese su edad: ");
        edad=lector.nextInt();
        
       System.out.println("\nSOLUCION DE ISRAEL");
        if(edad >= 18)
            //SI ES VERDADERO
            System.out.println("Eres MAYOR de edad. Te voy a llevar a un VIP");
        else
            //SI ES FALSO
            System.out.println("Eres menor de edad");
        
        System.out.println("\nSOLUCION DE YAMIR Y CRISTOPHER");
        if(edad<18)
            //SI ES VERDADERO
            System.out.println("Eres MENOR de edad");
        else
            // SI ES FALSO
            System.out.println("Eres MAYOR de edad");
        
        System.out.println("\nSOLUCION DE DIEGO");
        if(edad>17)
            //SI ES VERDADERO
            System.out.println("Eres MAYOR de edad");
        else
            //SI ES FALSO
            System.out.println("Ve anda, mira, te habla tu mami. No quiero ir a la carcel");
    }
        
       
    
}
