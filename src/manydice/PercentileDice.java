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
import static manydice.Window.percentileisrolling;
/**
 *
 * @author 802709
 */
public class PercentileDice extends Dice {
    
    public PercentileDice(){
        super();
    }
    public PercentileDice (int x, int y , int size, String imgSrc) {
        super(x+20,y+ 200, size, "/images/percentile.png",4);
    }   
     public PercentileDice(ImageIcon ii, Image img, String imgSrc){
        String animation;
        if (percentileisrolling == true){
        animation = "/images/percentileanimated.gif";
        animate(ii, img, animation,g);
        }
        else if (percentileisrolling == false){
         animation = "/images/percentile.png";  
         animate(ii, img, animation,g);
        }
    }

  Graphics g;
}

