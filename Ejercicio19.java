/*
 * Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo,
 * si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
 *
 *
 *  * * * *
 *  *     *
 *  *     *
 *  * * * *
 */


package ejercicios;

import java.util.Scanner;

/**
 *
 * @author LEANDRO
 */
public class ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del cuadrado:");
        int tamaño = leer.nextInt();
        int i,j;
        for (i=0; i < tamaño; i++){
            for (j=0; j < tamaño; j++) {
                if ((i == 0 || i == tamaño-1) || j == 0 || j == tamaño-1){
                    System.out.print("*");
                } if (i != 0 && i!= tamaño-1 & j>0 && j<tamaño-1){
                    System.out.print(" ");
                }
            } System.out.println("");
        }
    }
    
}
