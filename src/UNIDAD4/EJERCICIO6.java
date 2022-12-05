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
public class EJERCICIO6 {
    public static final String ANSI_YELLOW = "\u001B[33m"; //COLOR AMARILLO PARA EL TEXTO
    //<<<Su uso es opcional>>>
    
    public static void main(String[] args) {
        //Programa que muestra los datos contenidos en un arreglo y actualiza o modifica su contenido
        //tomando como referencia su índice
        Scanner lector=new Scanner(System.in);
        String[]productos= new String[2];
        String respuesta, nombreOld;
        int indice;
        
        //CICLO FOR PARA LLENAR EL ARREGLO
        for (int i = 0; i < productos.length; i++) {
            System.out.println(ANSI_YELLOW+"Ingrese el nombre del producto "+(i+1)+":");
            //A la variable i se le está sumando una unidad pero sólo para efectos de presentación del mensaje 
            //Por lo que su valor no se ve afectado
            productos[i]=lector.nextLine();
        }
        
        //CICLO FOR PARA MOSTAR EL CONTENIDO DEL VECTOR
        System.out.println("\n\n+++Elementos ingresados al vector +++");
        for (int i = 0; i < productos.length; i++) {
            System.out.println((i+1)+"."+productos[i]);
           //A la variable i se le suma una unidad pero sólo para efectos de presentación del mensaje 
            //Por lo que su valor no se ve afectado  
        }
        System.out.println("\n>>>Desea modificar algun producto? SI(S)  NO(N)");
        respuesta=lector.next().toUpperCase(); //Se convierte la respuesta a mayúsculas
        
        do{
            if(respuesta.equals("SI")|| respuesta.equals("S")){
                System.out.println("---Ingresa el número del producto a editar: ");   
                indice=lector.nextInt()-1; 
                //Se puede ingresar un número del 1 al 10, sin embargo para que coincida
                //con un número de índice válido se le resta 1 unidad ya que el número 1
                //sería el equivalente a la posición cero (0)del vector
                lector.nextLine();
                //Después de solicitar el entero queda guardado el "enter" en el buffer
                //por lo que debe limpiarse el buffer inclutendo una instrucción nextLine
                nombreOld=productos[indice]; //Se guarda el nombre antiguo
                System.out.println("---Ingresa el nuevo nombre del producto: ");
                productos[indice]=lector.nextLine();
                
                //Se presenta el nombre antiguo y el actual
                System.out.println("\n***Usted ha cambiado el producto "+nombreOld+" por "+productos[indice]);
                
                System.out.println("\n>>>Desea modificar otro producto?  SI(S)   NO(N)");
                respuesta=lector.next().toUpperCase();
                //Se convierte la respuesta a mayúsculas
            }
            
        }while(respuesta.equals("SI")|| respuesta.equals("S"));
       } 
}
