/*
 * Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
 * solicite números al usuario hasta que la suma de los números introducidos supere
 * el límite inicial.
 */


package ejercicios;

import java.util.Scanner;

/**
 *
 * @author LEANDRO
 */
public class ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        //double limite = 0;
        //double num = 0;
        System.out.println("Ingrese el valor limite positivo");
        int limite = scan.nextInt();
        int valor, suma = 0, i = 1;

        do {
            System.out.println("Ingrese valor n " + i);
            valor = scan.nextInt();
            suma = suma + valor;
            if (suma > limite)
            {break;}
            i = i + 1;
            
            } while(suma < limite); 
                    System.out.println("Se supero el límite ingresado");
                    System.out.println("La suma es: " + suma );
            }
}

