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
public class EJERCICIO2 {
    static byte seleccionarConversion(){
        Scanner lector = new Scanner(System.in);
        byte operacion;
        System.out.println("====================================\n");
        System.out.println("""
                           CONVERSIONES
                           1. De Moneda
                           2. De Peso
                           3. De Escalas de Temperatura
                           0. Salir""");
        System.out.println("\n====================================\n");
        System.out.println(">>> Ingrese el numero de conversion que desea realizar");
        operacion=lector.nextByte();
        
        return operacion;
    }
    
    static String realizarConversionMoneda(){
        Scanner lector = new Scanner(System.in);
        byte operacion;
        double tipoCambio=0, pesos, dolares;
        String mensaje="";
        
        System.out.println("\n*******************************************************");
        System.out.println("""
                           CONVERSIONES DE MONEDA
                           1. De Pesos Mexicanos a Dolares
                           2. De Dolares a Pesos Mexicanos
                           0. Regresar""");
        System.out.println("*******************************************************\n");
        
        do { //El ciclo se repetirá hasta que el usuario ingrese el número 1, 2 o 0
            System.out.println("--- Ingrese el numero de conversion que desea realizar");
            operacion=lector.nextByte();
        } while (operacion!=1 && operacion!=2 && operacion!=0);
        
        
        if (operacion==1 || operacion==2) {
            System.out.println("Ingrese el tipo de cambio del dolar en pesos mexicanos: ");
            tipoCambio=lector.nextDouble();
        }
        
        if (operacion==1) { //Se ingresa a la conversion de pesos a dólares
            System.out.println("Ingrese la cantidad de pesos mexicanos:");
            pesos=lector.nextDouble();
            mensaje = pesos+" pesos equivalen a "+conversionPesoDolar(pesos,tipoCambio)+" dolares\n";
        }

        if (operacion==2) { //Se ingresa a la conversion de dólares a pesos
            System.out.println("Ingrese la cantidad de dolares:");
            dolares=lector.nextDouble();
            mensaje = dolares+" dolares equivalen a "+conversionDolarPeso(dolares,tipoCambio)+" pesos\n";
        }
        
        return mensaje;
    }
    
    static double conversionPesoDolar(double pesos, double tipoCambio){
        return pesos/tipoCambio;
    }
    
    static double conversionDolarPeso(double dolares, double tipoCambio){
        return dolares*tipoCambio;
    }
    
    static String realizarConversionPeso(){
        Scanner lector = new Scanner(System.in);
        byte operacion;
        double kilos, libras;
        String mensaje="";
        
        System.out.println("\n*******************************************************");
        System.out.println("""
                           CONVERSIONES DE PESO
                           1. De Libras a Kilogramos
                           2. De Kilogramos a Libras
                           0. Regresar""");
        System.out.println("*******************************************************\n");
        
        do { //El ciclo se repetirá hasta que el usuario ingrese el número 1, 2 o 0
            System.out.println("--- Ingrese el numero de conversion que desea realizar");
            operacion=lector.nextByte();
        } while (operacion!=1 && operacion!=2 && operacion!=0);        
        
        if (operacion==1) { //Se ingresa a la conversion de libras a kilogramos
            System.out.println("Ingrese la cantidad de libras:");
            libras=lector.nextDouble();
            mensaje = libras+" libras equivalen a "+conversionLibrasKilos(libras)+" kilogramos\n";
        }

        if (operacion==2) { //Se ingresa a la conversion de kilogramos a libras
            System.out.println("Ingrese la cantidad de kilos:");
            kilos=lector.nextDouble();
            mensaje = kilos+" kilogramos equivalen a "+conversionKilosLibras(kilos)+" libras\n";
        }
        
        return mensaje;
    }

    static double conversionLibrasKilos(double libras){
        return libras*0.4535;
    }
    
    static double conversionKilosLibras(double kilos){
        return kilos/0.4535;
    }
    
    static String realizarConversionTemperatura(){
        Scanner lector = new Scanner(System.in);
        byte operacion;
        double gradosCelsius=0, gradosFahrenheit, gradosKelvin;
        String mensaje="";
        
        System.out.println("\n*******************************************************");
        System.out.println("""
                           CONVERSIONES DE ESCALAS DE TEMPERATURA
                           1. De Celsius a Fahrenheit
                           2. De Fahrenheit a Celsius
                           3. De Celsius a Kelvin
                           4. De Kelvin a Celsius
                           0. Regresar""");
        System.out.println("*******************************************************\n");

        do { //El ciclo se repetirá hasta que el usuario ingrese un número entre 1 y 4 o 0
            System.out.println("--- Ingrese el numero de conversion que desea realizar");
            operacion=lector.nextByte();
        } while (operacion!=1 && operacion!=2  && operacion!=3 && operacion!=4 && operacion!=0);
        
        if (operacion==1 || operacion==3) { //Se solicitan los grados Celsius
            System.out.println("Ingrese los grados Celsius:");
            gradosCelsius=lector.nextDouble();
        }
        
        if (operacion==1) { //Se ingresa a la conversion de Celsius a Fahrenheit
            mensaje = gradosCelsius+" Celsius equivalen a "+conversionCelsiusFahrenheit(gradosCelsius)+" Fahrenheit\n";
        }
        
        if (operacion==3) { //Se ingresa a la conversion de Celsius a Kevin
            mensaje = gradosCelsius+" Celsius equivalen a "+conversionCelsiusKelvin(gradosCelsius)+" Kelvin\n";
        }
        
        if (operacion==2) { //Se ingresa a la conversion de Fahrenheit a Celsius
            System.out.println("Ingrese los grados Fahrenheit:");
            gradosFahrenheit=lector.nextDouble();
            mensaje = gradosFahrenheit+" Fahrenheit equivalen a "+conversionFahrenheitCelsius(gradosFahrenheit)+" Celsius\n";
        }
        
        if (operacion==4) { //Se ingresa a la conversion de Kelvin a Celsius
            System.out.println("Ingrese los grados Kelvin:");
            gradosKelvin=lector.nextDouble();
            mensaje = gradosKelvin+" Kelvin equivalen a "+conversionKelvinCelsius(gradosKelvin)+" Celsius\n";
        }
        
        return mensaje;
    }
            
    static double conversionCelsiusFahrenheit(double gradosCelsius){
        return (gradosCelsius*9/5)+32;
    }
    
    static double conversionFahrenheitCelsius(double gradosFahrenheit){
        return (gradosFahrenheit-32)/(9/5);
    }
    
    static double conversionCelsiusKelvin(double gradosCelsius){
        return gradosCelsius+273.15;
    }
    
    static double conversionKelvinCelsius(double gradosKelvin){
        return gradosKelvin-273.15;
    }
    
    public static void main(String[] args) {
        byte operacion;
        do {
            operacion=seleccionarConversion(); //Se invoca al método "seleccionarConversion"
            
            switch (operacion) {
                case 0:
                    System.out.println("Hackeando la NASA... aaahh no te creas.\n\nEjecucion terminada...");
                    break;
                case 1:
                    System.out.println(realizarConversionMoneda());
                    break;
                case 2:
                    System.out.println(realizarConversionPeso());
                    break;
                case 3:
                    System.out.println(realizarConversionTemperatura());
                    break;
                default:
                    System.out.println("El numero de operacion no es valido. =(\n");
            }
        } while (operacion!=0);
    }
}

