/*
Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
N, con los valores ingresados por el usuario.
 */
package ej_encuentro_29_38_extra;

import java.util.Scanner;

public class Ej_18 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int dimension, sumaElementos=0;
        
        System.out.print("Ingresa la dimension del vector: ");
        dimension = leer.nextInt();
        
        int[] elementos = new int[dimension];
        
        for (int i = 0; i < dimension; i++) {
            System.out.print("Ingresa el valor para la poscion " + (i+1)+ ": ");
            elementos[i] = leer.nextInt();
            sumaElementos += elementos[i];
        }
        System.out.println("La suma de los elementos del vector es: " + sumaElementos);
    }
}
