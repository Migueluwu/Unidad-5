/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tecladosmiguelmartin;

/**
 *
 * @author miguel
 */
public class PruebaTeclados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListaTeclados catalogo=new ListaTeclados();
        catalogo.insertarTeclado(new Teclado("K120", "Logitech", 7, 9.75));
        catalogo.insertarTeclado(new Teclado("RK201", "Mafiti ", 4, 14.99));
        catalogo.insertarTeclado(new Teclado("MKULTRA", "Mars Gaming ", 0, 60.99));
        catalogo.insertarTeclado(new Teclado("3098", "Akko", 0, 109.99));
        
        catalogo.imprimirTeclados();
        System.out.println("Buscando por precio: "+catalogo.buscarPorPrecio(100, 10));
        
        System.out.println("Buscando por marca: "+catalogo.buscarPorMarca("Logitech"));
        System.out.println("Numero de teclados:"+ catalogo.cantidadTeclados());
        
        catalogo.borrarTeclado("3098", "Akko");
        catalogo.imprimirTeclados();
        
        
    }
    
}
