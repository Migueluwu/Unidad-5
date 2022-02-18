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
        final int FILA = 5;
        final int COLUMNA = 5;
        Random ale = new Random();
        int matriz[][] = new int[FILA][COLUMNA];
        //Introduce valores/////
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("");
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = ale.nextInt(10);
            }
            
        }
        //Imprime///////////////
        imprimirMatriz(matriz);
        ///////////Media/////////////////////
        int suma=0;
        for (int i = 0; i < matriz.length; i++) {
            
            for (int j = 0; j < matriz[i].length; j++) {
                suma=suma+matriz[i][j];
            }
        }
        int media=suma/(FILA*COLUMNA);
//        System.out.println("La media es: "+media);
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
//        System.out.println("El valor minimo es "+minimo);
//        System.out.println("El valor maximo es "+maximo);
//        recorrerFila(1, matriz);
//        recorrerColumna(1, matriz);
        System.out.println("");
        recorrerVecinas(1, 1, matriz);
    }
    
    private static void imprimirMatriz(int [][]matriz){
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
        }
        System.out.println("");
    }
    
    
    private static void recorrerFila(int numFila,int [][] matriz){
        int fila[]=new int[matriz[numFila].length];
        if(numFila>=0&&numFila<matriz[numFila].length){
            for(int i=0;i<fila.length;i++){
                System.out.print(matriz[numFila][i]+" ");
            }
            System.out.println("");
        }else{
            System.out.println("Numero de fila no valido");
        }
        
    }
    
    private static void recorrerColumna(int numColumna,int [][] matriz){
        if(numColumna>=0&&numColumna<matriz.length){
            for(int i=0;i<matriz.length;i++){
                System.out.print(matriz[i][numColumna]+" ");
            }
            System.out.println("");
        }else{
            System.out.println("numero de columna no valido");
        }
        
    }
    private static void recorrerVecinas(int numFila, int numColumna, int [][]matriz){
        if(numFila>0&& numFila+1<matriz.length && numColumna>0 && numColumna+1<matriz[numFila].length){
            for(int i=numFila-1;i<=numFila+1;i++){
                for(int j=numColumna-1;j<=numColumna+1;j++){
                    System.out.print(matriz[i][j]+" ");
                }
                System.out.println("");
            }
        }else{
            System.out.println("Numero de filas o columnas no valido");
        }
        
    }
    
    
}
