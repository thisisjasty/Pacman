/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pacman_model;

import java.util.ArrayList;

/**
 * Abstracte klasse waar de speler (pacman) en een spook van kunnen erven
 * 
 * @author Jonas Verding, Axel Reyskens, Anna Vanheusden 
 */
public abstract class Karakter {
    //Data members
    //X-positie in het veld van het karakter
    private int x;
    //Y-positie in het veld van het karakter
    private int y;
    //straal van het cirkelvormig karakter
    private int straal;
  
    //Constructoren
    /**
     * Constructor voor karakter in midden van het veld
     */
    public Karakter() {  
        this.x = 0;
        this.y = 0;
        this.straal = 15;
    }
    /**
     * Constructor voor karakter geplaatst op punt (x,y) in het veld
     * @param x, x-coordinaat
     * @param y, y-coordinaat
     */
    public Karakter(int x, int y) {  
        this.x = x;
        this.y = y;
    }
    
    //Getters
    /**
     * Getter voor x-coördinaat
     * 
     * @return x, huidige x-coördinaat
     */
    public int getX() {
        return x;
    }
    /**
     * Getter voor y-coördinaat
     * 
     * @return y, huidige y-coördinaat
     */
    public int getY() {
        return y;
    }
    
    /**
     * 
     * Getter voor straal
     */
    public int getStraal() {
        return straal;
    }
    
    //Setters
    /**
     * 
     * Setter voor x-coördinaat
     */
    public void setX(int x) {
        this.x = x;
    }
    
    /**
     * 
     * Setter voor y-coördinaat
     */
    public void setY(int y) {
        this.y = y;
    }
    


    //Methodes
    /**
     * Methode om karakter oostwaarts te laten bewegen
     * 
     */
    public void gaOost() {
        verplaats();
        this.x = x++;
    }
    
    /**
     * Methode om karakter westwaarts te laten bewegen
     * 
     */
    public void gaWest() {
        verplaats();
        this.x = x--;
    }
    
    /**
     * Methode om karakter noordwaarts te laten bewegen
     * 
     */
    public void gaNoord() {
        verplaats();
        this.y = y++;
    }
    
    /**
     * Methode om karakter zuidwaarts te laten bewegen
     * 
     */
    public void gaZuid() {
        verplaats();
        this.y = y--;
    }
    
    public void verplaats() {
    }
    
}
