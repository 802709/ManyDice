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
import static manydice.Window.d12isrolling;
/**
 *
 * @author 802709
 */
public class D12 extends Dice {
    
    public D12(){
        super();
    }
    public D12 (int x, int y , int size, String imgSrc) {
        super(x + 70,y + 100, size, "/images/d12.png",6);
    }   
     public D12(ImageIcon ii, Image img, String imgSrc){
        String animation;
        if (d12isrolling == true){
            animation = "/images/d12animated.gif";
        animate(ii, img, animation,g);
        }
        else if (d12isrolling == false){
         animation = "/images/d12.png";  
         animate(ii, img, animation,g);
        }
    }
  Graphics g;

}