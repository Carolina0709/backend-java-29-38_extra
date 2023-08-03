/*
Realizar un programa que complete un vector con los N primeros números de la sucesión
de Fibonacci. Recordar que la sucesión de Fibonacci es la sucesión de los siguientes
números:
1, 1, 2, 3, 5, 8, 13, 21, 34, ...
Donde cada uno de los números se calcula sumando los dos anteriores a él. Por ejemplo:
La sucesión del número 2 se calcula sumando (1+1)
Análogamente, la sucesión del número 3 es (1+2),
Y la del 5 es (2+3),
Y así sucesivamente...

 */
package ej_encuentro_29_38_extra;

import java.util.Scanner;

public class Ej_24 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        
        System.out.print("Ingresa el numero N de la sucesion: ");
        num = leer.nextInt();
        
        int[] vector = new int[num];
        
        vector[0]=1;
        vector[1]=1;
        
        if(num > 2){
            for (int i = 2; i < vector.length; i++) {
                vector[i] = vector[i-1] + vector[i-2];
            }
        }
        System.out.println("\nLa sucesion de Fibonacci hasta el elemento " + num + " es: ");
        for(int elementos:vector){
            System.out.print("["+elementos+"]");
        }
        System.out.println("");
        
    }
}
