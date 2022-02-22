/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea5d_miguel_martin;

/**
 *
 * @author miguel
 */
public class Tarea5D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
///////EJERCITO CON HASSET////////////////////////////////
        Ejercito ejercito = new Ejercito();

        System.out.println("¿Esta el ejercito vacio? " + ejercito.ejercitoVacio());

        ejercito.alistarSoldado("09079918R");

        ejercito.alistarSoldado("09078855B", "Miguel", "Martin", "Fernandez", 27);
        Soldado soldado1 = new Soldado("1231456682");
        ejercito.alistarSoldado(soldado1);
        System.out.println(ejercito.imprimir().toString());
        ejercito.alistarSoldado("111111111");
        ejercito.alistarSoldado("999999999");
        ejercito.alistarSoldado("000000000");
        ejercito.alistarSoldado("000000000");
        ejercito.alistarSoldado("000000000");
        ejercito.alistarSoldado("000000000");
        ejercito.alistarSoldado("000000000");

        System.out.println("¿Esta dentro? " + ejercito.estaDentro(soldado1));

        System.out.println("¿Esta el ejercito vacio? " + ejercito.ejercitoVacio());

        System.out.println("Numero de soldados: " + ejercito.numeroSoldados());

        ejercito.eliminarSoldado(soldado1);

        System.out.println("Numero de soldados: " + ejercito.numeroSoldados());
        for (int i = 0; i < ejercito.imprimir().size(); i++) {
            System.out.println(ejercito.imprimir().get(i));
        }
///////////////////////////////////////////

        EjercitoOrdenado ejercitoOrdenado = new EjercitoOrdenado();

        System.out.println("¿Esta el ejercito vacio? " + ejercito.ejercitoVacio());

        ejercitoOrdenado.alistarSoldado("09079918R");

        ejercitoOrdenado.alistarSoldado("09078855B", "Miguel", "Martin", "Fernandez", 27);

        ejercitoOrdenado.alistarSoldado(soldado1);
        System.out.println(ejercitoOrdenado.imprimir().toString());
        ejercitoOrdenado.alistarSoldado("111111111");
        ejercitoOrdenado.alistarSoldado("999999999");
        ejercitoOrdenado.alistarSoldado("000000000");
        ejercitoOrdenado.alistarSoldado("000000000");
        ejercitoOrdenado.alistarSoldado("000000000");
        ejercitoOrdenado.alistarSoldado("000000000");
        ejercitoOrdenado.alistarSoldado("000000000");

        System.out.println("¿Esta dentro? " + ejercitoOrdenado.estaDentro(soldado1));

        System.out.println("¿Esta el ejercito vacio? " + ejercitoOrdenado.ejercitoVacio());

        System.out.println("Numero de soldados: " + ejercitoOrdenado.numeroSoldados());

        ejercitoOrdenado.eliminarSoldado(soldado1);

        System.out.println("Numero de soldados: " + ejercitoOrdenado.numeroSoldados());
        for (int i = 0; i < ejercitoOrdenado.imprimir().size(); i++) {
            System.out.println(ejercitoOrdenado.imprimir().get(i));

        }

    }
}
