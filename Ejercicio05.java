/*
 * Dada una cantidad de grados centígrados se debe mostrar su equivalente en
 * grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */


package ejercicios;

import java.util.Scanner;

/**
 *
 * @author LEANDRO
 */
public class ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la temperatura en Celsius");
        double celsius = scan.nextDouble();
        double farenheit;
        farenheit = 32 + (9 * celsius / 5);
        System.out.println(celsius + "ºC" + " son: " + farenheit + "ºF");
        scan.close();
    }
    
}

