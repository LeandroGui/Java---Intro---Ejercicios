/*
 * Implementar un programa que dado dos números enteros determine cuál es el
 * mayor y lo muestre por pantalla.
 */


package ejercicios;

import static java.lang.Math.max;
import java.util.Scanner;

/**
 *
 * @author LEANDRO
 */
public class ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int num1 = scan.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = scan.nextInt();
        System.out.println("El primer numero ingresado es:  " + num1);
        System.out.println("El segundo numero ingresado es: " + num2);
        if (num1 != num2){ 
        System.out.println("El numero mayor es: " + max(num1,num2));
        }
        if(num1 == num2){
            System.out.println("Los numeros ingresados son iguales");
        }
        scan.close();
    }
    
}

