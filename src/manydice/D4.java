/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manydice;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import static manydice.Dice.animate;
import static manydice.Window.d4isrolling;
/**
 *
 * @author 802709
 */
public class D4 extends Dice {
    
    public D4(){
        super();
    }
    public D4 (int x, int y , int size, String imgSrc) {
        super(x,y, size, "/images/d4.png",13);
    } 
      public D4(ImageIcon ii, Image img, String imgSrc){
          String animation;
        
        if (d4isrolling == true){
            animation = "/images/d4animated.gif";
        animate(ii, img, animation,g);
        }
        else if (d4isrolling == false){
         animation = "/images/d4.png";  
         animate(ii, img, animation,g);
        }
    }
      Graphics g;


}