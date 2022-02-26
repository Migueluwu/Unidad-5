/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosunidad5;

/**
 *
 * @author 34616
 */
public class Ejercicio5D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        Ejercito ejercito=new Ejercito();
        System.out.println("¿Esta el ejercito vacio? "+ejercito.ejercitoVacio());
        ejercito.alistarSoldado("09079918R");
        ejercito.alistarSoldado("09078855B","Miguel", "Martin", "Fernandez", 27);
        System.out.println(ejercito.imprimir().toString());
        Soldado soldado1=new Soldado("09079918R");
        System.out.println("¿Esta dentro? "+ejercito.estaDentro(soldado1));
        System.out.println("¿Esta el ejercito vacio? "+ejercito.ejercitoVacio());
        System.out.println("Numero de soldados: "+ejercito.numeroSoldados());
        ejercito.eliminarSoldado(soldado1);
        System.out.println("Numero de soldados: "+ejercito.numeroSoldados());
    }
    
}
