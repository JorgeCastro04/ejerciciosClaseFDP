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
public class EJERCICIO9 {
      //area del trapecio
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double basemayor, basemenor, altura, area;
        System.out.println("ingresa la base mayor: ");
        basemayor=sc.nextDouble();
        System.out.println("ingresa la base menor: ");
        basemenor=sc.nextDouble();
        System.out.println("ingresa la altura: ");
        altura=sc.nextDouble();
        area=(basemayor+basemenor)*altura/2;
        System.out.println("el area del trapecioes igual a: "+area);
    }
}
