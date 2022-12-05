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
public class EJERCICIO7 {
    //area del triangulo
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in); 
       double base, altura, area;
        System.out.println("ingrese base: ");
        base=sc.nextDouble();
        System.out.println("ingrese altura: ");
        altura=sc.nextDouble();
        area=base*altura/2;
        
        System.out.println("area del triangulo es: "+area);
    }     
}
