/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosunidad5;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author miguel
 */
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random r=new Random();
//        ListaInteger miLista=new ListaInteger(10);
//        ArrayList<Integer>list=miLista.getLista();
        ArrayList<Integer>list=new ArrayList<>();
        list.add(6);
        list.add(6);
        list.add(6);
        list.add(6);
        list.add(6);
        
        for(int i=0;i<25;i++){
            list.add(r.nextInt(91)+10);
        }
        for(Integer integer : list){
            System.out.print(integer+" - ");
        }
        
        int sumaPares=0;
        for(int i=0;i<list.size();i++){
            int numero=list.get(i);
            if(numero%2==0){
                sumaPares+=numero;
            }
        }
        System.out.println("Suma de pares: "+sumaPares);
        int mayor=Integer.MIN_VALUE;
        System.out.println(mayor+ "sad");
        for(Integer num : list){
            if(num>mayor){
                mayor=num;
            }
        }
        System.out.println("mayor: "+mayor);
        
        //borrado de la posicion 3
        list.remove(3);
        list.forEach(e->System.out.print(e+ " - "));
        System.out.println("");
        list.set(0, 200);
        list.forEach(e->System.out.print(e+ " - "));
        System.out.println("");
        list.add(2, 500);
        list.forEach(e->System.out.print(e+ " - "));
        System.out.println("");
        System.out.println(list.indexOf(500));
        Integer a=6;
        list.forEach(e->System.out.print(e+ " - "));
        System.out.println("");
    }
   
    
}
