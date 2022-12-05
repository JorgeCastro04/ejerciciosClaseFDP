/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNIDAD4;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author propietario
 */
public class EJERCICIO9 {
    public static void main(String[]args){
        Scanner lector = new Scanner(System.in);
        int matriz[][], filas, columnas, sumaFilas, sumaColumnas, suma=0;
        
       filas=Integer.parseInt(JOptionPane.showInputDialog("ingresa el numero de filas "));
       columnas=Integer.parseInt(JOptionPane.showInputDialog("ingresa el numero de columnas "));
       
       matriz=new int[filas][columnas];
        System.out.println("ingrese los datos de la matriz: ");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                
                System.out.println("elemento ["+i+"] ["+j+"]: ");
                
                matriz[i][j]=lector.nextInt();
                
   
            }
            
        }
        for (int i = 0; i < filas; i++) {
            sumaFilas=0;
            for (int j = 0; j < columnas; j++) {
            sumaFilas+=matriz[i][j];
                
            }
            System.out.println("la suma de la fila: "+i+"es: "+sumaFilas);
        }
         for (int i = 0; i < columnas; i++) {
            sumaColumnas=0;
            for (int j = 0; j < filas; j++) {
            sumaColumnas+=matriz[i][j];
            
    }  
              System.out.println("la suma de la fila:  "+i+"es: "+sumaColumnas);
              
    
         }  
         
          for (int i = 0; i < filas; i++) {
          for (int j = 0; j< columnas; j++) {
              suma+=matriz[i][j];
              
          }
         
         
         
            
    }  
        System.out.println("la suma de todos los valores contenidos en la matriz es: "+suma); 
    }
}
