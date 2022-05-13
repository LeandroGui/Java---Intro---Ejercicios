/*
 * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9
 * donde la suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un
 * programa que permita introducir un cuadrado por teclado y determine si este
 * cuadrado es mágico o no. El programa deberá comprobar que los números
 * introducidos son correctos, es decir, están entre el 1 y el 9.
 */


package ejercicios;

import java.util.Scanner;

/**
 *
 * @author LEANDRO
 */
public class ejercicio27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Matriz Magica");
        int tamaño = 3;
        //do {
            //System.out.println("Ingrese el tamaño de la Matriz(Orden minimo 2):");
            //tamaño = leer.nextInt();
        //}
        //while (tamaño < 2);
        
        int [][] matriz = new int [tamaño][tamaño];
        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < tamaño; i++) {
            for ( int j = 0; j < tamaño; j++) {
                do {
                    System.out.print("M["+i+"]["+j+"]:");
                    matriz[i][j] = leer.nextInt();
                }
                while (matriz[i][j] < 1 || matriz[i][j] > 9);
            }
        }
        System.out.println("Matriz cargada");
        for (int[] fila : matriz) {
            String aux = "";
            for (int elemento : fila) {
                aux = aux +" "+ elemento;
            }
            System.out.println(aux);
        }
        System.out.println("Suma Filas");
        int[] vectorfila = new int[tamaño];
        int a = 0;
        for (int [] fila : matriz) {
            int sumafila = 0;
            for (int elemento : fila) {
                sumafila += +elemento; //sumafila = sumafila + elemento
            }
            System.out.println("["+sumafila+"]");
            vectorfila[a] = sumafila;
            a = a + 1;
        }
        int c1 = 0, c2 = 0, sumacolumna =0;
        int [] vectorcolumna = new int[tamaño];
        System.out.println("Suma Columnas");
        do {
            for (int[] fila : matriz) {
                for (int elemento : fila) {
                    if (c1 == c2) {
                        sumacolumna = sumacolumna + elemento;
                    }
                    c1 = c1 + 1;
                }
                c1 = 0;
            }
            System.out.println("["+sumacolumna+"]");
            vectorcolumna[c2] = sumacolumna;
            sumacolumna = 0;
            c2 = c2 + 1;
        }
        while (c2 < tamaño);
        System.out.println("");
        System.out.println("Diagonal Principal");
        int diagonal = 0;
        for (int i = 0; i < tamaño; i++) {
            diagonal = diagonal + matriz[i][i];
        }
        System.out.println("["+diagonal+"]");
        //compara los valores calculados
        int contador = 0;
        for (int i = 0; i < tamaño; i++) {
            if (diagonal == vectorfila[i] && diagonal == vectorcolumna[i]) {
                contador = contador + 1;
            }
        }
        if (contador == 3) {
            System.out.println("Es una Matriz Magica");
        }
        else {
            System.out.println("No es una Matriz Magica");
        }
    }
    
}
