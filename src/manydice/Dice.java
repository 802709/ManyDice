/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manydice;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author 802709
 */
public class Dice {
     private static int numsides;
     public static int numrolled;
    // private static int[] possnums;
     private int size;
     public static  ImageIcon ii;
     public static Image img;
     private static int x;
     private static int y;
     
    
    public Dice(){
        
        numsides = 0;
        //int[] possnums = new int[99];
        size = 50;
//        ImageIcon ii;
//        Image img;
         x = 20 ;
        y = 30;
        
    }
    
    //Constructor
    public Dice(int x, int y, int size, String imgSrc) {
        this.numsides = numsides;
        this.size = 50;
        this.ii = new ImageIcon(getClass().getResource(imgSrc));
        this.img = ii.getImage();
        this.x = x;
        this.y = y;
    }
     public void draw(Graphics g){
         g.drawImage(img,x,y, size, size, null);
    }
     
     
     
     
      //public static void roll(int numsides){
         public static int roll(int numsides){
             //public static int roll(int numsides, int numrolled){
         double rand = 0;
         double divratio = 10 / numsides;
         
         double randGen = Math.random() * 10;
         rand = randGen;
         int dieroll;
        for (int i = 0; i < 1; i++){
             if (rand > divratio || rand < (divratio + divratio) ){
                 numrolled = (int) rand +1;
             }
            randGen = 0;
            rand = 0;
        }
         return numrolled;
     }
   
         public static void animate(ImageIcon ii, Image img, String imgSrc){
             while(numrolled != 0){
               
        img = ii.getImage();
        ii = Dice.ii;
        
         imgSrc = "" + (imgSrc);
                 //imgSrc = "/images/d6animated";
        //Dice.img = ii.new ;
             }
         }
    
     public void rollD6(){
        
         double divratio = 1.66667;
         double rand = Math.random() * 6;
         if(rand < 0 || rand > 1.666667){
            numrolled = 1;
         }
         else if( rand > 1.6667 || rand < 3.33334 ){
            numrolled = 2; 
         }
         else if(rand > 9999 || rand < 9999){
              numrolled = 3;
         }
         else if(rand > 1.8 || rand < 2.4 ){
              numrolled = 4;
         }
         else if(rand > 2.4 || rand < 3.0 ){
              numrolled = 5;
         }
         else if(rand > 3.0 || rand < 6 ){
              numrolled = 6;
         }
     }
   
}
