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
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca un string");
        String palabra= sc.nextLine();
        palabra=palabra.toLowerCase();
//        char []letras=new char [palabra.length()];
//        for(int i=0;i<palabra.length();i++){
//            letras[i]=palabra.charAt(i);
//        }
        char []letras=palabra.toCharArray();
        Arrays.sort(letras);
        System.out.println(Arrays.toString(letras));
    }
    
}
