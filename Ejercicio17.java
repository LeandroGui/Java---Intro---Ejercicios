/*
 * Realizar un programa que simule el funcionamiento de un dispositivo RS232, este
 * tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar
 * con un formato fijo: tienen que ser de un m�ximo de 5 caracteres de largo, el primer
 * car�cter tiene que ser X y el �ltimo tiene que ser una O.
 * Las secuencias le�das que respeten el formato se consideran correctas, la
 * secuencia especial �&&&&&� marca el final de los env�os (llam�mosla FDE), y toda
 * secuencia distinta de FDE, que no respete el formato se considera incorrecta.
 * Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas
 * correctas e incorrectas recibidas. Para resolver el ejercicio deber� investigar c�mo
 * se utilizan las siguientes funciones de Java Substring(), Length(), equals().
 */


package ejercicios;

import java.util.Scanner;

/**
 *
 * @author LEANDRO
 */
public class ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String palabra, X, O;
        int i = 0, c = 0, longitud, band=0, g=0;
        do {
            g=g+1;
            System.out.println("Ingrese palabra " +(g)+":" );
            palabra =leer.next();
            longitud = palabra.length();
            if (longitud == 5) {
                if(palabra.equals("&&&&&")) {
                    band=1;
                    break;
                } else {
                    if (palabra.substring(0,1).equals("X") && palabra.substring(4,5).equals("O")) {
                        c=c+1;
                    } else {
                        i=i+1;
                } 
                        
                        
            }
        } else {
                i=i+1;
            }
        } while (band!=1);
            System.out.println("Palabras Incorrectas Ingresadas: " + i);
            System.out.println("Palabras Correctas Ingresadas: " + c);
    }
}
