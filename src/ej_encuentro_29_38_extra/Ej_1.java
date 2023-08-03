/*
 Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
 usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
package ej_encuentro_29_38_extra;

import java.util.Scanner;


public class Ej_1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int minutos, horas, dias;
        
        System.out.print("Ingrese el tiempo en minutos: ");
        minutos = leer.nextInt();

        horas = minutos / 60;
        dias = horas / 24;
        horas %= 24;

        System.out.println("En "+ minutos+ " minutos, hay: " + dias + " días y " + horas + " horas");
      
    }
}
