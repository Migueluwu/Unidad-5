/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosunidad5;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author miguel
 */
public class ListaInteger {

    /**
     * @param args the command line arguments
     */
    private ArrayList<Integer> lista;

    public ListaInteger() {
        lista = new ArrayList<>();
    }

    public ListaInteger(int tam) {
        Random r=new Random();
        lista = new ArrayList<>();
        for(int i=0;i<tam;i++){
            lista.add(r.nextInt(91)+10);
    }

}

    public ArrayList<Integer> getLista() {
        return lista;
    }

}
