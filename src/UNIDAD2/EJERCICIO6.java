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
public class EJERCICIO6 {
    //convertir kilos a libras
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        double libras, kilos;
        System.out.println("ingrese el valor en kilos: ");
        kilos=lector.nextDouble();
        libras=kilos/0.454;
        System.out.println("el resultado es: "+libras);
    }
}
