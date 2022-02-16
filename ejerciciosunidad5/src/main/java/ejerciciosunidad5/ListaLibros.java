/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosunidad5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author miguel
 */
public class ListaLibros {

    private ArrayList<Libro> lista;

    //
    public ListaLibros() {
        this.lista = new ArrayList<>();
    }

    public void insentarLibro(Libro libro) {
        if (libro != null) {
            lista.add(libro);
        }
    }
    
    public void imprimirConsola(){
        
        System.out.println("imprimiendo lista de libros...");
        lista.forEach(System.out::println);
    }
    
    public int getCantidadLibros(){
        return lista.size();
    }
    
    
    //Eliminar un libro
    public boolean borrarLibro(Libro libro){
//        if(lista.contains(libro)){
//            lista.remove(libro);
//            return true;
//        }
//        return false;
        return lista.remove(libro);
    }
    public Libro buscarLibro (String isbn){
//        for(int i=0;i<lista.size();i++){
//            if(lista.get(i).getIsbn().equals(isbn)){
//                return lista.get(i);
//            }
//        }
//        return null;

        Libro aux= new Libro(isbn,"","",0,0);
        int indice=lista.indexOf(aux);
        if(indice>=0){
            return lista.get(indice);
        }
        return null;
        
    }
    
    public ArrayList<Libro> buscarPorPrecio(double precio){
        ArrayList<Libro> aux=new ArrayList<>();
        for(Libro libro: this.lista){
            if(libro.getPrecio()==precio){
                aux.add(libro);
            }
        }
        return aux;
    }
    
    public void ordenarISBN(){
        Collections.sort(this.lista);
        
    }
    public int buscarISBN (Libro l){
        return Collections.binarySearch(lista, l);
    }
    public void ordenarComparatorNombre(){
        Collections.sort(lista, (Libro l1, Libro l2)->l1.getNombre().compareTo(l2.getNombre()));
    }
    public void ordenarPorPaginas(){
    Collections.sort(lista,(l1,l2)->l1.getNumPag()-l2.getNumPag());
    
    }
    public void ordenarNombrePaginas(){
        Comparator<Libro>criterioNombre=(l1,l2)->l1.getNombre().compareTo(l2.getNombre());
        Comparator<Libro>criterioPag=(l1,l2)->l1.getNumPag()-l2.getNumPag();
        Comparator<Libro>criterioNombrePag=criterioNombre.thenComparing(criterioPag);
        Collections.sort(lista, criterioNombrePag);
    }
    public int buscarBinarioNombre(Libro l){
        return Collections.binarySearch(lista, l,(Libro l1, Libro l2)->l1.getNombre().compareTo(l2.getNombre()));
    }

}
