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
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random r = new Random();

        int tam1 = r.nextInt(11) + 5;
        int tam2 = r.nextInt(11) + 10;
//        ArrayList<Integer> lista1 = new ArrayList<>();
//        ArrayList<Integer> lista2 = new ArrayList<>();
        ArrayList<Integer> lista1 = generarArrayList(tam1);
        ArrayList<Integer> lista2 = generarArrayList(tam2);
//        rellenarArrayList(tam1, lista1);
//        rellenarArrayList(tam2, lista2);
//        for (int i = 0; i < tam1; i++) {
//            lista1.add(i, r.nextInt(51) + 50);
//        }
//        for (int i = 0; i < tam2; i++) {
//            lista2.add(i, r.nextInt(51) + 50);
//        }
        lista1.forEach(e -> System.out.print(e + " - "));
        System.out.println("");
        lista2.forEach(e -> System.out.print(e + " - "));
        System.out.println("");
        ArrayList<Integer> lista3 = new ArrayList<>();
        for (int i = 0; i < lista1.size(); i++) {
            boolean repetido = false;
            for (int j = 0; j < lista2.size(); j++) {
                if (lista1.get(i).equals(lista2.get(j))) {
                    repetido = true;
                }
            }
            if (!repetido) {
                lista3.add(lista1.get(i));
            }
        }
        lista3.forEach(e -> System.out.print(e + " - "));
        System.out.println("");
        ArrayList<Integer> lista4 = new ArrayList<>();
        for (int i = 0; i < lista1.size(); i++) {
            if (lista1.get(i) % 2 == 0) {
                lista4.add(lista1.get(i));
            }
        }
        for (int i = 0; i < lista2.size(); i++) {
            if (lista2.get(i) % 2 != 0) {
                lista4.add(lista2.get(i));
            }
        }
        lista4.forEach(e -> System.out.print(e + " - "));
        System.out.println("");
    }

    public static void rellenarArrayList(int elementos, ArrayList<Integer> lista) {
        Random ale = new Random();
        for (int i = 0; i < elementos; i++) {
            lista.add(ale.nextInt(51) + 50);
        }
    }

    public static ArrayList<Integer> generarArrayList(int elementos) {
        ArrayList<Integer> lista = new ArrayList<>();
        rellenarArrayList(elementos, lista);
        return lista;
    }
}
