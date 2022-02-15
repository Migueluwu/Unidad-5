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
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        Random ale = new Random();
        System.out.println("Introduce el numero de tiradas");
        int tiradas=sc.nextInt();
        boolean[] moneda = new boolean[tiradas];
        tirarmonedas(moneda);
        int cara = cara(moneda);
        int cruz = cruz(moneda);
        System.out.println("nº caras: "+cara+"\n nº cruces: "+cruz);
        imprimirMoneda(moneda);
    }
    public static void tirarmonedas(boolean[]array){
        Random ale = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = ale.nextBoolean();
        }
    }
    public static int cara(boolean[] array) {
        int cara = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == true) {
                cara++;
            }
        }
        return cara;
    }

    public static int cruz(boolean[] array) {
        int cruz = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == false) {
                cruz++;
            }
        }
        return cruz;
    }
    public static void imprimirMoneda(boolean []array){
        for(int i=0;i<array.length;i++){
            System.out.println("tirada numero "+(i+1)+": "+((array[i]==true)?" cara":" cruz"));
            
        }
    }

}
