/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manydice;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import static manydice.Window.d8isrolling;
/**
 *
 * @author 802709
 */
public class D8 extends Dice {
    
    public D8(){
        super();
    }
    public D8 (int x, int y , int size, String imgSrc) {
        super(x + 100,y, size, "/images/d8.png",8);
    }   
    public D8(ImageIcon ii, Image img, String imgSrc){
        String animation;
        if (d8isrolling == true){
            animation = "/images/d6animated.gif";
        animate(ii, img, animation,g);
        }
        else if (d8isrolling == false){
         animation = "/images/d8.png";  
         animate(ii, img, animation,g);
        }
    }
  Graphics g;

}

