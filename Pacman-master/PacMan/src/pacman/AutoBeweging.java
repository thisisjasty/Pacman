/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacman;

import Pacman_model.Spook;

/**
 *
 * @author r0706318
 */
 class AutoBeweging implements Runnable {
    // data members (instance variables)
    private Spook model; 
    private FXMLViewController controller;
    /**
     * Constructor for objects of class Zwaartekracht
     * @param model
     * @param view
     */
    public AutoBeweging(Spook model, FMXLViewController controller)
    {
        this.model = model;
        this.controller = controller;
    }

    public void run() {
      while (true) {  
        try {
          Thread.sleep(1000);
          model.;
          Platform.runLater(() -> {
              controller.updateViews();
          });
        }
        catch (InterruptedException e) {}
      }
    }

}
