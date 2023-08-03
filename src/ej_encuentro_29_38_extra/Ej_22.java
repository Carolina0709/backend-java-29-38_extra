/*
Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y
muestre la suma de sus elementos.
 */
package ej_encuentro_29_38_extra;

import java.util.Scanner;

public class Ej_22 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int dimension, sumaMatriz=0;
        
        System.out.print("Ingresa la dimension de tu matriz: ");
        dimension=leer.nextInt();
        
        int[][] matriz = new int[dimension][dimension];
        
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                matriz[i][j] = (int) (Math.random()*10+1);
                sumaMatriz += matriz[i][j];
            }
        }
        System.out.println("\nLa matriz es: ");
        muestraMatriz(matriz);
        System.out.println("\nY la suma de sus elementos es: " + sumaMatriz);
    }
    public static void muestraMatriz(int[][] matriz){
        for(int[] fila: matriz){
            for(int elemento: fila){
                System.out.print("["+elemento+"]");
            }
            System.out.println("");
        }
    }
     
}
