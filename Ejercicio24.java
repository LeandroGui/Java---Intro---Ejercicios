/*
 * Recorrer un vector de N enteros contabilizando cu�ntos n�meros son de 1 d�gito,
 * cu�ntos de 2 d�gitos, etc�tera (hasta 5 d�gitos).
 */


package ejercicios;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author LEANDRO
 */
public class ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Ingrese el tama�o del vector");
        int tama�o = leer.nextInt();
        
        int[] vector = new int[tama�o];
        for (int i = 0; i < tama�o; i++) {
            vector[i] = random.nextInt((100000 - 0)+ 0); //random.nextInt((max-min)+ min);
        }
        System.out.println("Vector Generado");
        String aux = "";
        for (int elemento : vector) {
            aux = aux +"["+elemento+"]";
        }
        System.out.println(aux);
        int c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0;
        for (int i = 0; i < tama�o; i++) {
            if(vector[i]<10) {
                c1=c1+1;
            }
            if(vector[i]<100) {
                c2=c2+1;
            }
            if(vector[i]<1000) {
                c3=c3+1;
            } 
            if(vector[i]<10000) {
                c4=c4+1;
            }
            if(vector[i]<100000){
                c5=c5+1;
            }
            
        }
        System.out.println("Numeros de 1 digito: " +c1);
        System.out.println("Numeros de 2 digitos: "+c2);
        System.out.println("Numeros de 3 digitos: "+c3);
        System.out.println("Numeros de 4 digitos: "+c4);
        System.out.println("Numeros de 5 digitos: "+c5);
    }   
    
}
