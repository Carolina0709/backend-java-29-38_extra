/*
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
por pantalla la sopa de letras creada.

Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
de Java substring(), Length() y Math.random().
 */
package ej_encuentro_29_38_extra;

import java.util.Scanner;

public class Ej_23 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String palabra="";
        int fila = (int)(Math.random()*20), columna = (int)(Math.random()*15);
        String[][] sopaLetras = new String[20][20];
        
        for (int i = 0; i < 5; i++) { //for para ingresar las 5 palabras 
           while(palabra.length() < 3 || palabra.length() > 5){//validar longitud de palabras
               System.out.print("Ingresa la " + (i+1) +" palabra de 3 a 5 digitos: ");
               palabra = leer.nextLine().toUpperCase();
           }
           //buscar un nuevo lugar en la matriz en caso de que donde se quiere ingresar no este vacio
           while(campoVacio(sopaLetras, fila, columna) == false){
               fila = (int)(Math.random()*20);
               columna = (int)(Math.random()*15);
           }
           insertaPalabra(sopaLetras, palabra, fila, columna);
           palabra="";
        }
        rellenaDeNumeros(sopaLetras);
        System.out.println("\nLa sopa de letras es la siguiente: \n");
        muestraSopa(sopaLetras);
    }
    //retornar true si los 5 campos a partir de fila y columna estan vacios
    public static boolean campoVacio(String[][] sopaLetras, int fila, int columna){
        int conta=0;
        //iniciar a contar desde columna hasta columna+5 ejemplo: 9 -> 14
        for (int i = columna; i < columna+5; i++) {
            if(sopaLetras[fila][i] == null){
                conta++;
            }
        }
        if(conta == 5){ //si los 5 lugares estan vacios retorna verdadero sino falso
            return true;
        }else{
            return false;
        }
    }
    //insertar palabra dentro de la matriz 
    public static void insertaPalabra(String[][] sopaLetras, String palabra, int fila, int columna ){
        int conta=0;
        //apartir de la columna hasta la longitud de la palabra 
        for (int i = columna; i < columna+palabra.length(); i++) {
            //ir insertando caracter por caracter 
            sopaLetras[fila][i] = palabra.substring(conta,conta+1);
            conta++;
        }
    }
    //Imprimir toda la sopa de letras 
    public static void muestraSopa(String[][] sopaLetras){
        for( String[] fila: sopaLetras){
            for(String elementos: fila){
                System.out.print("["+elementos+"]");
            }
            System.out.println("");
        }
    }
    //rellenar de numeros los espacios vacios 
    public static void rellenaDeNumeros(String[][] sopaLetras){
        for (int i = 0; i < sopaLetras.length; i++) {
            for (int j = 0; j < sopaLetras.length; j++) {
                if(sopaLetras[i][j]==null){
                    sopaLetras[i][j]=String.valueOf((int)(Math.random()*10));
                }
            }
        }
    }
}
