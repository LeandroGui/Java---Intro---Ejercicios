/*
 * Realizar un programa que solo permita introducir solo frases o palabras de 8 de
 * largo. Si el usuario ingresa una frase o palabra de 8 de largo se deber� de imprimir
 * un mensaje por pantalla que diga �CORRECTO�, en caso contrario, se deber�
 * imprimir �INCORRECTO�. Nota: investigar la funci�n Lenght() en Java.
 */


package ejercicios;

import java.util.Scanner;

/**
 *
 * @author LEANDRO
 */
public class ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String frase;
        System.out.println("Ingrese una frase");
        frase = leer.nextLine();
        if (frase.length()== 8) {
            System.out.println("Correcto");
    }   else {
            System.out.println("Incorrecto");
    }
    }
    
}
