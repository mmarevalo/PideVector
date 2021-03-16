/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pidevector;

/**
 *
 * @author Miguel
 */
public class ArrayTemp {

    private int[] temperatura;
    private int media, POS;

    public void pidePOS() {
        System.out.println("Inserta tamaño del vector:");
        POS = SLeer2.datoInt();
        temperatura = new int[POS];
    }

    public void pideTemps() {
        for (int i = 0; i < POS; i++) {
            System.out.println("Inserta temperatura:[" + (i + 1) + "]");
            temperatura[i] = SLeer2.datoInt();
        }
    }

    public void sacaMedia() {
        for (int i = 0; i < POS; i++) {
            media += temperatura[i];
        }
        media /= POS;
        System.out.println("El promedio de temperaturas es: " + media);
    }

    /**
    * @param args 
    * probamos que funcionan los metodos
    */
    public static void main(String[] args) { 

        ArrayTemp a = new ArrayTemp();
        a.pidePOS();
        a.pideTemps();
        a.sacaMedia();

    }

}
