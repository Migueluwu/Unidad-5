/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loteria;

import java.util.Scanner;

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
        Loteria loteria=new Loteria();
        loteria.imprimirLoteria();
        Scanner sc=new Scanner(System.in);
        String numero;
        do{
            System.out.println("introduce el numero que quieres consultar");
            numero=sc.nextLine();
            if(!numero.equalsIgnoreCase("salir")){
            System.out.println("Su premio es "+loteria.consultarPremio(numero));
            }
        }while(!numero.equalsIgnoreCase("salir"));
    }
    
}
