/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosunidad5;

import java.util.Scanner;

/**
 *
 * @author miguel
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Intoduce el tamaño del array");
        int tam=sc.nextInt();
        int []array=new int [tam];
        for(int i=0; i< array.length;i++){
            System.out.println("Introduce el valor de la posicion "+i);
            array[i]=sc.nextInt();
        }
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i];j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}
