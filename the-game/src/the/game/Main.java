/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the.game;

import java.awt.Color;
import javax.swing.JFrame;



/**
 *
 * @author george
 */
public class Main  {
    
    public static Display f= new Display();
    public static int w=600;
    public static int h=600;
    
    public static void main (String arg[]){
    f.setSize(w,h);
    f.setResizable(true);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setTitle("GgKk game");
    f.setLocationRelativeTo(null);
    
    }
}
