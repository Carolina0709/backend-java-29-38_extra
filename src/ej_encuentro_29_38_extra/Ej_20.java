/*
Crear una función rellene un vector con números aleatorios, pasándole un arreglo por
parámetro. Después haremos otra función o procedimiento que imprima el vector.
 */
package ej_encuentro_29_38_extra;

import java.util.Scanner;

public class Ej_20 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int dimension;
        
        System.out.print("Ingresa la dimension del vector: ");
        dimension = leer.nextInt();
        
        int[] vector = new int[dimension];
        
        rellenaVector(vector);
        imprimeVector(vector);
    }
    
    public static void rellenaVector(int[] vector){
        
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random()*10+1);
        }
    }
    public static void imprimeVector(int[] vector){
        System.out.println("\nEl vector es el siguiente: ");
        for(int elemento: vector){
            System.out.print("["+elemento+"]");
        }
    }
}
