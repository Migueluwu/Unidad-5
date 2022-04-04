/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author 34616
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SopaDeLetras sopa=new SopaDeLetras(10);
        
        sopa.colocarPalabraHorizontal(0, 6,"abcd");
        sopa.colocarPalabraHorizontal(0, 3, "wyzg");
        
        sopa.colocarPalabraVertical(0, 3, "uwu");
        System.out.println(sopa);
    }
    
}
