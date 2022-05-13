/*
 * Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre
 * por pantalla.
 */


package ejercicios;

import java.util.Scanner;

/**
 *
 * @author LEANDRO
 */
public class ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        String nombre;
        
        System.out.println("Ingresa tu nombre");
        
        nombre = leer.next();
        
        System.out.println("Tu nombre es: " + nombre );
    }
    
}

