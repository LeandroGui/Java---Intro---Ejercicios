/*
 * Escribir un programa que lea un número entero por teclado y muestre por pantalla
 * el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
 * Math.sqrt().
 */


package ejercicios;

import java.util.Scanner;

/**
 *
 * @author LEANDRO
 */
public class ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        int num = leer.nextInt();
        int doble = num * 2;
        int triple = num * 3;
        double raizcuadrada = Math.sqrt(num);
        System.out.println("El numero ingresado es: " + num);
        System.out.println("El doble del numero ingresado es: " + doble);
        System.out.println("El triple del numero ingresado es: " + triple);
        System.out.println("La raiz cuadrada del numero ingresado es: " + raizcuadrada);
        leer.close();
    }
    
}

