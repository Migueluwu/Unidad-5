/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

import ejercicio1.Trabajador;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author miguel
 */
public class Empresa {
    private ArrayList<Trabajador> empresa;
    private String nombre;
    private String cif;
    public Empresa(String nombre, String cif){
        empresa=new ArrayList<>();
        this.nombre=nombre;
        this.cif=cif;
    }
    public void imprimir(){
        System.out.println("Nombre: "+this.nombre);
        System.out.println("CIf: "+this.cif);
        for(Trabajador aux: empresa){
            System.out.println(aux);
        }
    }
    public void contratar(Trabajador t){
        this.empresa.add(t);
    }
    public boolean despedir(Trabajador t){
        if(this.empresa.contains(t)){
            for(Trabajador aux:this.empresa){
                if(aux.equals(t)){
                    this.empresa.remove(aux);
                }
            }
            return true;
        }else{
            return false;
        }
    }
    public int[] buscarTodosNombre(String nombre){
        ArrayList<Integer> repetidos=new ArrayList<>();
        int[]repetidosArray;
        for(int i=0;i<this.empresa.size();i++){
            if(this.empresa.get(i).getNombre().equalsIgnoreCase(nombre)){
                repetidos.add(i);
            }
        }
        if(repetidos.isEmpty()){
            return null;
        }else{
            repetidosArray=new int[repetidos.size()];
            for(int i=0;i<repetidos.size();i++)
                repetidosArray[i]=repetidos.get(i);
        }
        return repetidosArray;
    }
    
    public void ordenarNombre(){
        Collections.sort(empresa);
    }
    public int buscarNombre(Trabajador t){
        return Collections.binarySearch(empresa, t);
    }
}
