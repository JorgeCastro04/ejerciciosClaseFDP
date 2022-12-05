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
public class EJERCICIO16 {
    public static void main(String[] args) {
        //Programa que obtiene la cantidad de segundos en base a una cantidad de días,horas y minutos
        Scanner lector=new Scanner (System.in);
        int dias,horas,min,dias_segundos,horas_segundos,min_segundos,total;
        System.out.println("Ingrese los dias: ");
        dias=lector.nextInt();
        System.out.println("Ingrese las horas: ");
        horas=lector.nextInt();
        System.out.println("Ingrese los minutos: ");
        min=lector.nextInt();
        
        dias_segundos=dias*24*60*60;
        horas_segundos=horas*60*60;
        min_segundos=min*60;
        
        total=dias_segundos+horas_segundos+min_segundos;
        
        System.out.println("El total de segundo es: "+total);
        
    }
}
