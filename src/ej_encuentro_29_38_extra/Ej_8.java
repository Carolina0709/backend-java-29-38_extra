/*
 Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
 */
package ej_encuentro_29_38_extra;

import java.util.Scanner;

public class Ej_8 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num = 1, canLeidos=0, canPares=0, canImpares=0;
        boolean ban=true;
        
        while(ban){//se ejecuta mientras el numero sea multiplo de 5, es decir, la bandera no cambie a falso
            System.out.print("Ingresa un numero: ");
            num = leer.nextInt();
            
            if(num < 1){
                num = -1; //volvemos numero a su forma inicial -1 para que entre en el while
                continue; //Saltarse todos los numeros negativos pero sin salir del while
            }
            if(num%5 == 0){
                ban=false;
                break;
            }
            
            
            if(num%2 == 0){
                canLeidos++;
                canPares++;
            }else{
                canLeidos++;
                canImpares++;
            }
        }
        System.out.println("\nSegun los numeros introducidos antes del multiplo de 5: " +
                            "\n\nSe ingresaron: " + canLeidos + " numeros en total"
                            + "\nDe los cuales " + canPares+ " fueron pares "
                            + "\nY " + canImpares + " fueron impares.");
    }
}
