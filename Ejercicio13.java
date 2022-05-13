/*
 * Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10
 * la nota se pedirá de nuevo hasta que la nota sea correcta.
 */


package ejercicios;

import java.util.Scanner;

/**
 *
 * @author LEANDRO
 */
public class ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int nota;
        do{
            System.out.println("Ingrese una nota entre 0 y 10");
            nota = scan.nextInt();
        } while(nota < 0 || nota > 10);
        System.out.println("La nota es: " + nota);
        scan.close();
    }
    
}

