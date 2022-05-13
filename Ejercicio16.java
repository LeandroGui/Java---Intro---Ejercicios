/*
 * Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe
 * salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa
 * deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el
 * número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
 */


package ejercicios;

import java.util.Scanner;

/**
 *
 * @author LEANDRO
 */
public class ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int i, num=0,suma=0;
        for(i=1;i<21;i++)
        {
            System.out.println("Ingrese el numero " + i + ":");
            num =leer.nextInt();
            if(num == 0)
            {break;}
            else {
                if(num > 0)
                {
                    suma = suma + num;
                }
            }
        }
        if(num == 0){
            System.out.println("Se capturo el numero cero");
            System.out.println("La suma de los numeros ingresados es; " + suma);
        } else {
            System.out.println("La suma de los numeros ingresados es: " + suma);
        }
    }
    
}
