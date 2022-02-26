/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loteria;

/**
 *
 * @author 34616
 */
public enum Premios {
    primerPremio("Primer premio",1000),segundoPremio("Segundo premio",500),tercerPremio("Tercer premio",200),nada("Nada",0);
    
    private String nombrePremio;
    private int cantidad;
    private Premios(String nombrePremio,int cantidad){
        this.nombrePremio=nombrePremio;
        this.cantidad=cantidad;
    }

    @Override
    public String toString() {
        return "Premios{" + "nombrePremio=" + nombrePremio + ", cantidad=" + cantidad + '}';
    }

    public String getNombrePremio() {
        return nombrePremio;
    }

    public int getCantidad() {
        return cantidad;
    }
}
