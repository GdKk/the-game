/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the.game;

import the.game.Images;
import the.game.Keying;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author george
 */
public class Display extends JFrame{

    public JPanel gp= (JPanel) getGlassPane();
    public Images i;
    public Keying k;
    
    
    public Display(){
    
    i=new Images();
    gp.setVisible(true);
    k= new Keying(this,i);
    
    gp.setLayout(new GridLayout(1, 1, 0, 0));
    this.setLayout(new GridLayout(1, 1, 0, 0));
    
    gp.add(k);
    
    this.add(i);
    
    
    
    
    
    
    
    }
    
}
