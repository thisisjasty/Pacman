/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pacman_model;

/**
 * model voor een spook, bevat diens eigenschappen.
 * 
 * @@author Jonas Verding, Axel Reyskens, Anna Vanheusden 
 */
public class Spook extends Karakter {
    //Data members
    
    //Constructor
    /**
     * Constructor voor Spook
     */
    public Spook(int x, int y) {
        super(x, y); 
    }
    
    //Getters
    
    //Setters
    
    //Methodes
     /**
     * Methode om karakter oostwaarts te laten bewegen
     * 
     */
    public void gaOost() {
        this.x = x++;
    }
    
    /**
     * Methode om karakter westwaarts te laten bewegen
     * 
     */
    public void gaWest() {
        this.x = x--;
    }
    
    /**
     * Methode om karakter noordwaarts te laten bewegen
     * 
     */
    public void gaNoord() {
        this.y = y++;
    }
    
    /**
     * Methode om karakter zuidwaarts te laten bewegen
     * 
     */
    public void gaZuid() {
        this.y = y--;
    }
    
    public void kan
    
    
    public void verplaats(){
        // moet check uitvoeren of spook door kan, geschikte keuze voor beweging maken
        // MOET DOOR THREAD UITGEVOERD WORDEN 
    
    }
}
