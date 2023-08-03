/*
Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
elementos).
 */
package ej_encuentro_29_38_extra;

import java.util.Scanner;

public class Ej_19 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int dimension;
        boolean ban = true;
        
        System.out.print("Ingresa la dimension de los vectores: ");
        dimension = leer.nextInt();
        
        int[] vector1 = new int[dimension];
        int[] vector2 = new int[dimension];
        
        for (int i = 0; i < dimension; i++) {
            vector1[i] = (int) (Math.random()*2+1);
            vector2[i] = (int) (Math.random()*2+1);
        }
        
       
        for (int i = 0;  ban == true && i<dimension; i++) {
            if(vector1[i] != vector2[i]){
                ban=false;
                System.out.println("\nSe ha encontrado diferencia en la posicion: " + (i+1));
            }
        }
        if(ban == true){
            System.out.println("\nLos vectores son iguales");
        }
    }
}
