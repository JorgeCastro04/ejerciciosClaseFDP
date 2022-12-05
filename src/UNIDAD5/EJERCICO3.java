/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNIDAD5;

import java.util.Scanner;

/**
 *
 * @author propietario
 */
public class EJERCICO3 {
    static double TMB_Hombre(double peso, int altura, int edad){
        return (10*peso)+(6.25*altura)-(5*edad)+5;
    }
    
    static double TMB_Mujer(double peso, int altura, int edad){
        return (10*peso)+(6.25*altura)-(5*edad)-161;
    }
    
    static double calcularConsumoCalorias(double TMB){
        Scanner lector = new Scanner(System.in);
        byte nivel;
        double factor=0;
        System.out.println("""
                           
                           NIVEL DE ACTIVIDAD FISICA
                           1. No haces ejercicio.
                           2. Poco ejercicio.
                           3. Ejercicio moderado.
                           4. Deporte intenso.
                           5. Atletas profesionales.
                           
                           Ingrese el numero que mejor describa su nivel de actividad fisica: """);
        nivel=lector.nextByte();
        switch (nivel) {
            case 1 -> factor=1.2;
            case 2 -> factor=1.375;
            case 3 -> factor=1.55;
            case 4 -> factor=1.75;
            case 5 -> factor=1.9;
            default -> System.out.println("Opcion no valida");
        }
        return TMB*factor;
    }
    
    static double calcularCaloriasDeficit(double consumoCalorias){
        return consumoCalorias-300;
    }
    
    static int[] calcularCaloriasMacros(double caloriasDeficit){
        int[] macros= new int[3];
        
        macros[0]=(int) (caloriasDeficit *0.35); // calorias de proteinas
        macros[1]=(int) (caloriasDeficit*0.25); //calorias de grasas
        macros[2]=(int) (caloriasDeficit*0.40); //calorias de carbohidratos

        return macros;
    }
    
    static int[] calcularGramosMacros(int[] caloriasMacros){
        int[] gramosMacros = new int[3];
        gramosMacros[0]=caloriasMacros[0]/4; //gramos de proteinas
        gramosMacros[1]=caloriasMacros[1]/9; //gramos de grasas
        gramosMacros[2]=caloriasMacros[2]/4; //gramos de carbohidratos
        return gramosMacros;
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double peso, tasaMetabolicaBasal = 0, consumoCalorias, caloriasDeficit;
        int altura, edad;
        int caloriasMacros[];
        int gramosMacros[];
        char sexo;
        System.out.println("INGRESA LOS DATOS SOLICITADOS");
        System.out.print("Peso (en kilogramos): ");
        peso=lector.nextDouble();
        System.out.print("Altura (en centimetros): ");
        altura=lector.nextInt();
        System.out.print("Edad: ");
        edad=lector.nextInt();
        System.out.print("Sexo (H=Hombre M=Mujer): ");
        sexo=lector.next().charAt(0);
        
        if (sexo=='H')
            tasaMetabolicaBasal = TMB_Hombre(peso, altura, edad); //invocación de función
        if (sexo=='M')
            tasaMetabolicaBasal = TMB_Mujer(peso, altura, edad); //invocación de función
        
        System.out.println("\nSu Tasa Metabolica Basal es: "+tasaMetabolicaBasal);
        
        consumoCalorias = calcularConsumoCalorias(tasaMetabolicaBasal); //invocación de función
        System.out.println("\nSu consumo de calorias de acuerdo a su nivel de actividad fisica es: "+consumoCalorias);
        
        caloriasDeficit = calcularCaloriasDeficit(consumoCalorias); //invocación de función
        System.out.println("\nSu consumo de calorias en deficit es: "+caloriasDeficit);
        
        caloriasMacros=calcularCaloriasMacros(caloriasDeficit); //invocación de función
        System.out.println("\nSU DISTRIBUCION DE MACRONUTRIENTES EN DEFICIT CALORICO ES"
                + "\n\n> Calorias de proteinas: "+caloriasMacros[0]
                + "\n> Calorias de grasas: "+caloriasMacros[1]
                + "\n> Calorias de carbohidratos: "+caloriasMacros[2]);
        
        gramosMacros=calcularGramosMacros(caloriasMacros); //invocación de función
        System.out.println("\n> Gramos de proteinas: "+gramosMacros[0]
                + "\n> Gramos de grasas: "+gramosMacros[1]
                + "\n> Gramos de carbohidratos: "+gramosMacros[2]);
        
    }
}

