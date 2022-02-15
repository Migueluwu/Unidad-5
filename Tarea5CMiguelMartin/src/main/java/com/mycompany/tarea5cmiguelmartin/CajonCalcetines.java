/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tarea5cmiguelmartin;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author miguel
 */
public class CajonCalcetines {

    /**
     * @param args the command line arguments
     */
    private ArrayList<Calcetin> cajon;

    public CajonCalcetines() {
        Random ale = new Random();
        int numCalcetines = ale.nextInt(11) + 10;
        cajon = new ArrayList<>();
        ///Rellena el cajon con calcetines sin parametro(forma aleatoria)
        for (int i = 0; i < numCalcetines; i++) {
            cajon.add(new Calcetin());
        }
    }

    public static ArrayList<Calcetin> clonCajon(ArrayList<Calcetin> cajon){
        ArrayList<Calcetin> clon=new ArrayList<>();
        for(int i=0;i<cajon.size();i++){
            clon.add(cajon.get(i));
        }
               
        return clon;
    }

    public ArrayList<Calcetin> getCajon() {
        return cajon;
    }

    public void setCajon(ArrayList<Calcetin> cajon) {
        this.cajon = cajon;
    }

    @Override
    public String toString() {
        return "CajonCalcetines{" + "cajon=" + cajon + '}';
    }

   public Calcetin[] calcetinesSinPareja(){
       
       ArrayList<Calcetin>aux= new ArrayList<>();
       aux.clear();
       aux=clonCajon(cajon);
       
       for(int i=0;i<aux.size()-1;i++){
           for(int j=i+1;j<aux.size();j++){
               if(aux.get(i).equals(aux.get(j))){
                   aux.remove(j);
                   aux.remove(i);
                   j=i;
               }
           }
           
       }
           
       
       
       
       
     
       Calcetin[] array=new Calcetin[aux.size()];
       for(int j=0;j<aux.size();j++){
           array[j]=aux.get(j);
       }
       
       return array;
       
   }

    


    

}
