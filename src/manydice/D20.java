/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manydice;
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
        super(x+250,y+120, size, "/images/d20.png");
    } 
     super(animate);

}