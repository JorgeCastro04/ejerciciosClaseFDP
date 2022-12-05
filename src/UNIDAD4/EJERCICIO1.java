/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNIDAD4;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author propietario
 */
public class EJERCICIO1 {
     public static void main(String[] args) {
        
        int[] numeros=new int[5];
        
        
       numeros[0]=120; 
       numeros[1]=37;
       numeros[2]=15;
       numeros[3]=28;
       numeros[4]=11;
       
       
       
        //Otra forma de declrar el arreglo 
        int[]numeros2={100,70,65,208,23,11};
       
        
        //Siguente forma de declarar el vector
        
        int[]numeros3;
        Scanner lector =new Scanner (System.in);
        int tamanio;
        System.out.println("ingrese el tamanio:"
                + "o de arreglo:");
        tamanio=lector.nextInt();
        numeros3=new int[tamanio];
         
        
        
        //imprimir o mostrar el contenido del vector 
        
        System.out.println(""+Arrays.toString(numeros));
        System.out.println(""+Arrays.toString(numeros2));
        System.out.println(""+Arrays.toString(numeros3));
       
        // imprimir o mostrar el contenido del vector utilizando ciclos 
        System.out.println("impresion del vector <numero:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]+"|");
        }
        
        System.out.println("impresion del vector numeros2:");
        for (int i = 0; i < numeros2.length; i++) {
             System.out.println(numeros2[i]+"-");
        }
        
           System.out.println("impresion del vector numero3:");
         for (int i = 0; i < numeros3.length; i++) {
               System.out.println(numeros3[i]+"~");
            
        }
            
            
                    
            
            
            
            
        }
}
