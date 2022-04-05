/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package traductor;

import java.util.ArrayList;
import java.util.Objects;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 *
 * @author miguel
 */
public class Traductor {

    private SortedMap<String, String> traductor;

    public Traductor() {
        traductor = new TreeMap<>();
    }

    public void anadirPalabra(String word, String palabra) {
        traductor.put(word, palabra);
    }
    public void eliminarPalabra(String ingles){
        traductor.remove(ingles);
    }
    public String traducirAlEspañol(String ingles){
        return traductor.get(ingles);
    }

    public ArrayList<String> palabrasIngles() {
        ArrayList<String> palabrasIngles = new ArrayList<>(traductor.keySet());
        return palabrasIngles;
    }
    public ArrayList<String> palabrasEspanol() {
        ArrayList<String> palabrasEspanol = new ArrayList<>(traductor.values());
        return palabrasEspanol;
    }
    public void imprimir(){
        for(String key:traductor.keySet()){
            System.out.println(key+"--->"+traductor.get(key));
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.traductor);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Traductor other = (Traductor) obj;
        return Objects.equals(this.traductor, other.traductor);
    }
}
