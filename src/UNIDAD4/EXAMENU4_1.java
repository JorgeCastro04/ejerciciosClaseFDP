/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNIDAD4;

import java.util.Arrays;

/**
 *
 * @author propietario
 */
public class EXAMENU4_1 {
    public static void main(String[] args) {
        int[] lista = {54,26,92,17,77,31,44,55,20,14};
        int auxiliar;        
        System.out.println("\nImpresion del arreglo DESORDENADO");
        System.out.println(Arrays.toString(lista));        
        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista.length-1; j++) {
                if (lista[j] > lista[j+1]) {
                    auxiliar = lista[j + 1];
                    lista[j + 1] = lista[j];
                    lista[j] = auxiliar;
                }
            }
        }       
        System.out.println("\nImpresion del arreglo ORDENADO DE FORMA ASCENDENTE");
        System.out.println(Arrays.toString(lista));
    }   
}