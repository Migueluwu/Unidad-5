/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author miguel
 */
public enum CategoriaEmpleado {
    inicial("Categoria Basica",50),media("Categoria Media",70),avanzada("Categoria Profesional",100);
    
    private String nombreCategoria;
    private int cantidad;
    private CategoriaEmpleado(String nombre,int cantidad){
        this.nombreCategoria=nombre;
        this.cantidad=cantidad;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public int getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return "CategoriaEmpleado{" + "nombreCategoria=" + nombreCategoria + ", cantidad=" + cantidad + '}';
    }
}
