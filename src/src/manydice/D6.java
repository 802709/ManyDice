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
import static manydice.Window.d6isrolling;
/**
 *
 * @author 802709
 */

    public class D6 extends Dice {
    
    public D6(){
        super();
    }
    public D6 (int x, int y , int size, String imgSrc) {
        super(x + 40,y, size, "/images/d6.png",16);
    }   
    public D6(ImageIcon ii, Image img, String imgSrc){
        String animation;
        if (d6isrolling == true){
             animation = "/images/d6animated.gif";
        animate(ii, img, animation,g);
        }
        else if (d6isrolling == false){
         animation = "/images/d6.png";  
         animate(ii, img, animation,g);
        }
    }
  Graphics g;
    
}
