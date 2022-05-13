/*
 * Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice
 * que una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero
 * cambiada de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de
 * una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o
 * viceversa).
 *
 *
 * Ejemplo:
 *
 *  Matriz             Matriz Transpuesta
 *
 *  0 -2 4                  0 2 -4  
 *  2 0 2                   -2 0 -2
 * -4 -2 0                  4 2 0
 *
 *
 * En este caso la matriz es anti simétrica.
 */


package ejercicios;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author LEANDRO
 */
public class ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Ingrese el tamaño de la matriz:");
        int tamaño = leer.nextInt();
        System.out.println("Ingrese los elementos de la Matriz");
        int[][] matriz = new int[tamaño][tamaño];
        int[][] traspuesta = new int[tamaño][tamaño];
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                System.out.print("M["+i+"]["+j+"]:");
                matriz[i][j] = leer.nextInt();
            }
        }
        System.out.println("Matriz Generada");
        for (int[] fila : matriz) {
            String aux = "";
            for (int elemento : fila) {
                aux = aux + " " + elemento;
            }
            System.out.println(aux);
        }
        System.out.println("Matriz Transpuesta");
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                traspuesta[i][j] = matriz[j][i];
            }
        }
        for (int [] fila : traspuesta) {
            String aux = "";
            for (int elemento : fila) {
                aux = aux + " " + elemento;
            }
            System.out.println(aux);
                 
        }
        int b = 0;
            for (int i = 0; i < tamaño; i++) {
                for (int j = 0; j < tamaño; j++) {
                    if((-1*matriz[i][j])!=(traspuesta[i][j])) {
                        b = 1;
                        break;
                    }
                }
                
            }
            if (b == 0) {
                System.out.println("Es Antisimetrica");
            }
            else {
                System.out.println("No es Antisimetrica");
            }
    }
    
}
 