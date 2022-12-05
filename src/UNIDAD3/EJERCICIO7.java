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
public class EJERCICIO7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double horas_jornada, horas_trabajadas;
        System.out.println("===Programa que muestra las horas extras trabajadas===");
        System.out.println("Ingrese sus Horas de jornada semanales: ");
        horas_jornada=entrada.nextDouble();
        System.out.println("Ingrese sus Horas Trabajadas en la semana: ");
        horas_trabajadas=entrada.nextDouble();
        
        
        if (horas_trabajadas>horas_jornada)
            System.out.println("Estas Trabajando Horas extras"
            +"\nTus horas extras son: "+(horas_trabajadas-horas_jornada));
        if (horas_trabajadas==horas_jornada)
            System.out.println("Estas Trabajando correctamente");
        if (horas_trabajadas<horas_jornada)
            System.out.println("Estas trabajando menos horas");
        
    }
}
