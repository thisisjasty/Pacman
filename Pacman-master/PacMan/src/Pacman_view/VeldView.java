/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pacman_view;

import javafx.scene.shape.Rectangle;

/**
 *
 * @author jonasverding
 */
public class VeldView {
    private Rectangle bar1;
    private Rectangle bar2;
    private Rectangle bar3;
    private Rectangle bar4;
    
    //Rechterzijkant
    bar1 = new Rectangle(0, 0, 30, 180);
    bar2 = new Rectangle(0, 150, 150, 30);
    bar3 = new Rectangle(150, 150, 30, 90);
    bar4 = new Rectangle(0, 240, 150, 30);
    bar5 = new Rectangle(0, 270, 150, 30);
    bar6 = new Rectangle(150, 270, 30, 90);
    bar7 = new Rectangle(150, 360, 90, 30);
    bar8 = new Rectangle(0, 390, 30, 180);
    
    //Linkerzijkant      x  y  w  h
    bar9 = new Rectangle(590, 0, 30, 180);
    bar10 = new Rectangle(450, 150, 150, 30);
    bar11 = new Rectangle(300, 150, 30, 90);
    bar12 = new Rectangle(590, 240, 150, 30);
    bar13 = new Rectangle(590, 270, 150, 30);
    bar14 = new Rectangle(300, 270, 30, 90);
    bar15 = new Rectangle(300, 360, 90, 30);
    bar16 = new Rectangle(590, 390, 30, 180);
    
    //Bovenkant
    bar17 = new Rectangle(0, 0, 30, 620);
     
    //Onderkant
    bar18 = new Rectangle(0, 590, 30, 620);
    
    
}
