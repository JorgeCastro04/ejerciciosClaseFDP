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
public class EJERCICIO5 {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        int promedio;
        System.out.println("Ingrese su promedio: ");
        promedio=lector.nextInt();
        
        if(promedio>70){
            System.out.println("Usted Aprobo");
        }
        else{
            System.out.println("Usted Reprobo");
        }
    }
}
