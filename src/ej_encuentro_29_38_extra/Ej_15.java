/*
Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
matemática y deben devolver sus resultados para imprimirlos en el main.
 */
package ej_encuentro_29_38_extra;

import java.util.Scanner;

public class Ej_15 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double num1, num2;
        int op;
        
        System.out.print("Ingresa el primer valor: ");
        num1 = leer.nextDouble();
        System.out.print("Ingresa el segundo valor: ");
        num2 = leer.nextDouble();
        
        System.out.println("Elige una opcion: "
                + "\n1. Sumar"
                + "\n2. Restar"
                + "\n3. Multplicar"
                + "\n4. Dividir"
                + "\n5. Salir");
        op = leer.nextInt();
        
        switch(op){
            case 1: System.out.println("El resultado es: " + sumar(num1, num2));
                   break;
            case 2: System.out.println("El resultado es: " + restar(num1, num2));
                   break;       
            case 3: System.out.println("El resultado es: " + multi(num1, num2));
                   break;
            case 4: System.out.println("El resultado es: " + dividir(num1, num2));
                   break; 
            default: System.out.println("Opcion incorrecta");
        } 
        
    }
    public static double sumar(double num1, double num2){
        double res = num1 + num2;
        return res;
    }
    public static double restar(double num1, double num2){
        double res = num1 - num2;
        return res;
    }
    public static double multi(double num1, double num2){
        double res = num1 * num2;
        return res;
    }
    public static double dividir(double num1, double num2){
        double res = num1 / num2;
        return res;
    }
    
}
