/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosunidad5;

/**
 *
 * @author miguel
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[]num={1,2,3,4,5,6};
        int suma=0;
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
            suma+=num[i];
        }
        System.out.println("suma total: "+suma);
    }
    
}
