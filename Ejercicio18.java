/*
 * Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números
 * del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya
 * por una E. Ejemplo:
 * 
 *  0-0-0
 *  0-0-1
 *  0-0-2
 *  0-0-E
 *  0-0-4
 *  .
 *  .
 *  0-1-2
 *  0-1-E
 *
 * Nota: investigar función equals() y como convertir números a String.
 */


package ejercicios;


import java.util.Scanner;

/**
 *
 * @author LEANDRO
 */
public class ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Limitaremos hasta donde contara el contador:");
        System.out.println("Ingrese el primer digito del contador (X-X-X)");
        int n = leer.nextInt();
        int i,j;
        String conversor;
        for (i=0; i<=n; i++) {
            conversor = String.valueOf(i);
            if(i<10) {
                System.out.println("Contador: 00"+ conversor.replace('3','E'));
            } else {
                if(i<100) {
                    System.out.println("Contador: 0"+ conversor.replace('3','E'));
                } 
                else {
                    if(i>99){
                    System.out.println("Contador: "+ conversor.replace('3','E'));
                    }
                }            
            }        
        }
    }
}
