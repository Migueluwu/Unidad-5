/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio24;

/**
 *
 * @author miguel
 */
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListaReproduccion spotify=new ListaReproduccion();
        System.out.println((spotify.estaVacia()?"Esta vacia":"No esta vacia"));
        
        
        spotify.grabarCancion(new Cancion("Don't Change", 235, "Rock"));
        spotify.grabarCancion(new Cancion("Is This Love", 232, "Reggae"));
        spotify.grabarCancion(new Cancion("Animal", 88, "Rap"));
        System.out.println("Numero canciones: "+spotify.numeroCanciones());
        //Buscar canciones
        ListaReproduccion.imprimirLista(spotify);
        System.out.println("La cancion esta en la posicion: "+
                spotify.buscarCancion(new Cancion("Animal",0,"")));
        
        System.out.println("La cancion esta en la posicion: "+
                spotify.buscarCancion(new Cancion("no está",0,"")));
        ///////////////////////////////////////////
        
        //cambiar cancion
        spotify.cambiarCancion(2, new Cancion("Jesucristo Garcia", 391, "Rock"));
        
       /////////////////////////////
       //Numero de canciones
        System.out.println("Numero canciones: "+spotify.numeroCanciones());
        //////////////////
        //Imprimir lista
        System.out.println("//////////////////");
        ListaReproduccion.imprimirLista(spotify);
        /////
        //eliminar cancion
        spotify.eliminaCancion(1);
        spotify.eliminaCancion(new Cancion("Don't Change", 0, ""));
        System.out.println("//////////////////");
        ListaReproduccion.imprimirLista(spotify);
    }
    
}
