/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vuelos;

import java.util.ArrayList;

/**
 *
 * @author 34616
 */
public class Vuelos {
    private String codigoVuelo, origen, destino; 
    private int duración;
    private ArrayList <Pasajeros> listaPasajeros;

    public Vuelos() {
        this.listaPasajeros=new ArrayList<>();
    }

    public Vuelos(String codigoVuelo, String origen, String destino, int duración) {
        this.codigoVuelo = codigoVuelo;
        this.origen = origen;
        this.destino = destino;
        this.duración = duración;
        this.listaPasajeros=new ArrayList<>();
        
    }

    public String getCodigoVuelo() {
        return codigoVuelo;
    }

    public void setCodigoVuelo(String codigoVuelo) {
        this.codigoVuelo = codigoVuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getDuración() {
        return duración;
    }

    public void setDuración(int duración) {
        this.duración = duración;
    }

    public ArrayList<Pasajeros> getListaPasajeros() {
        return listaPasajeros;
    }

    public void setListaPasajeros(ArrayList<Pasajeros> listaPasajeros) {
        this.listaPasajeros = listaPasajeros;
    }

    @Override
    public String toString() {
        return "Vuelos{" + "codigoVuelo=" + codigoVuelo + ", origen=" + origen + ", destino=" + destino + ", duraci\u00f3n=" + duración + ", listaPasajeros=" + listaPasajeros + '}';
    }
    
}
