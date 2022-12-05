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
public class EJERCICIO12 {
    public static void main(String[] args) {
        Scanner lector =new Scanner(System.in);
        double cateto1, cateto2, hipotenusa, area, perimetro;
        //programa que obtiene el valor de la hipotenusa, area y perimetro de un triangulorectangulo
        System.out.println("valor del cateto1: ");
        cateto1=lector.nextDouble();
        System.out.println("valor del cateto2: ");
        cateto2=lector.nextDouble();
        
        hipotenusa=Math.pow(cateto1, 2)+Math.pow(cateto2, 2);
        area=cateto1*cateto2/2;
        perimetro=cateto1+cateto2+hipotenusa;
        
        System.out.println("Resultados obtenidos");
        System.out.println("Hipotenusa: "+hipotenusa);
        System.out.println("Area: "+area);
        System.out.println("Perimetro: "+perimetro);
             
        
    }
}
