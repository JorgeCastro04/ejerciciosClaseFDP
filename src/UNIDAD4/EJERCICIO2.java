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
public class EJERCICIO2 {
    public static void main(String[] args) {
        Scanner lector= new Scanner(System.in);
        int[] calificaciones; 
        int suma=0,promedio=0,numMaterias;
        System.out.println("ingrese el numero de Materias:");
        numMaterias=lector.nextInt();
        calificaciones=new int[numMaterias];

        System.out.println("ingrese las:" +numMaterias+ "calificaciones,una ala vez y presione entre:");
        for (int i = 0; i < calificaciones.length; i++) {
           calificaciones[i]= lector.nextInt();
           suma=suma+calificaciones[i];
        }
        
        promedio=suma/numMaterias;
        System.out.println("El promedio de su calificaciones seria:"+promedio);
    }
}
