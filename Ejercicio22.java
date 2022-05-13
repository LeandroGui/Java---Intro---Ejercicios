/*
 * Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y
 * los muestre por pantalla en orden descendente.
 */


package ejercicios;

import java.util.Scanner;



/**
 *
 * @author LEANDRO
 */
public class ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int[] vector = new int[100];
        int i,j = 0;
        for (i=(vector.length)-1; i>=0; i--) {
            vector[j]=i;
            j++;
        } 
        String aux ="";
        for (int elemento : vector) {
            aux = aux + "["+elemento+"]"; 
        } System.out.println(aux);
            
        
    }
    
}
