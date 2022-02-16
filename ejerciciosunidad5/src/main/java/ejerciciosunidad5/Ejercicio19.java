/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosunidad5;

/**
 *
 * @author miguel
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Avion avion=new Avion();
        
        avion.reservarAsiento(0, 0);
        avion.reservarAsiento(3, 5);
        avion.reservarAsiento(1, 1);
        avion.reservarAsiento(2, 3);
        avion.imprimirAvion();
        
    }
    
}
