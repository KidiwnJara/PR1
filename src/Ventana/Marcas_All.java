/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventana;

import java.util.ArrayList;

/**
 *
 * @author kidiwnjt
 */
public class Marcas_All {

    /**
     * @return the ListaGene
     */
    public static ArrayList getListaGene() {
        return ListaGene;
    }

    /**
     * @param aListaGene the ListaGene to set
     */
    
    
    public static void setListaGene(ArrayList aListaGene) {
        ListaGene = aListaGene;
        System.out.println("Lista   "+ ListaGene);
    }
    public static void agregalista(ArrayList lista) {
        ListaGene.add(lista);
        System.out.println("Lista   "+ ListaGene);
    }
    private static ArrayList ListaGene = new ArrayList();
    
}
