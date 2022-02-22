
package tarea5d_miguel_martin;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author miguel
 */
public class EjercitoOrdenado {
    Set<Soldado> ejercito;

    public EjercitoOrdenado() {
        ejercito = new TreeSet();
    }

    public int numeroSoldados() {
        return ejercito.size();
    }
    
    public void alistarSoldado(String nif, String nombre, String ape1, String ape2,int edad){
        ejercito.add(new Soldado(nif,nombre,ape1,ape2,edad));
    }
    public void alistarSoldado(String nif){
        ejercito.add(new Soldado(nif));
    }
    public void alistarSoldado(Soldado soldado){
        ejercito.add(soldado);
    }
    public boolean ejercitoVacio() {
        return ejercito.isEmpty();
    }
    public boolean estaDentro(Soldado soldado){
        return ejercito.contains(soldado);
    }
    public ArrayList<Soldado> imprimir(){
        ArrayList<Soldado> ejerciolista=new ArrayList<>();
        
            ejerciolista.addAll(ejercito);
        
        return ejerciolista;
    }
    public void eliminarSoldado(Soldado soldado){
        ejercito.remove(soldado);
    }
    

}
