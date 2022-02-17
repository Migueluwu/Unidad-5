/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosunidad5;

/**
 *
 * @author miguel
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int FILA=2;
        final int COLUMNA=3;
        int matriz[][]=new int[FILA][COLUMNA];
        int aux=0;
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("");
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j]=aux;
                aux++;
                System.out.print(matriz[i][j]);
            }
            
        }
    }
    
}
