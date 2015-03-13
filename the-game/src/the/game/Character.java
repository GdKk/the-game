/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the.game;

import java.awt.*;
import javax.swing.*;


/**
 *
 * @author george
 */
public class Character extends JPanel{
    public Rectangle character;
    public   int h=24;
    public  int w=24;
    
    
    public Character(){
   character = new Rectangle(180,180,h,w);
    }
    
public void paintComponent(Graphics g){
super.paintComponent(g);
g.setColor(Color.red);
g.fillRect(character.x, character.y, w,h);

}

}



