/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pila;

/**
 *
 * @author miguel
 */
public class Ejercicio25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pila pila= new Pila(20);
        System.out.println("la pila esta vacia? "+ pila.estaVacia());
        pila.rellenar(new char[]{'a','b','c','d','e','f','g','h','i','j','k','l'});
        pila.imprimir();
        System.out.println("la pila esta llena? "+ pila.estaLlena());
        pila.pop();
        pila.pop();
        pila.pop();
        pila.pop();
        pila.push('z');
        pila.imprimir();
        System.out.println("numero elementos: "+pila.elementos());
        char[] array=pila.sacarElementos();
        System.out.println("imprimiendo array");
        System.out.println(array);
    }
    
}
