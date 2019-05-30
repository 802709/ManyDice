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
import static manydice.Window.d20isrolling;
/**
 *
 * @author 802709
 */
public class D20 extends Dice {
    
    public D20(){
        super();
    }
    public D20 (int x, int y , int size, String imgSrc) {
        super(x+250,y+120, size, "/images/d20.png",8);
    } 
     public D20(ImageIcon ii, Image img, String imgSrc){
        String animation;
        if (d20isrolling == true){
            animation = "/images/d20animated.gif";
        animate(ii, img, animation,g);
        }
        else if (d20isrolling == false){
         animation = "/images/d20.png";  
         animate(ii, img, animation,g);
        }
    }
  Graphics g;
}