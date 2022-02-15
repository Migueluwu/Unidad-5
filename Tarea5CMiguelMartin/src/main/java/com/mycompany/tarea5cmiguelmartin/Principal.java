/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tarea5cmiguelmartin;

/**
 *
 * @author miguel
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CajonCalcetines cajon=new CajonCalcetines();
        System.out.println(cajon.getCajon());
        Calcetin[]sinparejas=cajon.calcetinesSinPareja();
//        System.out.println(cajon.calcetinesSinPareja());
        for(int i=0;i<sinparejas.length;i++){
            System.out.print (sinparejas[i]+" ");
        }
        
    }
    
    
}
