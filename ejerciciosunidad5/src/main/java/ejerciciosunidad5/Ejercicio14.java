/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosunidad5;

import java.util.Random;

/**
 *
 * @author miguel
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int FILA = 3;
        final int COLUMNA = 3;
        Random ale = new Random();
        int matriz[][] = new int[FILA][COLUMNA];
        ///Imprimir//////////////
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("");
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = ale.nextInt(100) + 1;

                System.out.print(matriz[i][j]+" ");
            }
            
        }
        System.out.println("");
        ///////////Media/////////////////////
        int suma=0;
        for (int i = 0; i < matriz.length; i++) {
            
            for (int j = 0; j < matriz[i].length; j++) {
                suma=suma+matriz[i][j];
            }
        }
        int media=suma/(FILA*COLUMNA);
        System.out.println("La media es: "+media);
        /////////////////valor minimo y valor maximo
        int minimo=matriz[0][0];
        int maximo=matriz[0][0];
         for (int i = 0; i < matriz.length; i++) {
            
            for (int j = 0; j < matriz[i].length; j++) {
                if(minimo>matriz[i][j]){
                    minimo=matriz[i][j];
                }
                if(maximo<matriz[i][j]){
                    maximo=matriz[i][j];
                }
            }
        }
        System.out.println("El valor minimo es "+minimo);
        System.out.println("El valor maximo es "+maximo);
    }
}
