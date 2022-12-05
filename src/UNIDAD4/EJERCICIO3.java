/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNIDAD4;

import java.util.Scanner;

/**
 *
 * @author propietario
 */
public class EJERCICIO3 {
    public static void main(String[] args) {
       int[] temperaturas={35,28,32,27,30};
        Scanner lector= new Scanner(System.in);
        int dato,vecesEncon=0;
        boolean encontrado = false;
        System.out.println("ingrese valor a buscar:");
        dato= lector.nextInt();
        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i]==dato) {
                //pocion1: marca con la variable booleana 
                //que se ha encontrado el dato
                encontrado=true;
                //opcion2:mostrar la posicion en que se encuentra 
                //el dato que esta buscando 
                System.out.println("el dato: " +dato+ "se encuentro en la posicion: " +i+ "del arreglo");
                break;
            }
            
        }
       
        
        //Al finalizar el ciclo comprobar el valor con que finaloza la variable BANDERA 
        if (encontrado==true)
            System.out.println("el dato fue encontrado: ");
          
        else 
            System.out.println("No se encontro el Dato:");
        
        
        
        double[] calificaciones={100,70,85.5,70,100,100};
        String posiciones="";
        System.out.println("ingrese el valor:");
        dato=lector.nextInt();
        for (int i = 0; i <temperaturas.length; i++) {
            if (calificaciones[i]==dato) {
                //se encrementa la varible vecesencont cada vez que se encuentra el dato 
                //se registran las psosiciones dople se encuentra el dato
                posiciones+=i+"";   
            }
            
        }
        System.out.println("El dato: " +dato+ "se encontro: " +vecesEncon+ "en las posiciones: " +posiciones+ " del regalo ");
    }
}
