/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Objects;

/**
 *
 * @author miguel
 */
public class Trabajador implements Comparable<Trabajador>{

    private String nombre;
    private String apellidos;
    private LocalDate fechaNacimiento;
    private CategoriaEmpleado categoria;
    private static int sueldoBase=1707;
    public Trabajador(String nombre, String apellidos, LocalDate fecha, CategoriaEmpleado categoria) {
        if (fecha.plusYears(16).isBefore(LocalDate.now())) {
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.fechaNacimiento = fecha;
            this.categoria = categoria;
        }else{
            throw new IllegalArgumentException("Necesita ser mayor de edad");
        }
    }
    
    
    public Trabajador(Trabajador trabajador){
        this.nombre=trabajador.nombre;
        this.apellidos=trabajador.apellidos;
        this.fechaNacimiento=trabajador.fechaNacimiento;
        this.categoria=trabajador.categoria;
    }
    
    public double calcularSueldo(){
        return sueldoBase+this.categoria.getCantidad();
    }
    
    public static LocalDate fechaJubilacion(Trabajador trabajador){
        return trabajador.fechaNacimiento.plusYears(66);
    }

    @Override
    public String toString() {
        String aux="";
        LocalDate fechaJub=fechaJubilacion(this);
        aux="\t"+this.apellidos+", "+this.nombre+"\t";
        aux=aux+"F.Nac: "+this.fechaNacimiento.getDayOfMonth()+"/"+
                this.fechaNacimiento.getMonthValue()+"/"+this.fechaNacimiento.getYear()+"\n";
        aux=aux+"Categoria: "+this.categoria.getNombreCategoria()+"\n";
        aux=aux+"Fecha Jubilacion: "+fechaJub.getDayOfWeek().getDisplayName(TextStyle.FULL,Locale.getDefault(Locale.Category.DISPLAY))+" "+fechaJub.getDayOfMonth()+
                " de "+fechaJub.getMonth().getDisplayName(TextStyle.FULL, Locale.getDefault())+" de "+fechaJub.getYear()+"\n";
        aux=aux+"sueldo actual: "+calcularSueldo();
        return aux;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.nombre);
        hash = 29 * hash + Objects.hashCode(this.apellidos);
        hash = 29 * hash + Objects.hashCode(this.fechaNacimiento);
        hash = 29 * hash + Objects.hashCode(this.categoria);
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
        final Trabajador other = (Trabajador) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellidos, other.apellidos)) {
            return false;
        }
        if (!Objects.equals(this.fechaNacimiento, other.fechaNacimiento)) {
            return false;
        }
        return this.categoria == other.categoria;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public int compareTo(Trabajador t) {
        return this.nombre.compareTo(t.nombre);
    }
    
}
