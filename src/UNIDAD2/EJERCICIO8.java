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
public class EJERCICIO8 {
  //area circulo 
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        double radio, area;
        System.out.println("ingrese el valor del radio: ");
        radio=lector.nextDouble();
        area=Math.PI*Math.pow(radio,2);
        System.out.println("el area del circulo es: "+area);
    }
}
