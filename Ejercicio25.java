/*
 * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y
 * muestre traspuesta. ¿Que es una matriz traspuesta?
 */


package ejercicios;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author LEANDRO
 */
public class ejercicio25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        Random random = new Random();
        int[][] matriz = new int [4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = random.nextInt((10 - 0)+ 0);//random.nextInt((max-min)+ min);
            }
        }
        System.out.println("Matriz Generada");
        
        for (int [] fila: matriz) {
            String aux = "";
            for (int elemento : fila) {
                aux = aux +" "+elemento;
            }
            System.out.println(aux);
        }
        System.out.println("Matriz Transpuesta");
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++){
                System.out.print(matriz[j][i]+" ");
            }
            System.out.println("");
        }
    }
    
}
