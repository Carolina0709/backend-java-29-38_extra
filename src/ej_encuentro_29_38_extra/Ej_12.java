/*
Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-
0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.
 */
package ej_encuentro_29_38_extra;


public class Ej_12 {
    public static void main(String[] args) {
        String I,J, K;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k <10; k++) {
                    K = Integer.toString(k);
                    if(K.equals("3")){
                        K = "E";
                    }
                     J = Integer.toString(j);
                    if(J.equals("3")){
                        J = "E";
                    }
                     I = Integer.toString(i);
                    if(I.equals("3")){
                        I = "E";
                    }
                    System.out.println(I+"-"+J+"-"+K);
                    
                }
               
            }
        }
    }
   
}
