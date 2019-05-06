/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manydice;
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
        super(x + 70,y + 100, size, "/images/d12.png");
    }   
     super(animate);

}