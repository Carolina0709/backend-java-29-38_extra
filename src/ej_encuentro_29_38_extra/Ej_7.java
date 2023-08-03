/*
Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
de n números (n>0). El valor de n se solicitará al principio del programa y los números
serán introducidos por el usuario. Realice dos versiones del programa, una usando el
bucle “while” y otra con el bucle “do - while”.
 */
package ej_encuentro_29_38_extra;

import java.util.Scanner;

public class Ej_7 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numeros=0;
       
        
        while(numeros<1){
            System.out.print("Ingresa la cantidad de numeros: ");
            numeros = leer.nextInt();
        }
         double[] vectorNumeros = new double[numeros];
        
        for (int i = 0; i < numeros; i++) {
            System.out.print("Ingresa el valor para " + (i+1) + ": ");
            vectorNumeros[i] = leer.nextDouble();
        }
        
        conDoWhile(vectorNumeros);
        conWhile(vectorNumeros);
    }
    public static void conDoWhile(double[] vectorNumeros){
        int conta = 0;
        double max = 0, min = vectorNumeros[conta], promedio = 0, sumaPromedio = 0;
        do{
            max = Math.max(max, vectorNumeros[conta]);
            min = Math.min(min, vectorNumeros[conta]);
            sumaPromedio += vectorNumeros[conta];
            promedio = sumaPromedio /(conta+1);
            conta++;
        }while(conta < vectorNumeros.length);
        
        System.out.println("\n---------- DO-WHILE ------------ "
                          + "\nEl valor maximo es: " + max
                          + "\nEl valor minimo es: " + min
                          + "\nEl promedio es: " + promedio);
  
       
    }
    public static void conWhile(double[] vectorNumeros){
        int conta = 0;
        double max = 0, min = vectorNumeros[conta], promedio = 0, sumaPromedio = 0;
        
        while(conta < vectorNumeros.length){
            max = Math.max(max, vectorNumeros[conta]);
            min = Math.min(min, vectorNumeros[conta]);
            sumaPromedio += vectorNumeros[conta];
            promedio = sumaPromedio /(conta+1);
            conta++;
        }
        System.out.println("\n----------- WHILE -------------- "
                          + "\nEl valor maximo es: " + max
                          + "\nEl valor minimo es: " + min
                          + "\nEl promedio es: " + promedio);
  
    }
}
