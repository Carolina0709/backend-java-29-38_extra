/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
 */
package ej_encuentro_29_38_extra;

import java.util.Scanner;


public class Ej_3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String letra;
        
        System.out.print("Ingresa una letra: ");
        letra = leer.nextLine().toUpperCase();
        
        if(letra.equals("A") || letra.equals("E") || letra.equals("I") 
                || letra.equals("O") || letra.equals("U") ){
            System.out.println("La letra ingresada ES una vocal");
        }else{
            System.out.println("La letra ingresada NO es una vocal");
        }
    }
    
    
    
}
