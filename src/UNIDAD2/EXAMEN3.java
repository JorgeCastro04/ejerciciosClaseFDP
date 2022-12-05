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
public class EXAMEN3 {
     public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        double radio,altura,volumenCono;
        System.out.println("ingrese elradio del cono:");
        radio=lector.nextDouble();
        System.out.println("ingrese la altura del cono:");
        altura=lector.nextDouble();
        
        volumenCono=Math.PI*Math.pow(radio, 2)*altura/3;
        
        System.out.println("el volumen del cono es:"+volumenCono);
    }
}
