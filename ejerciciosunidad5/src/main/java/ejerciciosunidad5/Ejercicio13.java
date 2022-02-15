/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosunidad5;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author miguel
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero=-1;
        Scanner sc=new Scanner(System.in);
        int[] array=new int[20];
        do{
            try{
            System.out.println("Introduce un valor entre 1 y 20, 0 para terminar");
            numero=sc.nextInt();
            }catch(InputMismatchException ime){
                System.out.println("introduce solo numeros");
            }
            try{
            array[numero-1]=array[numero-1]+1;
            }catch(ArrayIndexOutOfBoundsException aioobe){
                System.out.println("El numero debe estar entre 1 y 20");
            }
        }while(numero!=0);
        for(int i=0;i<array.length;i++){
            System.out.print(i+":");
            for(int j=0;j<array[i];j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        
    }
    
}
