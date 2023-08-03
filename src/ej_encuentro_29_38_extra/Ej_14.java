/*
Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad
de hijos para averiguar la media de edad de los hijos de todas las familias.
 */
package ej_encuentro_29_38_extra;

import java.util.Scanner;


public class Ej_14 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int familias, hijos, edad, sumaEdades=0, totalHijos=0;
        double promedio;
        
        System.out.print("Ingresa el numero de familias: ");
        familias = leer.nextInt();
        
        for (int i = 0; i < familias; i++) {
            System.out.print("\nIngresa la cantidad de hijos de la familia " + (i+1) + ": ");
            hijos = leer.nextInt();
            totalHijos+=hijos;
            for (int j = 0; j < hijos; j++) {
                System.out.print("Ingresa la edad del hijo " + (j+1) + ": ");
                edad = leer.nextInt();
                sumaEdades += edad;
            }
        }
        System.out.println("\nLa media de edad de todos los hijos es: " + (sumaEdades/totalHijos) );
    }
}
