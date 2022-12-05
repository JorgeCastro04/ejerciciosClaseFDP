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
public class EJERCICIO10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        byte semestre, promedio; //byte-127 hasta 128
        System.out.println("Programa que evalua las condiciones de un alumno para otorgarle una beca");
        System.out.println("Ingrese tu semestre: ");
        semestre = entrada.nextByte();
        System.out.println("Ingrese tu promedio de calificacio: ");
        promedio = entrada.nextByte();
        
        if((semestre>=4&&semestre<=8)||promedio>=90)
            //VERDADERO
            System.out.println("Felicidades. Eres merecedor de una beca.");
        else
            //FALSO
            System.out.println("Lo lamento, intentelo el proximo semestre.");
    }
}