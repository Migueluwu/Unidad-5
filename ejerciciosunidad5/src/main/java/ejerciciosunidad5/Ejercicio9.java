/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosunidad5;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author miguel
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int[] array = {9,8,7,6,5,4,3,2,1,0};
        ordenarBubble(array);
        System.out.println(Arrays.toString(array));
        System.out.println("Introduzca el numero que quieres buscar");
        int num = sc.nextInt();
        System.out.println("Busqueda secuencial-> La posicion esta en la posicion: "
                + busquedaSecuencial(array, num));
        System.out.println("Busqueda binaria-> La posicion esta en la posicion: "
                + Arrays.binarySearch(array, num));
        
    }

    private static int busquedaSecuencial(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                return num;
            }
        }
        return -1;
    }
    private static void ordenarBubble(int[] array){
        int tmp;
        for(int i=0;i<array.length-1;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]>array[j]){
                    tmp=array[i];
                    array[i]=array[j];
                    array[j]=tmp;
                }
            }
        }
                
                
      
    }
}
