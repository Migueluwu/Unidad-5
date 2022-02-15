/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosunidad5;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author miguel
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[] array1=new double[20];
        Arrays.fill(array1, 7.5);
        double []array2=Arrays.copyOf(array1, array1.length);
        System.out.println("array1: "+Arrays.toString(array1));
        System.out.println("array2: "+Arrays.toString(array2));
        System.out.println(Arrays.equals(array1, array2)?"Iguales" :"No iguales");
        Random num=new Random();
        array1[num.nextInt(array1.length)]=6.3;
        System.out.println("array1: "+Arrays.toString(array1));
        System.out.println("array2: "+Arrays.toString(array2)); 
        System.out.println(Arrays.equals(array1, array2)?"Iguales" :"No iguales");
        
    }
    
}
