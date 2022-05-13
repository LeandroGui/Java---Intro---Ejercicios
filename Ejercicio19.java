/*
 * Dibujar un cuadrado de N elementos por lado utilizando el car�cter �*�. Por ejemplo,
 * si el cuadrado tiene 4 elementos por lado se deber� dibujar lo siguiente:
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
        System.out.println("Ingrese el tama�o del cuadrado:");
        int tama�o = leer.nextInt();
        int i,j;
        for (i=0; i < tama�o; i++){
            for (j=0; j < tama�o; j++) {
                if ((i == 0 || i == tama�o-1) || j == 0 || j == tama�o-1){
                    System.out.print("*");
                } if (i != 0 && i!= tama�o-1 & j>0 && j<tama�o-1){
                    System.out.print(" ");
                }
            } System.out.println("");
        }
    }
    
}
