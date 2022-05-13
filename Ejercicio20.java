/*
 * Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el
 * número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
 *
 *
 *  5 *****
 *  3 ***
 *  11 ***********
 *  2 **
 */


package ejercicios;

import java.util.Scanner;

/**
 *
 * @author LEANDRO
 */
public class ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = leer.nextInt();
        System.out.println("Ingrese el tercer numero");
        int num3 = leer.nextInt();
        System.out.println("Ingrese el cuarto numero");
        int num4 = leer.nextInt();
        int i, j, asterisco;
        asterisco = num1;
        System.out.println("Pantalla:");
        for (i = 0; i < 4; i++){
            System.out.print(""+ asterisco);
            for (j = 0; j < asterisco; j++) {
                System.out.print("*");
            } System.out.println("");
            switch(i) {
                case 0:
                    asterisco = num2;
                    break;
                case 1:
                    asterisco = num3;
                    break;
                case 2:
                    asterisco = num4;
                    break;
                
        }
        }
        
    }

    
}
