/*
Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
debajo de 1.60 mts. y el promedio de estaturas en general.
 */
package ej_encuentro_29_38_extra;

import java.util.Scanner;


public class Ej_6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int personas;
        double altura, sumaMenor160=0, contaMenor160=0, sumaAlturas=0;
        
        System.out.print("Ingresa la cantidad de personas: ");
        personas = leer.nextInt();
        
        for (int i = 0; i < personas; i++) {
            System.out.print("Ingresa la altura para la persona " + (i+1) + ": " );
            altura = leer.nextDouble();
            
            if(altura < 160){
                sumaMenor160 += altura;
                contaMenor160++;
            }
            sumaAlturas += altura;
        }
        
        System.out.println("El promedio de las estaturas menores a 160 es: " + (sumaMenor160/contaMenor160));
        System.out.println("El promedio general de las estaturas es: " + (sumaAlturas/personas));
        
    }
}
