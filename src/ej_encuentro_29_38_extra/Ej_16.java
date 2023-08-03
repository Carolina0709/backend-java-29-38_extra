/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
las personas ingresadas por teclado e indique si son mayores o menores de edad.
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 */
package ej_encuentro_29_38_extra;

import java.util.Scanner;

public class Ej_16 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Scanner leerEntero = new Scanner(System.in);
        boolean ban = true;
        int personas, conta=0;
        String op;
        
        System.out.print("Ingresa el numero de personas: ");
        personas = leerEntero.nextInt();
                
        String[][] datosPersonas = new String[personas][2];
        
        for (int i = 0; i < personas; i++) {
            System.out.print("\nIngresa el nombre de la persona " + (i+1) + ": ");
            datosPersonas[i][0] = leer.nextLine();
            System.out.print("Ingresa la edad de la persona" + (i+1) + ": ");
            datosPersonas[i][1] = leer.nextLine();
        }
        
        while(ban){
            System.out.println("\nDatos de la persona " + (conta+1) + ": "
                    + "\nNombre: " + datosPersonas[conta][0] 
                    + "\nEdad: " + datosPersonas[conta][1]);
            if(Integer.parseInt(datosPersonas[conta][1]) >= 18){
                System.out.println("Y la persona es mayor de edad");
            }else{
                System.out.println("Y la persona es menor de edad");
            }
            
            System.out.println("\nDesea mostrar los datos de la siguiente persona? S/N: ");
            op = leer.nextLine();
            
            if(op.toUpperCase().equals("N")){
                ban = false;
                break;
            }
            conta++;
            if(conta == personas){
                System.out.println("\nYa no hay mas personas por mostrar");
                break;
            }
        }
    }
}
