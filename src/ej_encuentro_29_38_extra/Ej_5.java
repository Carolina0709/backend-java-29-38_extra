/*
Una obra social tiene tres clases de socios:
    o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
        todos los tipos de tratamientos.
    o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
        los mismos tratamientos que los socios del tipo A.
    o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
        tratamientos.
    o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
        real que represente el costo del tratamiento (previo al descuento) y determine el
        importe en efectivo a pagar por dicho socio.
 */
package ej_encuentro_29_38_extra;

import java.util.Scanner;

/**
 *
 * @author caro9
 */
public class Ej_5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String socio;
        double costo;
        
        System.out.print("Ingresa el tipo de socio (A/B/C): ");
        socio = leer.nextLine().toUpperCase();
        
        System.out.print("Ingresa el costo de tu tratamiento: ");
        costo = leer.nextDouble();
        
        switch(socio){
            case "A":{
                System.out.println("El total de tu tratamiento es: " +  (costo * .50));
                break;
            } 
            case "B":{
                System.out.println("El total de tu tratamiento es: " + (costo * 0.65));
                break;
            }
            case "C":{
                System.out.println("El total de tu tratamiento es: " + costo);
                break;
            }
            default: {
                System.out.println("El tipo de socio no es correcto. ");
                return;
            }
        
        }
    }
}
