/*
Crear un programa que dibuje una escalera de números, donde cada línea de números
comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
usuario al comenzar. Ejemplo: si se ingresa el número 3:

1
12
123
 */
package ej_encuentro_29_38_extra;

import java.util.Scanner;


public class Ej_13 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        String res="";
        
        System.out.print("Ingresa un numero: ");
        num = leer.nextInt();
        
        for (int i = 0; i < num; i++) { 
            res = res.concat(String.valueOf(i+1));
            System.out.println(res);
        }
        
        
    }
}
