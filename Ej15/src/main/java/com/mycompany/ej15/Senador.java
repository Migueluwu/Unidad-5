/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ej15;

/**
 *
 * @author miguel
 */
public class Senador extends Legislador {
    double sueldoExtra;
    @Override
    public String getCamaraEnQueTrabaja() {
        return "Senador";
    }

    public Senador() {
    }

    public Senador(double sueldoExtra) {
        this.sueldoExtra = sueldoExtra;
    }

    public Senador(double sueldoExtra, String provinciaQueRepresenta, String partidoPolitico, String nombre, String apellidos, String NIF) {
        super(provinciaQueRepresenta, partidoPolitico, nombre, apellidos, NIF);
        this.sueldoExtra = sueldoExtra;
    }

    public double getSueldoExtra() {
        return sueldoExtra;
    }

    public void setSueldoExtra(double sueldoExtra) {
        this.sueldoExtra = sueldoExtra;
    }

    @Override
    public String toString() {
        return super.toString()+"\n Senador{" + "sueldoExtra=" + sueldoExtra + '}';
    }
    
}
