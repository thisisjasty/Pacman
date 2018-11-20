/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pacman_view;

import javafx.scene.layout.Region;
import Pacman_model.Speler;
import javafx.scene.shape.Circle;

/**
 *
 * @author Jonas Verding, Axel Reyskens, Anna Vanheusden 
 */
public class SpelerView extends Region {
    //Data members
    private Speler model;
    private Circle hoofd;
    
    //Constructor
    /**
     * Constructor van de spelerview
     * @param model het bijhorende model van pacman
     */
    public SpelerView(Speler model) {
        this.model = model; 
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
        //hier kris aerts maken, p88 in de cursus!
        getChildren().add(hoofd);
    }
}
