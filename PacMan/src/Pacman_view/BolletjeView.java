/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pacman_view;

import javafx.scene.layout.Region;
import Pacman_model.Bolletje;

/**
 *
 * @author Jonas Verding, Axel Reyskens, Anna Vanheusden 
 */
public class BolletjeView extends Region {
    private Bolletje model;
    
    //Constructor
    /**
     * Constructor van de spelerview
     * @param model het bijhorende model van pacman
     */
    public BolletjeView(Bolletje model) {
        this.model = model;     
    }
    
    //Methodes
    /**
     * gebruikt om steeds opnieuw de view te kunnen veranderen wanneer pacman zich in het veld verplaatst
     */
    public void update() {
        if(model.isAanwezig() == true){
            getChildren().clear();
        }
    }
    
    
}
