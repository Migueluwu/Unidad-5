/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ej15;

/**
 *
 * @author miguel
 */
public class Diputado extends Legislador {
    private int asiento;
    @Override
    public String getCamaraEnQueTrabaja() {
        return "Diputado";
                
    }

    public Diputado() {
    }

    public Diputado(int asiento) {
        this.asiento = asiento;
    }

    public Diputado(int asiento, String provinciaQueRepresenta, String partidoPolitico, String nombre, String apellidos, String NIF) {
        super(provinciaQueRepresenta, partidoPolitico, nombre, apellidos, NIF);
        this.asiento = asiento;
    }

    public int getAsiento() {
        return asiento;
    }

    public void setAsiento(int asiento) {
        this.asiento = asiento;
    }

    @Override
    public String toString() {
        return super.toString()+"\n Diputado{" + "asiento=" + asiento + '}';
    }
    
}
