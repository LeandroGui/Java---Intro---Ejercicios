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
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Se crea una variable Scanner que se utiliza para leer datos del usuario
        Scanner leer = new Scanner(System.in);
        // Se crea una variable cadena (string) que se utiliza para leer datos del usuario
        String nombre;
        // Muestra un mensaje por pantalla
        System.out.println("Ingresa tu nombre");
        // Leemos el nobre de la persona en la variable nombre
        nombre = leer.next();
        //mostramos por consola un saludo personalizado
        System.out.println("Hola Mundo! Soy " + nombre + " y estoy programando en Java!");
    }
    
}

