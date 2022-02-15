/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosunidad5;

import java.util.ArrayList;

/**
 *
 * @author miguel
 */
public class Pila {

    private ArrayList<Character> pila;
    private int TAM;

    public Pila( int tamaño) {
        pila = new ArrayList<>();
        TAM=tamaño;
    }

    public void push(Character letra) {
        if (pila.size() < TAM) {
            pila.add(letra);
        }
    }

    public void pop() {
        if (!pila.isEmpty()) {
            pila.remove(pila.size() - 1);
        }
    }

    public boolean estaVacia() {
        return pila.isEmpty();
    }

    public boolean estaLlena() {
        return (pila.size()== TAM);
    }

    public int elementos() {
        return pila.size();
        
    }

    public void imprimir() {
        for (int i = 0; i < pila.size(); i++) {
            System.out.print(pila.get(i) + " ");
        }
        System.out.println("");
    }

    public char[] sacarElementos() {
        char[] resultado = new char[pila.size()];
        for (int i = 0; i < pila.size(); i++) {
            resultado[i] = pila.get(i);
        }
        pila.clear();
        return resultado;
    }

//    public void rellenar(char[] array) {
//        for (int i =0; i <array.length && pila.size()<TAM; i++) {
//            pila.add(array[i]);
//        }
//    }
    
    
    public void rellenar(char[] array) {
        pila.clear();
        for(int i=0;i<array.length &&i<TAM;i++){
            pila.add(array[i]);
        }
    }
}
