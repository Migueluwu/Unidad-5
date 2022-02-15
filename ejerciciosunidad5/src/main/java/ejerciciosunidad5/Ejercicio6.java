/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosunidad5;

import java.util.Arrays;

/**
 *
 * @author miguel
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[]array1={1,2,3};
        int[]array2={1,2,3,4};
        int[]array3={1,2,2};
        System.out.println("pruba 1 metodo de clase");
        if(Arrays.equals(array1, array1)){
            System.out.println("son iguales");
        }else{
            System.out.println("son distintos");
        }
        System.out.println("prueba 1 metodo comparar");
        if(compararar(array1, array1)){
            System.out.println("son iguales");
        }else{
            System.out.println("son distintos");
        }
        
        
        System.out.println("pruba 2 metodo de clase");
        if(Arrays.equals(array1, array2)){
            System.out.println("son iguales");
        }else{
            System.out.println("son distintos");
        }
        System.out.println("prueba 2 metodo comparar");
        if(compararar(array1, array2)){
            System.out.println("son iguales");
        }else{
            System.out.println("son distintos");
        }
        
        
         System.out.println("pruba 3 metodo de clase");
        if(Arrays.equals(array1, array3)){
            System.out.println("son iguales");
        }else{
            System.out.println("son distintos");
        }
        System.out.println("prueba 3 metodo comparar");
        if(compararar(array1, array3)){
            System.out.println("son iguales");
        }else{
            System.out.println("son distintos");
        }
        
    }
    private static boolean compararar(int []array1,int []array2){
        if(array1.length!=array2.length){
            return false;
        }
        for(int i=0;i<array1.length;i++){
            if(array1[i]!=array2[i]){
                return false;
            }
        }
        return true;
    }
}
