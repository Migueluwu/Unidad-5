/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosunidad5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author miguel
 */
public class Joker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int TAM = 7;
        Random ale = new Random();
        Scanner sc = new Scanner(System.in);
        int[] numero = new int[TAM];
        int[] aux = new int[TAM];
        int tmp;
        for (int i = 0; i < numero.length; i++) {
            numero[i] = ale.nextInt(10);
        }

        System.out.println(Arrays.toString(numero));
        for (int i = 0; i < numero.length; i++) {
            do {
                System.out.println("introduce el numero de la posicion: " + (i + 1));
                tmp = sc.nextInt();
            } while (tmp > 9 || tmp < 0);
            aux[i] = tmp;
        }

        System.out.println("Joker bueno :" + jokerBueno(numero, aux));

        System.out.println("Joker malo: " + jokerMalo(numero, aux));

    }

    private static boolean jokerBueno(int[] array, int[] aux) {
        return Arrays.equals(array, aux);
    }

    private static boolean jokerMalo(int[] array, int[] aux) {
        Arrays.sort(array);
        Arrays.sort(aux);
        return Arrays.equals(array, aux);
    }
}
