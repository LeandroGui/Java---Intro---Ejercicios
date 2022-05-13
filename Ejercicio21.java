/*
 * Crea una aplicación que a través de una función nos convierta una cantidad de
 * euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o
 * libras. La función tendrá como parámetros, la cantidad de euros y la moneda a
 * converir que será una cadena, este no devolverá ningún valor y mostrará un
 * mensaje indicando el cambio (void).
 * El cambio de divisas es:
 *
 *
 *   * 0.86 libras es un 1 €
 *   * 1.28611 $ es un 1 €
 *   * 129.852 yenes es un 1 €
 */


package ejercicios;

import java.util.Scanner;

/**
 *
 * @author LEANDRO
 */
public class ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el monto(E)");
        double monto = leer.nextDouble();
        System.out.println("Convertir a Dolares,Yenes,Libra");
        String tipomoneda = leer.next();
        tipomoneda = tipomoneda.toUpperCase();
        
        
        switch (tipomoneda) { 
            case "DOLARES":
                System.out.print("" + monto + "EURO");
                monto = monto * 1.28611;
                System.out.print(" es igual a " + monto + " " + tipomoneda);
                System.out.println("");
                break;
            case "YENES":
                System.out.print("" + monto + "EURO");
                monto = monto * 129.852;
                System.out.print(" es igual a " + monto + " " + tipomoneda);
                System.out.println("");
                break;
            case "LIBRAS":
                System.out.print("" + monto + "LIBRAS");
                monto = monto * 0.86;
                System.out.print(" es igual a " + monto + " " + tipomoneda);
                System.out.println("");
                break;
            default:
                System.out.println("Tipo de moneda mal ingresado");
                break;
                } 
    }
    
}
