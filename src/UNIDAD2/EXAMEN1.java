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
public class EXAMEN1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double califExamen, califEjercicios,califInvestigacion, calFinal;
        System.out.println("ingrese la calificacion del examen:");
        califExamen=sc.nextInt();
        System.out.println("ingrese la calificacion de los ejercicios:");
        califEjercicios=sc.nextInt();
        System.out.println("ingrese la calificacion de la investigacion:");
        califInvestigacion=sc.nextInt();
        
        calFinal=califExamen*0.4+califEjercicios*0.35+califInvestigacion*0.25;
        
        System.out.println("la calificacion finalde la unidad 2:"+calFinal);
    }
}

