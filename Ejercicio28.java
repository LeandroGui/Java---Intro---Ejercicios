/*
 * Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz
 * P de 3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está
 * contenida dentro de la matriz M. Para ello se debe verificar si entre todas las
 * submatrices de 3x3 que se pueden formar en la matriz M, desplazándose por filas o
 * columnas, existe al menos una que coincida con la matriz P. En ese caso, el
 * programa debe indicar la fila y la columna de la matriz M en la cual empieza el
 * primer elemento de la submatriz P.
 */


package ejercicios;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author LEANDRO
 */
public class ejercicio28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Matriz M de 10x10");
        int[][] matrizM = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++){
                matrizM[i][j] = random.nextInt((101-0)+ 0); //random.nextInt((max-min)+min);
            }
        }
        System.out.println("Matriz M 10X10 Generada aleatoriamente");
        for (int[] fila : matrizM) {
            String aux = "";
            for (int elemento : fila) {
                aux = aux +" "+ elemento;
            }
            System.out.println(aux);
        }
        int suma2 = 0;
        System.out.println("Ingrese los elementos de la Matriz P de 3x3(0 a 100):");
        int[][] matrizP = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do {
                    System.out.print("M 'P'["+i+"]["+j+"]:");
                    matrizP[i][j] = leer.nextInt();
                    if (matrizP[i][j] >= 0 && matrizP[i][j] <= 100) {
                        suma2 = suma2 + matrizP[i][j];
                    }
                }
                while (matrizP[i][j] < 0 || matrizP[i][j] > 100);
            }
        }
        System.out.println("Matriz P 3x3");
        for (int[] fila : matrizP) {
            String aux = "";
            for (int elemento : fila) {
                aux = aux +" "+elemento;
            }
            System.out.println(aux);
        }
        int suma1 = 0;
        int k = 0;
        int l = 0;
        int a = 0;
        int b = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (matrizM[i][j] == matrizP[k][l]) {
                    for (k = i; k < i + 3 ; k++) {
                        for (l = j; l < j + 3 ; l++) {
                            if (matrizM[k][l] == matrizP[a][b]) {
                                suma1 = suma1 + matrizP[a][b];
                                System.out.print("["+k+"]["+l+"],");
                                //break;
                            }
                            else {
                                suma1 = 0;
                            }
                            b++;
                        }
                        System.out.println("");
                        a++;
                        b = 0;
                        //break;
                    }
                    k = 0;
                    l = 0;
                    a = 0;
                    b = 0;
                    //break;
                }//break;
            }
        }
        System.out.println("^^^Se encontraron coincidencias hasta ese valor^^^");
        if (suma2 == suma1) {
            System.out.println("La matriz P de 3x3 esta en la matriz M de 10x10");
        }
        else {
            System.out.println("La matriz P de 3x3 no se encuentra en la matriz M de 10x10");
        }
        
    }
    
}

//Corregir errores
