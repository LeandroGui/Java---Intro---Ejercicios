/*
 * Escribir un programa que pida dos números enteros por teclado y calcule la suma
 * de los dos. El programa deberá después mostrar el resultado de la suma.
 */

package ejercicios;

import java.util.Scanner;

/**
 *
 * @author LEANDRO
 */
public class ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        System.out.println("Ingrese otro numero");
        int num2 = leer.nextInt();
        System.out.println("La suma es: "+ (num + num2));
        
    }
    
}

