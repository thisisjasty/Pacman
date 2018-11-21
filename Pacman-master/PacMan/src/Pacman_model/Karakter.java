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
    //boolean voor of het karakter naar rechts kan
    private boolean kanRechts;
    //boolean voor of het karakter naar links kan
    private boolean kanLinks;
    //boolean voor of het karakter naar boven kan
    private boolean kanBoven;
    //boolean voor of hetk arakter naar onder kan
    private boolean kanOnder;
  
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
    public boolean kanNaarRechts() {
        if()
    }
    
    public boolean kanNaarLinks() {
    
    }
    
    public boolean kanNaarBoven() {
    
    }
    
    public boolean kanNaarOnder() {
    
    }
}
