/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacman;

import static apple.laf.JRSUIConstants.Direction.DOWN;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import static javafx.scene.control.ButtonBar.ButtonData.LEFT;
import static javafx.scene.control.ButtonBar.ButtonData.RIGHT;
import javafx.scene.control.Label;
import static javafx.scene.input.KeyCode.UP;

/**
 *
 * @author Jonas Verding, Axel Reyskens, Anna Vanheusden 
 */
public class FXMLViewController implements Initializable {
    //pacman als model voor info over het object
    private Speler model;
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        grafischPaneel.setOnKeyPressed(this::beweegToets);
        grafischPaneel.setFocusTraversable(true); 
    }
    
    //Methodes
    
    /**
     * methode om wanneer een pijltoets wordt ingedrukt, pacman de bijhorende richting uit te laten gaan
     * 
     * @param e de toets die wordt ingedrukt
     */
    public void beweegToets(KeyEvent e) {
        switch(e.getCode()) {
            case LEFT: 
                west();
                break; 
            case RIGHT:
                oost();
                break;
            case UP:
                noord();
                break;
            case DOWN:
                zuid();
                break;
        }
    }
    /**
     * methode voor het initialiseren van de pacman view & het pacman model in de controller
     * @param model het model dat bij pacman hoort
     */
    public void setModel(Speler model) { //METHODE VOOR HET TOEVOEGEN VAN GRAFISCHE VIEW AAN ANCHORPANE
        this.model = model;
        view = new GrafischeView(model); //VIEW AANGEMAAKT MET SPECIFIEK MODEL ER IN
        grafischPaneel.getChildren().add(view); //VIEW IN ANCHORPANE TOEGEVOEGD
        update();
    }
    
    
    /**
     * Om naar het noorden te gaan met pacman
     */
    public void noord() {
        model.gaNoord();
        update();
    }
    /**
     * Om naar het oosten te gaan met pacman
     */
    public void oost() {
        model.gaOost();
        update();
    }
    
    /**
     * Om naar het zuiden te gaan met pacman
     */
    public void zuid() {
        model.gaZuid();
        update();
    }
    
    /**
     * Om naar het westen te gaan met pacman
     */
    public void west() {
        model.gaWest();
        update();
    }
}
