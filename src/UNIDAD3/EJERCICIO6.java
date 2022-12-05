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
public class EJERCICIO6 {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        int num;
        System.out.println("Ingrese un numero: ");
        num=lector.nextInt();
        
        if(num<0){
            System.out.println("El numero es negativo");
        }
        else{
            System.out.println("El numero es positivo");
        }
    }
}
