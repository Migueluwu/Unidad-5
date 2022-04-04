/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vuelos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author 34616
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Vuelos> listaVuelos = new ArrayList<>();
        listaVuelos.add(new Vuelos("123", "Malaga", "Madrid", 90));
        listaVuelos.get(0).listaPasajeros.add(new Pasajeros("456", "Miguel", "Martin", "6653256889"));
        listaVuelos.get(0).listaPasajeros.add(new Pasajeros());
        listaVuelos.get(0).listaPasajeros.add(new Pasajeros());
        listaVuelos.get(0).listaPasajeros.add(new Pasajeros());
        listaVuelos.get(0).listaPasajeros.add(new Pasajeros());
        listaVuelos.get(0).listaPasajeros.add(new Pasajeros());
        // En total 6 pasajeros en el primer vuelo
        listaVuelos.add(new Vuelos("123", "Madrid", "Francia", 120));
        listaVuelos.get(1).listaPasajeros.add(new Pasajeros());
        listaVuelos.get(1).listaPasajeros.add(new Pasajeros());
        listaVuelos.get(1).listaPasajeros.add(new Pasajeros());
        listaVuelos.get(1).listaPasajeros.add(new Pasajeros());
        // En total 4 pasajeros
        listaVuelos.add(new Vuelos("123", "Malaga", "Francia", 120));
        listaVuelos.get(2).listaPasajeros.add(new Pasajeros());
        listaVuelos.get(2).listaPasajeros.add(new Pasajeros());
        listaVuelos.get(2).listaPasajeros.add(new Pasajeros());
        // 3 pasajeros en el vuelo 2

        //6 pasajeros van para madrid y 7 para francia
        Map<String, Integer> listaDestino;
        listaDestino = metodo1(listaVuelos);
        System.out.println(listaDestino.toString());

        listaDestino = metodo2(listaVuelos);
        System.out.println(listaDestino.toString());
        
        Map<String, ArrayList<Pasajeros>> listaPasajeros;
        listaPasajeros=metodo3(listaVuelos);
        
        //System.out.println(listaPasajeros.get("123").toString());  
        
        
        for(Pasajeros aux : listaPasajeros.get("123")){
            System.out.println(aux.toString());
        }
    
    }

    public static HashMap<String, Integer> metodo1(ArrayList<Vuelos> listaVuelos) {
        HashMap<String, Integer> listaDestino = new HashMap<>();
        for (Vuelos aux : listaVuelos) {
            if (listaDestino.containsKey(aux.getDestino())) {
                listaDestino.replace(aux.getDestino(), listaDestino.get(aux.getDestino()) + aux.listaPasajeros.size());
            } else {
                listaDestino.put(aux.getDestino(), aux.listaPasajeros.size());
            }
        }

        return listaDestino;
    }

    public static TreeMap<String, Integer> metodo2(ArrayList<Vuelos> listaVuelos) {
        TreeMap<String, Integer> listaDestino = new TreeMap<>();
        for (Vuelos aux : listaVuelos) {
            if (listaDestino.containsKey(aux.getDestino())) {
                listaDestino.replace(aux.getDestino(), listaDestino.get(aux.getDestino()) + aux.listaPasajeros.size());
            } else {
                listaDestino.put(aux.getDestino(), aux.listaPasajeros.size());
            }
        }

        return listaDestino;
    }

    public static HashMap<String, ArrayList<Pasajeros>> metodo3(ArrayList<Vuelos> listaVuelos) {
        HashMap<String, ArrayList<Pasajeros>> listaPasajeros = new HashMap<>();
        for (Vuelos aux : listaVuelos) {
            listaPasajeros.put(aux.getCodigoVuelo(), aux.listaPasajeros);
        }
        return listaPasajeros;
    }
}
