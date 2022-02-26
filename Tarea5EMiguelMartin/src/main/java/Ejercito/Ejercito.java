/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercito;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author miguel
 */
public class Ejercito {

    private Set<Soldado> ejercito;

    public Ejercito() {
        ejercito = new HashSet();
    }

    public int numeroSoldados() {
        return ejercito.size();
    }

    public void alistarSoldado(String nif, String nombre, String ape1, String ape2, int edad) {
        ejercito.add(new Soldado(nif, nombre, ape1, ape2, edad));
    }

    public void alistarSoldado(String nif) {
        ejercito.add(new Soldado(nif));
    }

    public boolean ejercitoVacio() {
        return ejercito.isEmpty();
    }

    public boolean estaDentro(Soldado soldado) {
        return ejercito.contains(soldado);
    }

    public ArrayList<Soldado> imprimir() {
        ArrayList<Soldado> ejerciolista = new ArrayList<>();
        ejerciolista.addAll(ejercito);
        
        return ejerciolista;
    }
    public void eliminarSoldado(Soldado soldado){
        ejercito.remove(soldado);
    }
    
}
