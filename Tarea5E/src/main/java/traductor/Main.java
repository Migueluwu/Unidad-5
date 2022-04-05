/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package traductor;

import java.util.ArrayList;

/**
 *
 * @author miguel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Traductor trad =new Traductor();
        trad.anadirPalabra("cat", "gato");
        trad.anadirPalabra("dog", "perro");
        trad.anadirPalabra("car", "coche");
        trad.anadirPalabra("pen", "boli");
        trad.anadirPalabra("mouse", "raton");
        trad.anadirPalabra("red", "rojo");
        trad.anadirPalabra("blue", "azul");
        trad.anadirPalabra("green", "verde");
        trad.anadirPalabra("one", "uno");
        trad.anadirPalabra("two", "dos");
        trad.eliminarPalabra("blue");
        ArrayList<String>palabrasIngles=new ArrayList<>(trad.palabrasIngles());
        ArrayList<String>palabrasEspanol=new ArrayList<>(trad.palabrasEspanol());
        palabrasIngles.forEach(System.out::println);
        palabrasEspanol.forEach(System.out::println);
        System.out.println("tracuciendo palabra cat : "+trad.traducirAlEspañol("cat"));
        trad.imprimir();
    }
    
}
