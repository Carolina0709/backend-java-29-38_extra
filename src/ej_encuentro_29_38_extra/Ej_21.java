/*
Los profesores del curso de programación de Egg necesitan llevar un registro de las notas
adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y
desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por trabajos
prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
    Primer trabajo práctico evaluativo 10%
    Segundo trabajo práctico evaluativo 15%
    Primer Integrador 25%
    Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del
programa los profesores necesitan obtener por pantalla la cantidad de aprobados y
desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o
igual al 7 de sus notas del curso.
 */
package ej_encuentro_29_38_extra;

import java.util.Scanner;

public class Ej_21 {
    public static void main(String[] args) {
        int sumaAprobados=0, sumaReprobados=0;
        String[][] notas = new String[10][2];
        
        obtenPromedio(notas);
        
        for (int i = 0; i < notas.length; i++) {
            if(Integer.parseInt(notas[i][1]) >= 7 ){
                sumaAprobados++;
            }else{
                sumaReprobados++;
            }
        }
        
        System.out.println("\nLa cantidad de alumnos aprobados es: " + sumaAprobados);
        System.out.println("La cantidad de alumnos reprobados es: " + sumaReprobados);
        
    }
    public static void obtenPromedio(String[][] notas){
        Scanner leer = new Scanner(System.in);
        Scanner leerInt = new Scanner(System.in);
        int promedio=0;
        
        for (int i = 0; i <notas.length; i++) {
            System.out.print("\nIngresa el nombre del alumno: ");
            notas[i][0] = leer.nextLine();
            System.out.print("Ingresa nota de su primer trabajo practico: ");
            promedio += leerInt.nextInt()*0.10;
            System.out.print("Ingresa nota de su segundo trabajo practico: ");
            promedio += leerInt.nextInt()*0.15;
            System.out.print("Ingresa nota de su primer integrador: ");
            promedio += leerInt.nextInt()*0.25;
            System.out.print("Ingresa nota de su primer trabajo practico: ");
            promedio += leerInt.nextInt()*0.50;
            
            notas[i][1] = String.valueOf(promedio);
            promedio=0;
            
        }
    }
   
}
