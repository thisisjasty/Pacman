/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pacman_model;

/**
 * Statisch object dat pacman kan oppakken. Zijn score wordt hierdoor met 1 verhoogd.
 * 
 * @author Jonas Verding, Axel Reyskens, Anna Vanheusden
 */
public class Bolletje {
    //Data members
    // x-coördinaat van bolletje
    private int x;
    // y-coördinaat van bolletje
    private int y;
    // straal van bolletje
    private int straal;
    // of bolletje nog in veld aanwezig is of al opgegeten is 
    private boolean aanwezig;
    
    //Constructor
    /**
     * 
     * @param x x-positie van het bolletje
     * @param y y-positie van het bolletje 
     */
    public Bolletje(int x, int y) {
        this.x = x;
        this.y = y;
        this.straal = 5;
        this.aanwezig = true;
    }
    
    //Getters
    /**
     * getter voor x
     * 
     * @return x de x-coördinaat van het bolletje
     */
    public int getX() {
        return x;
    }
    
    /**
     * getter voor y
     * 
     * @return y de y-coördinaat van het bolletje
     */
    public int getY() {
        return y;
    }
    
    /**
     * getter voor aanwezig
     * 
     * @return boolean aanwezig: of bolletje nog in het veld zit of al opgepakt is
     */
    public boolean isAanwezig() {
        return aanwezig;
    }
    /**
     * getter voor straal
     * @return straal, de straal van het bolletje
     **/
    public int getStraal() {
        return straal;
    }
    
    
    //Setters
    /**
     * setter voor aanwezig
     * @param boolean aanwezig, of het nog aanwezig is of niet
     **/
    public void setAanwezig(boolean aanwezig) {
        this.aanwezig = aanwezig;
    }
    //Methodes

    

}
