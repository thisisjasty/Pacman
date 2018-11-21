/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pacman_model;

import java.util.ArrayList;

/**
 *
 * model voor de pacman-speler. bevat diens eigenschappen.
 * 
 * @author Jonas Verding, Axel Reyskens, Anna Vanheusden 
 */
public class Speler extends Karakter {
    //Data members
    // Stand van het aantal bolletjes opgeraapt door PacMan
    private int score;
    // Of PacMan nog leeft of niet (nog niet geraakt is door spook)
    private boolean levend;
    // lijst met aanwezige bolletjes
    private ArrayList<Bolletje> bolletjes;
    // lijst met aanwezige spoken
    private ArrayList<Spook> spoken;
    // of hij spoken mag opeten of niet
    private boolean eetMode;
    
    /**
     * Constructor van de speler
     */
    public Speler(ArrayList<Bolletje> bolletjes, ArrayList<Spook> spoken) {
        super();
        this.bolletjes = bolletjes;
        this.spoken = spoken;
        this.score = 0;
        this.levend = true;
        this.eetMode = false;
    }
    
    //Getters
    /**
     * Getter voor score
     * @return int score, de huidige score/aantal opgepakte bolletjes
     */
    public int getScore() {
        return score;
    }
    
    /**
     * Getter voor levend
     * @return boolean levend, of pacman nog leeft en dus nog niet is geraakt door spook
     */
    public boolean isLevend() {
        return levend;
    }
    
    //Setters
    /**
     * Setter voor levend
     * 
     */
    public void setLevend(boolean levend) {
        this.levend = levend;
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
    
    /**
     * Score wordt verhoogd wanneer PacMan bolletje pakt
     */
    public void pakBolletje() {//Eventueel view in arraylist steken, vermits view ook info van het object bevat + afmetingen kan bevatten?
        for(Bolletje i : bolletjes) {  
            if(this.x + afstand == i.getX() + i.getStraal() || this.y + afstand == i.getY() + i.getStraal() && this.levend == true) {
                this.score = score++;
                i.setAanwezig(false);
                if(i instanceof SpecBolletje ) {
                    this.eetMode = true; // MOET ongev. 10sec duren !!!
                }
                bolletjes.remove(i);
            }
        }
    }
    
    /** 
     * Wordt geraakt door spookje`
     * `
     * @return boolean true or false
     * @param arraylist spoken: spoken die pacman zouden kunnen raken 
     */
    public void geraakt() { 
        for (Spook i : spoken) { //arraylist doorlopen 
            if (this.x + this.straal == i.getX() + i.getStraal() || this.y + this.straal == i.getY() + i.getStraal()) {
                this.levend = false;
            }
        }
    }
    
    @Override //gaat deze nu automatisch worden uitgevoerd in die gaNoord, oost, zuid en west methodes?
    public void verplaats() {
        super.verplaats();
        pakBolletje(); // moeten eigenlijk beide een arraylist meekrijgen, is het een idee om gewoon die arraylists als parameter mee te geven in de constructor van de speler en die in een datamember te steken? 
        geraakt();
        // checkt of hij door kan 
    }
}
