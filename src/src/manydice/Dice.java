/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manydice;

import java.awt.Button;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageProducer;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author 802709
 */
public abstract class Dice {
     private static int numsides;
     public static int numrolled;
    // private static int[] possnums;
     private static int size;
     public static ImageIcon ii;
     public static Image img;
     private static int x;
     private static int y;
     public static int frames;
     
    
    public Dice(){
        
        numsides = 10;
        //int[] possnums = new int[99];
        size = 55;
//        ImageIcon ii;
//        Image img;
        x = 20;
        y = 30;
        
    }
    
    //Constructor
    public Dice(int x, int y, int size, String imgSrc, int frames) {
        this.numsides = numsides;
        this.size = 55;
        this.ii = new ImageIcon(getClass().getResource(imgSrc));
        this.img = ii.getImage();
        this.x = x;
        this.y = y;
        this.frames = frames;
    }
     public void draw(Graphics g){
         g.drawImage(img,x,y, size, size, null);
    }
     
      /**
     *
     * @param ii
     * @param img
     * @param imgSrc
     */
    //public static String animate(ImageIcon ii, Image img, String imgSrc){
      public static void animate(ImageIcon ii, Image img, String imgSrc, Graphics g){   
        //img = ii.getImage();
        //ii = Dice.ii;
        Image oof = null;
        ii.setImage(img);
        oof.equals(img);
        imgSrc = "" + (imgSrc);
        g.drawImage(img,x,y, size, size, null);
       
 
           //    pan(p4,dice4, 4,55,55,55,g);
           //img.getGraphics();
         }

     public void pan(Panel pan,JButton b, String imgSrc, int frames){
         ii = new ImageIcon(getClass().getResource(imgSrc));
         //b.setIcon(ii);
         ii.setImageObserver(b);
         boolean vis = pan.isVisible();
         vis = true;
         pan.setVisible(vis);
         boolean prep = pan.prepareImage(img, b);
         prep = true;
         ImageProducer pro = null;
         ImageConsumer ic = null;
         ic.imageComplete(frames);
         pro.addConsumer(ic);
         pro.startProduction(ic);
         pan.createImage(pro);
     }
     
     
     
     
     public static double numGenerator(int numsides){
         double generatedNum = 0;
         generatedNum = Math.random() * numsides;
         return generatedNum;
     }
     
     
      //public static void roll(int numsides){
         public static int roll(int numsides, double generatedNum){
             //public static int roll(int numsides, int numrolled){
         double divratio = 10 / numsides;
         
         //double randGen = Math.random() * numsides;
         int dieroll;
             if (generatedNum > divratio || generatedNum < (divratio + (divratio*1)) ){
                 numrolled = (int) generatedNum +1;
             }
             else if (generatedNum > (divratio*1)|| generatedNum < (divratio + (divratio*2)) ){
                 numrolled = (int) generatedNum +2;
             }
             else if (generatedNum > (divratio*2) || generatedNum < (divratio + (divratio*3)) ){
                 numrolled = (int) generatedNum +3;
             }
             else if (generatedNum > (divratio*3) || generatedNum < (divratio + (divratio*4)) ){
                 numrolled = (int) generatedNum +4;
             }
             else if (generatedNum > (divratio*4) || generatedNum < (divratio + (divratio*5)) ){
                 numrolled = (int) generatedNum +5;
             }
             else if (generatedNum > (divratio*5) || generatedNum < (divratio + (divratio*6)) ){
                 numrolled = (int) generatedNum +6;
             }
             else if (generatedNum > (divratio*6) || generatedNum < (divratio + (divratio*7)) ){
                 numrolled = (int) generatedNum +7;
             }
             else if (generatedNum > (divratio*7) || generatedNum < (divratio + (divratio*8)) ){
                 numrolled = (int) generatedNum +8;
             }
             else if (generatedNum > (divratio*8) || generatedNum < (divratio + (divratio*9)) ){
                 numrolled = (int) generatedNum +9;
             }
             else if (generatedNum > (divratio*9) || generatedNum < (divratio + (divratio*10)) ){
                 numrolled = (int) generatedNum +10;
             }
             else if (generatedNum > (divratio*10) || generatedNum < (divratio + (divratio*11)) ){
                 numrolled = (int) generatedNum +11;
             }
             else if (generatedNum > (divratio*11) || generatedNum < (divratio + (divratio*12)) ){
                 numrolled = (int) generatedNum +12;
             }
             else if (generatedNum > (divratio*12) || generatedNum < (divratio + (divratio*13)) ){
                 numrolled = (int) generatedNum +13;
             }
             else if (generatedNum > (divratio*13) || generatedNum < (divratio + (divratio*14)) ){
                 numrolled = (int) generatedNum +14;
             }
             else if (generatedNum > (divratio*14) || generatedNum < (divratio + (divratio*15)) ){
                 numrolled = (int) generatedNum +15;
             }
             else if (generatedNum > (divratio*15) || generatedNum < (divratio + (divratio*16)) ){
                 numrolled = (int) generatedNum +16;
             }
             else if (generatedNum > (divratio*16) || generatedNum < (divratio + (divratio*17)) ){
                 numrolled = (int) generatedNum +17;
             }
             else if (generatedNum > (divratio*17) || generatedNum < (divratio + (divratio*18)) ){
                 numrolled = (int) generatedNum +18;
             }
             else if (generatedNum > (divratio*18) || generatedNum < (divratio + (divratio*19)) ){
                 numrolled = (int) generatedNum +19;
             }
             else if (generatedNum > (divratio*19) || generatedNum < (divratio + (divratio*20)) ){
                 numrolled = (int) generatedNum +20;
             }
          
            //generatedNum = 0;
        
         return numrolled;
     }
   
   
    
//     public void rollD6(){
//        
//         double divratio = 1.66667;
//         double generatedNum = Math.random() * 6;
//         if(rand < 0 || rand > 1.666667){
//            numrolled = 1;
//         }
//         else if( rand > 1.6667 || rand < 3.33334 ){
//            numrolled = 2; 
//         }
//         else if(rand > 9999 || rand < 9999){
//              numrolled = 3;
//         }
//         else if(rand > 1.8 || rand < 2.4 ){
//              numrolled = 4;
//         }
//         else if(rand > 2.4 || rand < 3.0 ){
//              numrolled = 5;
//         }
//         else if(rand > 3.0 || rand < 6 ){
//              numrolled = 6;
//         }
//     }
   
}
