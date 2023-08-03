/*
Simular la división usando solamente restas. Dados dos números enteros mayores que
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método:
Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
resultado es el residuo, y el número de restas realizadas es el cociente.
    Por ejemplo: 50 / 13:
        50(dividendo) – 13(divisor) = 37 una resta realizada
        37 – 13 = 24 dos restas realizadas
        24 – 13 = 11 tres restas realizadas
    dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.
 */
package ej_encuentro_29_38_extra;

import java.util.Scanner;


public class Ej_9 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int dividendo, divisor, conta=0;
        
        System.out.print("Ingresa tu divisor: ");
        divisor = leer.nextInt();
        
        System.out.print("Ingresa tu dividendo: ");
        dividendo = leer.nextInt();
        
        while(divisor < dividendo){
            System.out.println(dividendo+" - "+ divisor+" = " + (dividendo-divisor));
            dividendo -= divisor;
            conta +=1;
        }
        System.out.println("\nEl cociente de la suma es: " + conta);
        System.out.println("Y su residuo es: " + (dividendo));
    }
}
