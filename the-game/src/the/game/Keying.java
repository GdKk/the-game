/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the.game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


/**
 *
 * @author george
 */
public class Keying extends JPanel{
    
public Rectangle character;
    public   int h=24;
    public  int w=24;
    public boolean right=false;
    public boolean left=false;
    public Keying(Display f, Images i){
    
    
  character = new Rectangle(180,180,h,w);
  
 
  
  
  f.addKeyListener(new KeyAdapter(){
  
  public void keyPressed(KeyEvent e){
        if(e.getKeyCode() == KeyEvent.VK_D){
                
                right=true;
                
            }
        if(e.getKeyCode() == KeyEvent.VK_A){
                
                left=true;
                
            }
   
        }
    public void keyReleased (KeyEvent e){
       
        if(e.getKeyCode()==KeyEvent.VK_D){
            right=false;
        }
        
        if(e.getKeyCode()==KeyEvent.VK_A){
            left=false;
        }
    
    } 
  });
    }

  
   public void paintComponent(Graphics g){
    
 
 
    super.paintComponent(g);
    this.setBackground(Color.BLACK);
    g.setColor(Color.WHITE);
    g.fillRect(character.x, character.y, character.width, character.height);
    
        if(right){
            character.x +=1;
        
        }
        if(left){
            character.x -=1;
        
       }
     repaint();
    }
     
}
    
    
   
    
    

