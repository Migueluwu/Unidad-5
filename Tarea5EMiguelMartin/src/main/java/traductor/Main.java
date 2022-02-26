/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traductor;

/**
 *
 * @author 34616
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Traductor traductor=new Traductor();
        ////Introducimos palabras
        traductor.guardarPalabra("cat", "gato");
        traductor.guardarPalabra("dog", "perro");
        traductor.guardarPalabra("red", "rojo");
        traductor.guardarPalabra("blue", "azul");
        traductor.guardarPalabra("good", "bien");
        traductor.guardarPalabra("bad", "mal");
        traductor.guardarPalabra("car", "coche");
        traductor.guardarPalabra("pen", "boli");
        traductor.guardarPalabra("say", "decir");
        traductor.guardarPalabra("have", "tener");
        
        //Borramos
       traductor.borrarPalabra("say");
       //Reemplazamos
        traductor.reemplazarPalabra("bad", "malo");
        
       //Imprimimos en ingles
       traductor.imprimirIngles();
       //Imprimimos en español
       traductor.imprimirEspanol();
       //Imprimimos todo
       traductor.imprimirTodo();
    }
    
}
