/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosunidad5;

/**
 *
 * @author miguel
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListaLibros catalogo= new ListaLibros();

        catalogo.insentarLibro(new Libro("123","La muerte a pellizcos","Planeta",10,0.9));
        catalogo.insentarLibro(new Libro("1234","La muerte a pellizcos","Planeta",10,0.9));
        catalogo.insentarLibro(new Libro("1235","La muerte a pellizcos","Planeta",10,0.9));
        catalogo.insentarLibro(new Libro("1236","La muerte a pellizcos","Planeta",10,0.9));
        catalogo.imprimirConsola();
        System.out.println("Tamaño del catalogo: "+catalogo.getCantidadLibros());
        Libro libro=catalogo.buscarLibro("1234");
        System.out.println("libro encontrado "+libro);
        catalogo.borrarLibro(new Libro("1235","","",0,0));
        catalogo.imprimirConsola();
        
        catalogo.buscarPorPrecio(0.8).forEach(System.out::println);
        catalogo.ordenarISBN();
        catalogo.imprimirConsola();
        System.out.println("el libro esta en la posicion: "
                +catalogo.buscarISBN(new Libro("1236","","",0,0)));
        
        catalogo.ordenarComparatorNombre();
        catalogo.imprimirConsola();
    }
    
}
