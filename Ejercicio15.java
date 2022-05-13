/*
 * Realizar un programa que pida dos números enteros positivos por teclado y
 * muestre por pantalla el siguiente menú:
 *
 * MENU
 * 1. SUMAR
 * 2. RESTAR
 * 3. MULTIPLICAR
 * 4. DIVIDIR
 * 5. SALIR
 * ELIJA OPCION:
 */



package ejercicios;

import java.util.Scanner;

/**
 *
 * @author LEANDRO
 */
public class ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero 1:");
        int num1 = leer.nextInt();
        System.out.println("Ingrese en numero 2:");
        int num2 = leer.nextInt();
        int opc;
        String dato =" ";
        
        do {
            System.out.println("MENU");
            System.out.println("1. SUMAR");
            System.out.println("2. RESTAR");
            System.out.println("3. MULTIPLICAR");
            System.out.println("4. DIVIDIR");
            System.out.println("5. SALIR");
            System.out.println("ELIJA OPCION");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("La suma de: " + num1 + " + " + num2 + " es: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("La resta de: " + num1 + " - " + num2 + " es: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("La multiplicacion de: " + num1 + " * " + num2 + " es: " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("La division de: " + num1 + " / " + num2 + " es: " + (num1 / num2));
                    break;
                case 5:
                    System.out.println("Esta seguro que desea salir del programa (S/N?");
                    dato = leer.next();
                    if(dato.equals("S"))
                    {
                        opc=7;
                    }
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    }
        }while(opc < 6);       
        
    }
    
}

