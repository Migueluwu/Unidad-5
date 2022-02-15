/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosunidad5;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author miguel
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[] array = new int[10];
        teclado(array);
        System.out.println("positivos: " + positivo(array));
        System.out.println("negativos: " + negativo(array));
        System.out.println("ceros: " + cero(array));
        imprimir(array);
    }

    public static void teclado(int[] array) {
        Scanner sc = new Scanner(System.in);
        boolean repetir = false;
        for (int i = 0; i < array.length; i++) {
            do {
                repetir = false;
                try {
                    System.out.println("Introduce el numero de la posicion " + (i + 1));
                    array[i] = sc.nextInt();
                } catch (InputMismatchException ime) {
                    System.out.println("Valor no valido");
                    repetir = true;
                    sc.nextLine();
                }
            } while (repetir);
        }
       
    }

    public static int positivo(int[] array) {
        int positivos = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                positivos++;
            }
        }
        return positivos;
    }

    public static int negativo(int[] array) {
        int negativos = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                negativos++;
            }
        }
        return negativos;
    }

    public static int cero(int[] array) {
        int ceros = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                ceros++;
            }
        }
        return ceros;
    }

    public static void imprimir(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("la posicion " + i + " del array contiene el valor" + array[i]);
        }
    }
}
