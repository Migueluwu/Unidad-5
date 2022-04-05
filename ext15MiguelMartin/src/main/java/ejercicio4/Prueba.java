/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author miguel
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Teatro teatro=new Teatro(5, 5);
        teatro.imprimir();
        System.out.println("");
        teatro.reservar(1,1);
        teatro.reservar(1,2);
        teatro.reservar(5, 5);
        teatro.imprimir();
        System.out.println("");
        teatro.cancelar(1, 1);
        teatro.cancelar(1, 2);
        teatro.imprimir();
    }
    
}
