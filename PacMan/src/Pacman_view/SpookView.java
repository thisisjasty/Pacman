/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pacman_view;

import javafx.scene.layout.Region;
import Pacman_model.Spook;
import javafx.scene.shape.Circle;

/**
 *
 * @author Jonas Verding, Axel Reyskens, Anna Vanheusden 
 */
public class SpookView extends Region {
    //Data members
    private Spook model;
    private Circle hoofd;
    
    //Constructor
    /**
     * Constructor van de spelerview
     * @param x voor x coördinaat van spook
     * @param y voor y coördinaat van spook
     * 
     */
    public SpookView(int x, int y) {
        this.model = new Spook(x,y); 
        update();     
    }
    
    //Methodes
    /**
     * gebruikt om steeds opnieuw de view te kunnen veranderen wanneer pacman zich in het veld verplaatst
     */
    public void update() {
        getChildren().clear();
        double centerX = model.getX();
        double centerY = model.getY();
        double straal = model.getStraal();
        
        hoofd = new Circle(centerX, centerY,straal);
        //hier leerkrachten beginnen maken, p88 in de cursus! 
        //klasses maken die erven hiervan voor meerdere verschillende leerkrachten?
        getChildren().add(hoofd);    
    }
}
