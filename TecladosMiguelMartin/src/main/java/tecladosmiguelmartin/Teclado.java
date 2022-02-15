/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tecladosmiguelmartin;

import java.util.Objects;

/**
 *
 * @author miguel
 */
public class Teclado {
    private String modelo;
    private String marca;
    private int serie;
    private double precio;

    public Teclado(String modelo, String marca, int serie, double precio) {
        this.modelo = modelo;
        this.marca = marca;
        this.serie = serie;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Teclado{" + "modelo=" + modelo + ", marca=" + marca + ", serie=" + serie + ", precio=" + precio + '}';
    }

 

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.modelo);
        hash = 41 * hash + Objects.hashCode(this.marca);
        hash = 41 * hash + this.serie;
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.precio) ^ (Double.doubleToLongBits(this.precio) >>> 32));
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
        final Teclado other = (Teclado) obj;
        if (this.serie != other.serie) {
            return false;
        }
        if (Double.doubleToLongBits(this.precio) != Double.doubleToLongBits(other.precio)) {
            return false;
        }
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        return Objects.equals(this.marca, other.marca);
    }

   
}
