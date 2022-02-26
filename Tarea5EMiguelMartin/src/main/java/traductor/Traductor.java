/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traductor;

import java.util.SortedMap;
import java.util.TreeMap;

/**
 *
 * @author 34616
 */
public class Traductor {
    private SortedMap<String, String>traductor;
    public Traductor(){
        traductor= new TreeMap<>();
    }
    public void guardarPalabra(String palabraIngles,String palabraEspanol){
        traductor.put(palabraIngles, palabraEspanol);
    }
    public void borrarPalabra(String palabraIngles){
        traductor.remove(palabraIngles);
    }
    public void reemplazarPalabra(String palabraIngles,String palabraEspanol){
        traductor.replace(palabraIngles, palabraEspanol);
    }
    public String traducirPalabra(String palabraIngles){
        return traductor.get(palabraIngles);
    }
    public void imprimirIngles(){
        System.out.println(traductor.keySet());
    }
    public void imprimirEspanol(){
        System.out.println(traductor.values());
    }
    public void imprimirTodo(){
        for(String aux:traductor.keySet()){
            System.out.println(aux+"---->"+traductor.get(aux));
        }
    }
}
