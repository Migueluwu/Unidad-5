/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author 34616
 */
public class SopaDeLetras {
    private char sopa[][];
    public SopaDeLetras(int TAM){
        sopa=new char[TAM][TAM];
        for(int i=0;i<sopa.length;i++){
            for(int j=0;j<sopa[i].length;j++){
                sopa[i][j]='*';
            }
        }
    }

    @Override
    public String toString() {
        String matriz="";
        for(int i=0;i<sopa.length;i++){
            for(int j=0;j<sopa[i].length;j++){
                matriz=matriz+sopa[i][j];
            }
            matriz=matriz+'\n';
        }
        return matriz;
    }
    public boolean colocarPalabraHorizontal(int fila, int columna,String palabra){
        if(fila>=0&&fila<sopa.length && columna>=0&& columna+palabra.length()-1<sopa[fila].length){
            for(int i=0;i<palabra.length();i++){
                if(sopa[fila][columna+i]!='*'){
                    return false;
                }
            }
            for(int i=0;i<palabra.length();i++){
                sopa[fila][columna+i]=palabra.charAt(i);
            }
        }
        return false;
    }
    public boolean colocarPalabraVertical(int fila, int columna,String palabra){
        if(fila>=0&&fila+palabra.length()-1<sopa.length  && columna>=0&& columna<sopa[fila].length){
            for(int i=0;i<palabra.length();i++){
                if(sopa[fila+i][columna]!='*'){
                    return false;
                }
            }
            for(int i=0;i<palabra.length();i++){
                sopa[fila+i][columna]=palabra.charAt(i);
            }
        }
        return false;
    }
    
}
