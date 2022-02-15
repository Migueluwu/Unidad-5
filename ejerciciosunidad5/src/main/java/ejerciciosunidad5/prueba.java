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
public class prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nose="0123456";
        int[]array=new int[7];
        for(int i=0;i<array.length;i++){
//           array[i]= Integer.parseInt(String.valueOf(nose.charAt(i)));
           array[i]=Character.getNumericValue(nose.charAt(i));
        }
        System.out.println(Arrays.toString(array));
    }
    
}
