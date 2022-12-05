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
public class EJERCICIO11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        byte opcion;
        System.out.println("*===MENU===*");
        System.out.println("Pizza vegetariana");
        System.out.println("\t1. Pimiento");
        System.out.println("\t2. Tofu");
        System.out.println("\t3. Variedad de hongos");
        System.out.println("\nPizza No vegetariana");
        System.out.println("\t4. Peperoni");
        System.out.println("\t5. Jamon");
        System.out.println("\t6. Salmon");
        System.out.println("\t7. Camaron");
        System.out.println("\nNumero de pizza que desea ordenar: ");
        opcion = entrada.nextByte();
        
        switch(opcion){
            case 1:
                System.out.println("Ha elegido una pizza vegetariana"
                +"\nLos ingredientes que lleva son: Pimiento, salsa de tomate y queso mozzarella");
                break;
            case 2:
                System.out.println("Ha elegido una pizza vegetariana"
                +"\nLos ingredientes que lleva son: Tofu, salsa de tomate y queso mozzarella");
                break;
            case 3:
                System.out.println("Ha elegido una pizza vegetariana"
                +"\nLos ingredientes que lleva son: Variedad de hongos, salsa de tomate y queso mozzarella");
                break;
            case 4:
                System.out.println("Ha elegido una pizza No vegetariana"
                +"\nLos ingredientes que lleva son: Peperoni , salsa de tomate y queso mozzarella");
                break;
            case 5:
                System.out.println("Ha elegido una pizza No vegetariana"
                +"\nLos ingredientes que lleva son: Jamon, salsa de tomate y queso mozzarella");
                break;
            case 6:
                System.out.println("Ha elegido una pizza No vegetariana"
                +"\nLos ingredientes que lleva son: Salmon, salsa de tomate y queso mozzarella");
                break;
            case 7:
                System.out.println("Ha elegido una pizza vegetariana"
                +"\nLos ingredientes que lleva son: Camaron, salsa de tomate y queso mozzarella");
                break;
            default:
                System.out.println("\nA ver baboso, la opcion elegida no existe.");
        }
    }
}
