/*
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
package ej_encuentro_29_38_extra;


public class Ej_2 {
    public static void main(String[] args) {
        int A=1, B=2, C=3, D=4, aux;
        
        System.out.println("Los valores iniciales son: "
                + "\nA: " + A
                + "\nB: " + B
                + "\nC: " + C
                + "\nD: " + D);
        aux=B;
        B=C;
        C=A;
        A=D;
        D=aux;
        
         System.out.println("Los valores invertidos son: "
                + "\nA: " + A
                + "\nB: " + B
                + "\nC: " + C
                + "\nD: " + D);
    }
}
