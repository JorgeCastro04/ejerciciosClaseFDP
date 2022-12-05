/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNIDAD4;

/**
 *
 * @author propietario
 */
public class EJERCICIO5 {
     public static void main(String[] args) {
        String[]pokemones={"treenko","totodile","torchie","psyduk","wobloufet","cyndaqui"};
        
        for (int i = 0; i < pokemones.length; i++) {
            System.out.println((i+1)+"."+pokemones[i]);
        }
        int i=1; 
        
        for (String pokemon : pokemones) {
            System.out.println(i+"."+pokemon); 
       i++;
        }
       
        
    }
}
