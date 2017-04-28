/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package varastojarjestelma;

import java.awt.*;
import javax.swing.*;

/**
 *
 *
 */
public class Paneeli extends JPanel {
    
    String testiTeksti = "halo";

    public Paneeli() {
            // set a preferred size for the custom panel.
            setPreferredSize(new Dimension(1280,720));
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawString(testiTeksti, 20, 20);
        g.drawRect(2, 2, 1274, 714);
    }
    
    
    public void asetaTeksti(){
        //g.drawString("ayy lmaooooo", 40, 40);
    }
    
}