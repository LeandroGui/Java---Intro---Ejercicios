/*
 * Crear un programa que dado un numero determine si es par o impar.
 */


package ejercicios;

import java.util.Scanner;

/**
 *
 * @author LEANDRO
 */
public class ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner scan = new Scanner(System.in);
       System.out.println("Ingrese un numero");
       int num = scan.nextInt();
       System.out.println("El numero ingresado es: " + num);
       if (num % 2 == 0){
           System.out.println("El numero ingresado es PAR");
           
       } else {
           System.out.println("El numero ingresado es IMPAR");
       }
       scan.close();
    }
    
}

