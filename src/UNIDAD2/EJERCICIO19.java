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
public class EJERCICIO19 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double TMB, peso, altura, edad, calDiarias, calAdelgazar, CaloriasProteinas, 
                CaloriasGrasas, CaloriasCarbohidratos, gramosProteinas, gramosCarbohidratos, gramosGrasas;
        final double DESCUENTO=0.15;
        //calcular su tasa metabolica basal
        System.out.println("ingrese su peso en kg");
        peso=lector.nextDouble();
        System.out.println("ingrese su altura en centrimetos");
        altura=lector.nextDouble();
        System.out.println("ingrese su edad");
        edad=lector.nextDouble();
        
        TMB=(10*peso)+(6.25*altura)-(5*edad)+5;
        
        System.out.println("Su tasa metabolica basal es de: "+TMB);
        
        //calorias diarias necesarias
        calDiarias=TMB*1.55;
        System.out.println("Sus calorias necesarias son de: "+calDiarias);
        
        //calorias necesarias para adelgazar
        calDiarias= calDiarias-(calDiarias*DESCUENTO);
        System.out.println("calorias necesarias para adelgazar es de: "+calDiarias);
        
        //distribucion de las calorias en proteinas carbohidratos y grasas
        System.out.println("\n\nSus calorias quedan distribuidas de la siguente manera");
        
        CaloriasProteinas=calDiarias*0.35;
        System.out.println("Calorias Proteinas:"+CaloriasProteinas);
        CaloriasGrasas=calDiarias*0.25;
        System.out.println("Calorias Grasas:"+CaloriasGrasas);
        CaloriasCarbohidratos=calDiarias*0.40;
        System.out.println("Calorias Carbohidratos:"+CaloriasCarbohidratos);
        
        //gramos
        gramosProteinas=CaloriasProteinas/4;
        System.out.println("\n\nlos gramos de proteinas requeridos son: "+gramosProteinas);
        
        gramosCarbohidratos=CaloriasCarbohidratos/4;
        System.out.println("los gramos de carbohidratos requeridos son: "+gramosCarbohidratos);
        
        gramosGrasas=CaloriasGrasas/9;
        System.out.println("los gramos de grasas requeridos son: "+gramosGrasas);
        
        
    }
   
}


