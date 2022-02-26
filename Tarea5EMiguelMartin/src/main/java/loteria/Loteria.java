/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loteria;

import java.util.Random;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 *
 * @author 34616
 */
public class Loteria {
    private SortedMap<String, Premios> loteria;
    private Random ale=new Random();
    public Loteria(){
        loteria=new TreeMap<>();
        for(int i=0;i<1000;i++){
            String numero="";
            for(int j=0;j<5;j++){
                numero=numero+String.valueOf(ale.nextInt(10));
            }
            loteria.put(numero, Premios.nada);
        }
        
        String[]loteriaArray= loteria.keySet().toArray(new String[1000]);
        String primerPremio,segundoPremio,tercerPremio;
        primerPremio=loteriaArray[ale.nextInt(1000)];
        segundoPremio=loteriaArray[ale.nextInt(1000)];
        tercerPremio=loteriaArray[ale.nextInt(1000)];
        
        loteria.replace(primerPremio, Premios.primerPremio);
        loteria.replace(segundoPremio, Premios.segundoPremio);
        loteria.replace(tercerPremio, Premios.tercerPremio);
    }
    public String consultarPremio(String numero){
        if(loteria.containsKey(numero)){
            return loteria.get(numero).toString();
        }
        return "numero incorrecto";
    }
    public void imprimirLoteria(){
        for(String aux:loteria.keySet()){
            System.out.println(aux+" ----->"+loteria.get(aux));
        }
    }
}
