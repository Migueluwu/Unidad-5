/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package ejerciciosunidad5;

/**
 *
 * @author miguel
 */
public enum Pizza {
    BARBACOA (22, "Barbacoa Cream",new String[]{"cosa1", "cosa2"}),
    CARBONARA(22, "Barbacoa Cream",new String[]{"cosa1", "cosa2"}),
    JAMONYQUESO(22, "Barbacoa Cream",new String[]{"cosa1", "cosa2"});
    private final int tamanio;
    private final String nombre;
    private final String[] ingredientes;

    private Pizza(int tamanio, String nombre, String[] ingredientes) {
        this.tamanio = tamanio;
        this.nombre = nombre;
        this.ingredientes = ingredientes;
    }

    public int getTamanio() {
        return tamanio;
    }

    public String getNombre() {
        return nombre;
    }

    public String[] getIngredientes() {
        return ingredientes;
    }
    
}
