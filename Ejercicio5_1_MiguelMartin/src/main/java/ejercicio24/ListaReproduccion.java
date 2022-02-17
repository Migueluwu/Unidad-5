package ejercicio24;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author miguel
 */
public class ListaReproduccion {

    private ArrayList<Cancion> listaReproduccion;

    public ListaReproduccion() {
        listaReproduccion = new ArrayList<>();
    }

    public int numeroCanciones() {
        return listaReproduccion.size();
    }

    public boolean estaVacia() {
        return listaReproduccion.isEmpty();
    }

    public Cancion escucharCancion(int numero) {
        if (numero >= 0 && numero < listaReproduccion.size()) {
            return listaReproduccion.get(numero);
        }
        return null;
    }

    public boolean cambiarCancion(int posicion, Cancion cancion) {
        if (posicion >= 0 && posicion < listaReproduccion.size()) {
            listaReproduccion.set(posicion, cancion);
            return true;
        }
        return false;
    }

    public void grabarCancion(Cancion cancion) {
        listaReproduccion.add(cancion);
    }

    public boolean eliminaCancion(int posicion) {
        if (posicion >= 0 && posicion < listaReproduccion.size()) {
            listaReproduccion.remove(posicion);
            return true;
        }
        return false;
    }

    public boolean eliminaCancion(Cancion cancion) {
        if (listaReproduccion.contains(cancion)) {
            listaReproduccion.remove(cancion);
            return true;
        }
        return false;
    }

    public static void imprimirLista(ListaReproduccion tmp) {
        for (int i = 0; i < tmp.numeroCanciones(); i++) {
            System.out.println(tmp.escucharCancion(i));
        }
    }

    public int buscarCancion(Cancion c) {
        if (listaReproduccion.contains(c)) {
            for (int i = 0; i < listaReproduccion.size(); i++) {
                if (listaReproduccion.get(i).equals(c)) {
                    return i;
                }
            }
        }

        return -1;
    }
    
    public void ordenarNombre(){
        Collections.sort(this.listaReproduccion);
    }
    public int buscarPorNombre(Cancion cancion){
        return Collections.binarySearch(listaReproduccion, cancion);
    }
    
    public void ordenarPorDuracion(){
       Collections.sort(listaReproduccion,
               (Cancion c1, Cancion c2)->c1.getDuracion()-c2.getDuracion());
    }
    public int buscarPorDuracion(Cancion c){
        return Collections.binarySearch(listaReproduccion, c,
                (Cancion c1, Cancion c2)->c1.getDuracion()-c2.getDuracion());
    }
}
