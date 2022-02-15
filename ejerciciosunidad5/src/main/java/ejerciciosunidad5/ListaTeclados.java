/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosunidad5;

import java.util.ArrayList;

/**
 *
 * @author miguel
 */
public class ListaTeclados {

    ArrayList<Teclado> catalogo;

    public ListaTeclados() {
        catalogo = new ArrayList<>();
    }

    // Añade un contacto si ese contacto no existe en la agenda
    public void insertarTeclado(Teclado teclado) {
        if (!catalogo.contains(teclado)) {
            catalogo.add(teclado);
        }
    }

    public int cantidadTeclados() {
        return catalogo.size();
    }

    public void imprimirTeclados() {
        System.out.println("Imprimiendo teclado:");
        catalogo.forEach(System.out::println);
    }

    public boolean borrarTeclado(String modelo, String marca) {
        for (int i = 0; i < catalogo.size(); i++) {
            if (catalogo.get(i).getMarca().equalsIgnoreCase(marca)
                    && catalogo.get(i).getModelo().equalsIgnoreCase(modelo)) {
                catalogo.remove(i);
                return true;
            }
        }
        return false;
    }

    public ArrayList<Teclado> buscarPorMarca(String marca) {
        ArrayList<Teclado> aux = new ArrayList<>();
        for (Teclado teclado : this.catalogo) {
            if (teclado.getMarca().equalsIgnoreCase(marca)) {
                aux.add(teclado);
            }
        }

        return aux;
    }

    public ArrayList<Teclado> buscarPorMarcaYModelo(String marca, String modelo) {
        ArrayList<Teclado> aux = new ArrayList<>();
        for (Teclado teclado : this.catalogo) {
            if (teclado.getMarca().equalsIgnoreCase(marca) && teclado.getModelo().equalsIgnoreCase(modelo)) {
                aux.add(teclado);
            }
        }
        return aux;
    }
    public ArrayList<Teclado> buscarPorPrecio(double precioMayor,double precioMenor){
        ArrayList<Teclado> aux = new ArrayList<>();
        for (Teclado teclado : this.catalogo) {
            if(teclado.getPrecio()>=precioMenor&&teclado.getPrecio()<=precioMayor){
                aux.add(teclado);
            }
        }
        return aux;
    }

    @Override
    public String toString() {
        return "ListaTeclados{" + "catalogo=" + catalogo + '}';
    }
}
