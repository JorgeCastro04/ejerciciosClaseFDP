/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNIDAD3;

/**
 *
 * @author propietario
 */
public class EJERCICIO13 {
     public static void main(String[] args) {
        int i=4;
        System.out.println("CICLO WHILE");
        //whilexp + tabulación
        while (i <= 25) {            
            System.out.print(i+"   ");
            //i+=1;  // i= i+1;
            //i++;
            i+=4;
        }
        
        System.out.println("\n\nCICLO DO-WHILE");
        i=1;
        //dowhile + tabulación
        do {            
            System.out.print(i+"   ");
            //i+=1;
            i++;
        } while (i <= 5);
        
        System.out.println("\n\nCICLO FOR");
        //fori + tabulación
        for (i = 1; i <= 5; i++) {
            System.out.print(i+"   ");
        }
    }
}


