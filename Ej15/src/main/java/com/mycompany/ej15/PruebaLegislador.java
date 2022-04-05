/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ej15;

import java.util.ArrayList;

/**
 *
 * @author miguel
 */
public class PruebaLegislador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Legislador> camara=new ArrayList<>();
        camara.add(new Diputado());
        camara.add(new Senador());
        System.out.println(camara.get(0).getCamaraEnQueTrabaja());
        System.out.println(camara.get(1).getCamaraEnQueTrabaja());
    }
    
}
