/*
Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
equivalente en romano.
 */
package ej_encuentro_29_38_extra;

import java.util.Scanner;


public class Ej_4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num = 0;
        String[] vectorRomano = {"I","II","III","IV","V","VI","VII","VIII","IX","X"};
        
        while(num<1 || num>10){
            System.out.print("Ingresa un numero del 1 al 10: ");
            num=leer.nextInt();
        }
        System.out.println("El numero " + num + " en romano es: " + vectorRomano[num - 1]);
        
    }
}
