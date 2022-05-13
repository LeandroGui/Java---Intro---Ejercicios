/*
 * Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le
 * pida al usuario un numero a buscar en el vector. El programa mostrará donde se
 * encuentra el numero y si se encuentra repetido.
 */


package ejercicios;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author LEANDRO
 */
public class ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Ingrese el tamaño del vector:");
        int tamaño = leer.nextInt();
        System.out.println("Ingrese el numero a buscar");
        int buscar = leer.nextInt();
        int[] vector = new int[tamaño];
        for (int i = 0; i < tamaño; i++) {
            vector[i] = random.nextInt((10 - 0) + 0) ; //random.nextInt((max-min) + min);
        }
        System.out.println("Vector Generado");
        String aux ="";
        for (int elemento : vector) {
            aux = aux +"["+elemento+"]";
        }
        System.out.println(aux);
        int contador = 0;
            for (int i= 0; i<tamaño; i++) {
                if (buscar == vector[i]) {
                    System.out.println("El " +buscar+ " se encuentra en v["+i+"]");
                    contador = contador + 1;
                }
            }
            System.out.println("El numero "+buscar+" se repite "+contador+" vez/es");
    }
    
}
