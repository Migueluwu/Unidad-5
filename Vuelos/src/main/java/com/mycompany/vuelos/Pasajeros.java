/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vuelos;

/**
 *
 * @author 34616
 */
public class Pasajeros {
    private String codPasajero, nombre,apellidos, tlf;

    public Pasajeros(String codPasajero, String nombre, String apellidos, String tlf) {
        this.codPasajero = codPasajero;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.tlf = tlf;
    }



    public Pasajeros() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTlf() {
        return tlf;
    }

    public void setTlf(String tlf) {
        this.tlf = tlf;
    }

    public String getCodPasajero() {
        return codPasajero;
    }

    public void setCodPasajero(String codPasajero) {
        this.codPasajero = codPasajero;
    }

    @Override
    public String toString() {
        return "Pasajeros{" + "codPasajero=" + codPasajero + ", nombre=" + nombre + ", apellidos=" + apellidos + ", tlf=" + tlf + '}';
    }


    
    
}
