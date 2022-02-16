/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosunidad5;

/**
 *
 * @author miguel
 */
public class Asiento {
    private boolean reservado;

    public Asiento() {
        reservado=false;
    }

    @Override
    public String toString() {
        return "Asiento{" + "reservado=" + reservado + '}';
    }

    public void cancelar() {
        this.reservado = false;
    }
    public void reservar(){
        this.reservado=true;
    }
    public boolean isReservado() {
        return reservado;
    }
    
}
