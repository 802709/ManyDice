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
import static manydice.Window.d10isrolling;
/**
 *
 * @author 802709
 */
public class D10 extends Dice {
    
    public D10(){
        super();
    }
    public D10 (int x, int y , int size, String imgSrc) {
        super(x + 150,y, size, "/images/d10.png",4);
    }  
      public D10(ImageIcon ii, Image img, String imgSrc){
          String animation;
        
        if (d10isrolling == true){
            animation = "/images/d10animated.gif";
        animate(ii, img, animation,g);
        }
        else if (d10isrolling == false){
         animation = "/images/d10.png";  
         animate(ii, img, animation,g);
        }
    }
  Graphics g;

}
