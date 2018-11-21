/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pacman_model;

/**
 * //Veld maken van 620x620
 * 
 * @author jonasverding
 */
public class Veld {
    //Data members  
    //array met bolletjes op coördinaat x & y
    private Bolletje[][] bolletjesVeld;
    

    
    
    public Veld() {
        //opgebouwd in horizontale rijen
        //nulpunt ligt in java in linker bovenhoek
        //van onder naar boven:
        //Rij 1
        for(int i = 30 ; i<590 ; i = i +20) {
            bolletjesVeld[i][590] = new Bolletje(i, 590);
        }       
        
        //Rij 2
        bolletjesVeld[30][570] = new Bolletje(30, 570);
        bolletjesVeld[250][570] = new Bolletje(250, 570);
        bolletjesVeld[310][570] = new Bolletje(310, 570);
        bolletjesVeld[530][570] = new Bolletje(530, 570);
        
        //Rij 3
        bolletjesVeld[30][550] = new Bolletje(30, 550);
        bolletjesVeld[250][550] = new Bolletje(250, 550);
        bolletjesVeld[310][550] = new Bolletje(310, 550);
        bolletjesVeld[530][550] = new Bolletje(530, 550);
        
        //Rij 4
        for(int i = 30 ; i<590 ; i = i +20) {
            if(i == 30 + 7*20 || i == 30 + 8*20  || i == 30 + 13*20 || i == 30 + 14*20 || i == 30 + 19*20 || i == 30 + 20*20  ) { 
                continue;
            }
            bolletjesVeld[i][530] = new Bolletje(i, 530);
        } 
        
        //Rij 5
        bolletjesVeld[70][510] = new Bolletje(70, 510);
        bolletjesVeld[130][510] = new Bolletje(130, 510);
        bolletjesVeld[190][510] = new Bolletje(190, 510);
        bolletjesVeld[370][510] = new Bolletje(370, 510);
        bolletjesVeld[430][510] = new Bolletje(430, 510);
        bolletjesVeld[490][510] = new Bolletje(490, 510);
        
        //Rij 6
        bolletjesVeld[70][490] = new Bolletje(70, 490);
        bolletjesVeld[130][490] = new Bolletje(130, 490);
        bolletjesVeld[190][490] = new Bolletje(190, 490);
        bolletjesVeld[370][490] = new Bolletje(370, 490);
        bolletjesVeld[430][490] = new Bolletje(430, 490);
        bolletjesVeld[490][490] = new Bolletje(490, 490);   
        
        //Rij 7
        for(int i = 30 ; i<590 ; i = i +20) {
            if(i == 30 + 4*20 || i == 30 + 5*20  || i == 30 + 22*20 || i == 23 + 14*20) { 
                continue;
            }
            bolletjesVeld[i][470] = new Bolletje(i, 470);
        } 
        
        //Rij 8
        bolletjesVeld[30][450] = new Bolletje(30, 450);
        bolletjesVeld[130][450] = new Bolletje(130, 450);
        bolletjesVeld[250][450] = new Bolletje(250, 450);
        bolletjesVeld[310][450] = new Bolletje(310, 450);
        bolletjesVeld[430][450] = new Bolletje(430, 450);
        bolletjesVeld[530][450] = new Bolletje(530, 450);
        
        //Rij 9
        bolletjesVeld[30][430] = new Bolletje(30, 430);
        bolletjesVeld[130][430] = new Bolletje(130, 430);
        bolletjesVeld[250][430] = new Bolletje(250, 430);
        bolletjesVeld[310][430] = new Bolletje(310, 430);
        bolletjesVeld[430][430] = new Bolletje(430, 430);
        bolletjesVeld[530][430] = new Bolletje(530, 430);
        
        //Rij 10
        for(int i = 30 ; i<590 ; i = i +20) {
            if(i == 30 + 13*20 || i == 30 + 14*20) { 
                continue;
            }
            bolletjesVeld[i][410] = new Bolletje(i, 410);
        }
        
        //Rij 11
        bolletjesVeld[130][390] = new Bolletje(130, 390);
        bolletjesVeld[430][390] = new Bolletje(430, 390);
        
        //Rij 12
        bolletjesVeld[130][370] = new Bolletje(130, 370);
        bolletjesVeld[430][370] = new Bolletje(430, 370);
        
        //Rij 13
        bolletjesVeld[130][350] = new Bolletje(130, 350);
        bolletjesVeld[430][350] = new Bolletje(430, 350);
        
        //Rij 14
        bolletjesVeld[130][330] = new Bolletje(130, 330);
        bolletjesVeld[430][330] = new Bolletje(430, 330);
        
        //Rij 15
        bolletjesVeld[130][310] = new Bolletje(130, 310);
        bolletjesVeld[430][310] = new Bolletje(430, 310);
        
        //Rij 16
        bolletjesVeld[130][290] = new Bolletje(130, 290);
        bolletjesVeld[430][290] = new Bolletje(430, 290);
        
        //Rij 17
        bolletjesVeld[130][270] = new Bolletje(130, 270);
        bolletjesVeld[430][270] = new Bolletje(430, 270);
        
        //Rij 18
        bolletjesVeld[130][250] = new Bolletje(130, 250);
        bolletjesVeld[430][250] = new Bolletje(430, 250);
        
        //Rij 19
        bolletjesVeld[130][230] = new Bolletje(130, 230);
        bolletjesVeld[430][230] = new Bolletje(430, 230);
        
        //Rij 20
        bolletjesVeld[130][210] = new Bolletje(130, 210);
        bolletjesVeld[430][210] = new Bolletje(430, 210);
        
        //Rij 21
        bolletjesVeld[130][190] = new Bolletje(130, 190);
        bolletjesVeld[430][190] = new Bolletje(430, 190);
        
        //Rij 22
        for(int i = 30 ; i<590 ; i = i +20) {
            if(i == 30 + 7*20 || i == 30 + 8*20  || i == 30 + 13*20 || i == 30 + 14*20 || i == 30 + 19*20 || i == 30 + 20*20  ) { 
                continue;
            }
            bolletjesVeld[i][170] = new Bolletje(i, 170);
        } 
        
        //Rij 23
        bolletjesVeld[30][150] = new Bolletje(30, 150);
        bolletjesVeld[130][150] = new Bolletje(130, 150);
        bolletjesVeld[190][150] = new Bolletje(190, 150);
        bolletjesVeld[370][150] = new Bolletje(370, 150);
        bolletjesVeld[430][150] = new Bolletje(430, 150);
        bolletjesVeld[530][150] = new Bolletje(530, 150);
        
        //Rij 24
        bolletjesVeld[30][130] = new Bolletje(30, 130);
        bolletjesVeld[130][130] = new Bolletje(130, 130);
        bolletjesVeld[190][130] = new Bolletje(190, 130);
        bolletjesVeld[370][130] = new Bolletje(370, 130);
        bolletjesVeld[430][130] = new Bolletje(430, 130);
        bolletjesVeld[530][130] = new Bolletje(530, 130);
        
        //Rij 25
        for(int i = 30 ; i<590 ; i = i +20) {
            bolletjesVeld[i][110] = new Bolletje(i, 110);
        }
        
        //Rij 26
        bolletjesVeld[30][90] = new Bolletje(30, 90);
        bolletjesVeld[130][90] = new Bolletje(130, 90);
        bolletjesVeld[250][90] = new Bolletje(250, 90);
        bolletjesVeld[310][90] = new Bolletje(310, 90);
        bolletjesVeld[430][90] = new Bolletje(430, 90);
        bolletjesVeld[530][90] = new Bolletje(530, 90);
        
        //Rij 27
        bolletjesVeld[30][70] = new Bolletje(30, 70);
        bolletjesVeld[130][70] = new Bolletje(130, 70);
        bolletjesVeld[250][70] = new Bolletje(250, 70);
        bolletjesVeld[310][70] = new Bolletje(310, 70);
        bolletjesVeld[430][70] = new Bolletje(430, 70);
        bolletjesVeld[530][70] = new Bolletje(530, 70);
        
        //Rij 27
        bolletjesVeld[30][50] = new Bolletje(30, 50);
        bolletjesVeld[130][50] = new Bolletje(130, 50);
        bolletjesVeld[250][50] = new Bolletje(250, 50);
        bolletjesVeld[310][50] = new Bolletje(310, 50);
        bolletjesVeld[430][50] = new Bolletje(430, 50);
        bolletjesVeld[530][50] = new Bolletje(530, 50);
        
        //Rij 28
        for(int i = 30 ; i<590 ; i = i +20) {
            if(i == 30 + 13*20 || i == 30 + 14*20) { 
                continue;
            }
            bolletjesVeld[i][30] = new Bolletje(i, 30);
        }
        
        //SPEC BOLLETJES TOEVOEGEN OP SPECIFIEKE PUNTEN 
    }
    
    
}
