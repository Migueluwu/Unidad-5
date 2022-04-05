/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author miguel
 */
public class Teatro {

    private char[][] teatro;

    public Teatro(int N, int M) {
        teatro = new char[N][M];
        for (int i = 0; i < teatro.length; i++) {
            for (int j = 0; j < teatro[i].length; j++) {
                if ((i + 1) % 2 == 0 || (j + 1) % 2 == 0) {
                    teatro[i][j] = 'X';
                } else {
                    teatro[i][j] = 'L';
                }
            }
        }
    }

    public void reservar(int fila, int columna) {
        fila = fila - 1;
        columna = columna - 1;
        if (fila >= 0 && fila < teatro.length && columna >= 0 && columna < teatro[1].length) {
            if (teatro[fila][columna] == 'L') {
                teatro[fila][columna] = 'V';
            }
        }
    }

    public void cancelar(int fila, int columna) {
        fila = fila - 1;
        columna = columna - 1;
        if (fila >= 0 && fila < teatro.length && columna >= 0 && columna < teatro[1].length) {
            if (teatro[fila][columna] == 'V') {
                teatro[fila][columna] = 'L';
            }
        }
    }
    
    public void imprimir(){
        for(int i=0;i<teatro.length;i++){
            for(int j=0;j<teatro[i].length;j++){
                System.out.print(teatro[i][j]);
            }
            System.out.println("");
        }
    }
}
