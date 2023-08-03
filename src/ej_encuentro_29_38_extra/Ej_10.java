/*
Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.

NOTA: Existe otra forma de generar numeros aleatorios y es: 

 Random random = new Random(); //creas el objeto de la clase
 int numeroAleatorio = random.nextInt(11); //generas el numero aleatorio 
*/
package ej_encuentro_29_38_extra;

import java.util.Scanner;


public class Ej_10 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int num1 = (int) (Math.random()*11), num2 = (int) (Math.random()*11);
        int multi = num1*num2, num;
        //System.out.println(multi);
        boolean ban = true;
        
        System.out.print("Ingresa un numero para adivinar la multiplicacion: ");
                num = leer.nextInt();
        
        while(ban){
            
            if(num == multi){
                System.out.println("\nFelicidades! Haz adivinado la multiplicacion.");
                break;
            }
            
            System.out.print("Error! Intenta nuevamente: ");
            num = leer.nextInt();
            
            
            
        }
    }
}
