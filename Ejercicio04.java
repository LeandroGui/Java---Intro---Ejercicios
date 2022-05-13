/*
 * Escribir un programa que pida una frase y la muestre toda en may�sculas y
 * despu�s toda en min�sculas. Nota: investigar la funci�n toUpperCase() y
 * toLowerCase() en Java.
 */


package ejercicios;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author LEANDRO
 */
public class ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        // Se crea una variable cadena (string) que se utiliza para leer datos del usuario
        String frase;
        // Muestra un mensaje por pantalla
        System.out.println("Ingresa una frase");
        // Leemos la variable ingresada en la variable frase
        frase = leer.next();
        //mostramos por consola la variable frase en mayuscula
        System.out.println("La frase es:  " + toUpperCase(frase));
        //mostramos por consola la variable frase en miniscula
        System.out.println("La frase es:  " + toLowerCase(frase));
    }
    
}
