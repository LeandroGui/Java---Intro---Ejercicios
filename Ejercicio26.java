/*
 * Realice un programa que compruebe si una matriz dada es anti sim�trica. Se dice
 * que una matriz A es anti sim�trica cuando �sta es igual a su propia traspuesta, pero
 * cambiada de signo. Es decir, A es anti sim�trica si A = -AT. La matriz traspuesta de
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
 * En este caso la matriz es anti sim�trica.
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
        System.out.println("Ingrese el tama�o de la matriz:");
        int tama�o = leer.nextInt();
        System.out.println("Ingrese los elementos de la Matriz");
        int[][] matriz = new int[tama�o][tama�o];
        int[][] traspuesta = new int[tama�o][tama�o];
        for (int i = 0; i < tama�o; i++) {
            for (int j = 0; j < tama�o; j++) {
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
        for (int i = 0; i < tama�o; i++) {
            for (int j = 0; j < tama�o; j++) {
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
            for (int i = 0; i < tama�o; i++) {
                for (int j = 0; j < tama�o; j++) {
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
 