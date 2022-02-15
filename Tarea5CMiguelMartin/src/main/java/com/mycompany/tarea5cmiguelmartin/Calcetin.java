/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea5cmiguelmartin;

import java.util.Objects;
import java.util.Random;

/**
 *
 * @author miguel
 */
public class Calcetin {
    private Color color;
    private int talla;

    public Calcetin() {
        int[]tamaños={40,41,42,43};
        Random ale=new Random();
        talla=tamaños[ale.nextInt(4)];
        int numerocolor=ale.nextInt(3);
        color=Color.values()[numerocolor];
//        switch(numerocolor){
//            case 0:
//                color=Color.NEGRO;
//                break;
//            case 1:
//                color=Color.GRIS_CLARO;
//                break;
//            case 2:
//                color=Color.GRIS_OSCURO;
//                break;
//        }
        
                
    }

    @Override
    public String toString() {
        return "Calcetin{" + "color=" + color + ", talla=" + talla + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.color);
        hash = 17 * hash + this.talla;
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
        final Calcetin other = (Calcetin) obj;
        if (this.talla != other.talla) {
            return false;
        }
        return this.color == other.color;
    }


    
}
