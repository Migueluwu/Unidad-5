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
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numPersonas=0;
        Scanner sc=new Scanner(System.in);
        do{
        System.out.println("introduce el numero de personas que se van a medir: ");
        numPersonas= sc.nextInt();
        }while (numPersonas<=0);
       
        int []persona=new int[numPersonas];
        
        int alturaTotal=0;
        for(int i=0;i<numPersonas;i++){
            
            System.out.println("introduce la altura en cms de la persona numero "+(i+1)+": ");
            
            persona[i]=Math.abs(sc.nextInt());
            
            alturaTotal+=persona[i];
        }
        int media=alturaTotal/numPersonas;
        System.out.println("La media es "+media+" cms");
        int superior=0;
        int inferior=0;
        for(int i=0;i<numPersonas;i++){
            if(persona[i]>=media){
                superior++;
            }else{
                inferior++;
            }
        }
        System.out.println("Hay "+superior+" personas que miden mas que la media,\n"
                + " y "+inferior+ " que miden menos que la media");
    
    }
    
}
