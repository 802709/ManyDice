/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manydice;
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
        super(x + 40,y, size, "/images/d6.png");
    }   
 super(animate);

    
}
