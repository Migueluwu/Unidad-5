/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosunidad5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author miguel
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("introduce el tamaño de los arrays");
        int tamaño=sc.nextInt();
        int []array1=new int[tamaño];
        int [] array2=new int[tamaño];
        iniciar(array1, array2);
        int [] resultado =multiplicar(array1,array2);
        imprimir(array1);
        imprimir(array2);
        imprimir(resultado);
        
    }
    private  static void iniciar(int []array1,int []array2){
        Random aleatorio=new Random();
        for(int i=0;i<array1.length;i++){
            array1[i]=aleatorio.nextInt(100)+1;
            array2[i]=aleatorio.nextInt(100)+1;
        }
    }
    private static int[] multiplicar(int []array1,int []array2){
        int [] resultado=new int[array1.length];
        for(int i=0;i<array1.length;i++){
            resultado[i]=array1[i]*array2[i];
        }
        return resultado;
    }
     public static void imprimir(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"-");
           
        }
        System.out.println("");
    }
}
