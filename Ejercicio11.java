/*
 * Escriba un programa que pida una frase o palabra y valide si la primera letra de esa
 * frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por
 * pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
 * “INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
 */


package ejercicios;

import java.util.Scanner;

/**
 *
 * @author LEANDRO
 */
public class ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase o palabra");
        frase = scan.nextLine();
        scan.close();
        System.out.println("La frase ingresada es: " + frase);
        String primeraLetra = frase.substring(0,1);
        if(primeraLetra.toUpperCase().equals("A")){
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }
    
}

