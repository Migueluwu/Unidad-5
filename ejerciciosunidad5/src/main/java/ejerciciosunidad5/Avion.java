/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosunidad5;

/**
 *
 * @author miguel
 */
public class Avion {
    private final int NUMFILA=25;
    private final int NUMCOLUM=4;
    private Asiento avion[][]=new Asiento[NUMFILA][NUMCOLUM];

    public Avion() {
        for (int i = 0; i < avion.length; i++) {
            for (int j = 0; j < avion[i].length; j++) {
                avion[i][j]=new Asiento();
                
            }
            
        }
    }
    
    public void reservarAsiento(int fila,int columna){
        if(fila<avion.length&&fila>=0&&columna<avion[fila].length&&fila>=0){
        avion[fila][columna].reservar();
        }
    }
    public void cancelarAsiento(int fila,int columna){
        if(fila<avion.length&&fila>=0&&columna<avion[fila].length&&fila>=0){
            avion[fila][columna].cancelar();
        }
    }
    
    public void imprimirAvion(){
        for(int i=0;i<avion.length;i++){
            System.out.print("|");
            for(int j=0;j<avion[i].length;j++){
                if(avion[i][j].isReservado()){
                    System.out.print("x");
                }else{
                    System.out.print("o");
                }
            }
            System.out.print("|"+"\n");
        }
    }
}
