/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNIDAD4;

import java.util.Scanner;

/**
 *
 * @author propietario
 */
public class EXAMENU4_2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double[] precioDolar = new double[3];
        double precioMenor;
        for (int i = 0; i < precioDolar.length; i++) {
            System.out.println("Ingresa el precio del dolar (Dia "+(i+1)+"): ");
            precioDolar[i]=lector.nextDouble();
        }
        precioMenor=precioDolar[0];
        for (int i = 1; i < precioDolar.length; i++) {
            if (precioDolar[i]<precioMenor)
                precioMenor=precioDolar[i];
        }
        System.out.println("En los ultimos 30 dias, el menor precio del dolar ha sido: "+precioMenor);
    }
}


