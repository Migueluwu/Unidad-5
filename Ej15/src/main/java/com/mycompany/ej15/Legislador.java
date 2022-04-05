/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ej15;

/**
 *
 * @author miguel
 */
public abstract class Legislador extends Persona{
    private String provinciaQueRepresenta;
    private String partidoPolitico;

    public Legislador() {
    }

    public Legislador(String provinciaQueRepresenta, String partidoPolitico, String nombre, String apellidos, String NIF) {
        super(nombre, apellidos, NIF);
        this.provinciaQueRepresenta = provinciaQueRepresenta;
        this.partidoPolitico = partidoPolitico;
    }

    public String getProvinciaQueRepresenta() {
        return provinciaQueRepresenta;
    }

    public void setProvinciaQueRepresenta(String provinciaQueRepresenta) {
        this.provinciaQueRepresenta = provinciaQueRepresenta;
    }

    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }

    @Override
    public String toString() {
        return super.toString()+"\n Legislador{" + "provinciaQueRepresenta=" + provinciaQueRepresenta + ", partidoPolitico=" + partidoPolitico + '}';
    }

    public abstract String getCamaraEnQueTrabaja();
}
