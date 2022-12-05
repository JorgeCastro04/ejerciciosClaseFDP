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
public class EXAMAEN1 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int peso, zona;
        System.out.println("zonas de envios: ");
        System.out.println("1.-America\n2.-Europa\n3.-Asia");
        zona=lector.nextInt();
        System.out.println("introduce el peso del paquete en kilogramos:");
        peso=lector.nextInt();
        
         
        if(peso>5)
            System.out.println("el paquete no puede ser admitido por motivos de seguridad");
        if(peso<=0) 
            System.out.println("el peso del paquete debe ser un entero mayor a cero");
        if (peso>0&&peso<=5){
        switch(zona){
            case 1:
                System.out.println("el paquete de"+peso+"kilogramo enviado a america se envia por"+(peso*24)+"dolares.");
                break;
            case 2:
                System.out.println("el paquete de"+peso+"kilogramo enviado a europa se envia por"+(peso*15)+"dolares.");
                break;
            case 3:
                System.out.println("el paquete de"+peso+"kilogramo enviado a asia se envia por"+(peso*21)+"dolares.");
                break;
            default:
                System.out.println("ERROR: zona elegida incorrecta");
                       
            }
        }
    }
}
