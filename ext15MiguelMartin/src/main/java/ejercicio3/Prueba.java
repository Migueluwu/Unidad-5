/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

import ejercicio1.CategoriaEmpleado;
import ejercicio1.Trabajador;
import ejercicio2.Empresa;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author miguel
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empresa empresaA=new Empresa("Empresa A", "01234556asda");
        Empresa empresaB=new Empresa("Empresa B", "987564asd");
        ///////////////
        Trabajador t1=new Trabajador("Miguel", "Martin", LocalDate.of(1994, 12, 22), CategoriaEmpleado.media); 
        Trabajador t2=new Trabajador("Apruebame", "Profavor", LocalDate.of(2000, 1, 1), CategoriaEmpleado.inicial);
        Trabajador t3=new Trabajador("Obi-Wan", "kenobi", LocalDate.of(1900, 6, 20), CategoriaEmpleado.media);
        Trabajador t4= new Trabajador("Pepito","Perez", LocalDate.of(2003, 5, 5), CategoriaEmpleado.media);
        Trabajador t5=new Trabajador("Estoy", "Cansao", LocalDate.of(1999, 12, 12), CategoriaEmpleado.avanzada);
        Trabajador t6=new Trabajador(t3);
        /////
        empresaA.contratar(t1);
        empresaA.contratar(t2);
        empresaA.contratar(t3);
        empresaB.contratar(t4);
        empresaB.contratar(t5);
        empresaB.contratar(t6);
        empresaA.imprimir();
        empresaB.imprimir();
        /////
        empresaB.despedir(t5);
        empresaA.contratar(t5);
        /////
        empresaA.ordenarNombre();
        empresaB.ordenarNombre();
        empresaA.imprimir();
        empresaB.imprimir();
        //////
        System.out.println("posicion de obiwan en la empresa A: "+empresaA.buscarNombre(t6));
        System.out.println("posicion de obiwan en la empresa B: "+empresaB.buscarNombre(t6));
    } 
}
