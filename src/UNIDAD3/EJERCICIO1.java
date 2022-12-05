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
public class EJERCICIO1 {
    public static void main(String[] args) {
        //CONDICIONALES
        Scanner lector = new Scanner(System.in);
        int noviasBadBunny, noviasTiti;
        System.out.println("titi me pregunto si tienes muchas novias");
        System.out.println("titi:-BadB ¿cuantas novias tienes?");
        noviasBadBunny = lector.nextInt();
        System.out.println("BadB:-y tu ¿cuantas novias tienes?");
        noviasTiti = lector.nextInt();
        
        //INICIO DE LA INSTRUCCION CONDICIONAL
        if(noviasBadBunny == noviasTiti)
            System.out.println("Bad Bunny tiene la misma cantidad de novias que titi");
        
        if(noviasBadBunny > noviasTiti)
            //verdadero
            System.out.println("Bad Bunny tiene mas novias que titi");
        else{ //falso
            if(noviasBadBunny < noviasTiti)
                System.out.println("Titi tiene mas novias que Bad Bunny");
        }
    }
}
