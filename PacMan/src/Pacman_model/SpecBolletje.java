/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pacman_model;

/**
 * speciaal bolletje, als pacman dit pakt kan hij de spookjes opeten
 * 
 * @author jonasverding
 */
public class SpecBolletje extends Bolletje{
    //Datamembers
    // straal van het bolletje
    private int straal;
    
    //Constructor
    /**
     * Constructor vo
     * 
     * @param x
     * @param y 
     */
    public SpecBolletje(int x, int y) {
        super(x,y);
        this.straal = 8;
    }
}
