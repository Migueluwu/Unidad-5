/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercito;

import java.util.SortedMap;
import java.util.TreeMap;

/**
 *
 * @author 34616
 */
public class MapEjercitos {
    private SortedMap<String, Ejercito> listaEjercitos;
    public MapEjercitos(){
        listaEjercitos=new TreeMap<>();
    }
    public Ejercito[] ejercitosToArray(){
        return listaEjercitos.values().toArray(new Ejercito[listaEjercitos.size()]);
    }
    public Ejercito consultarEjercito(String nombre){
        return listaEjercitos.get(nombre);
    }
    public void guardarEjercito(String nombre, Ejercito ejercito){
        listaEjercitos.put(nombre, ejercito);
    }
}
