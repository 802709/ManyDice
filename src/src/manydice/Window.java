/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manydice;


import java.awt.Graphics;
import java.awt.Panel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageProducer;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import static manydice.Dice.animate;
//import static manydice.Dice.frames;
import static manydice.Dice.ii;
import static manydice.Dice.img;
import static manydice.Dice.numrolled;
import static manydice.Dice.roll;
import static manydice.Dice.numGenerator;
//import static manydice.Dice.pan;

/**
 *
 * @author 802709
 */
public class Window extends javax.swing.JFrame {

    //private static int numrolled;
//    private static int numsides;
    private static int ticks;
    
    public static boolean d4isrolling;
    public static boolean d6isrolling;
    public static boolean d8isrolling;
    public static boolean d10isrolling;
    public static boolean percentileisrolling;
    public static boolean d12isrolling;
    public static boolean d20isrolling;

    
    private static D4 d4;
    private static D6 d6;
    private static D8 d8;
    private static D10 d10;
    private static PercentileDice p;
    private static D12 d12;
    private static D20 d20;
    
    /**
     *
     */
    public static Graphics g;

    
    /**
     * Creates new form Window
     */
    public Window() {
        initComponents();
        d4isrolling = false;
        d6isrolling = false;
        d8isrolling = false;
        d10isrolling = false;
        percentileisrolling = false;
        d12isrolling = false;
        d20isrolling = false;
//        p4.createImage(55, 55);
//        p4.printAll(g);
//        p4.imageUpdate(D4.img, Numsides?, x, y, WIDTH, HEIGHT);

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        d4Box = new javax.swing.JButton();
        d6Box = new javax.swing.JButton();
        d8Box = new javax.swing.JButton();
        d10Box = new javax.swing.JButton();
        pBox = new javax.swing.JButton();
        d12Box = new javax.swing.JButton();
        d20Box = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        outputBox = new javax.swing.JTextArea();
        pp = new java.awt.Panel();
        p4 = new java.awt.Panel();
        p6 = new java.awt.Panel();
        p8 = new java.awt.Panel();
        p10 = new java.awt.Panel();
        p12 = new java.awt.Panel();
        p20 = new java.awt.Panel();

        jButton5.setText("jButton5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Roll!");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                formComponentAdded(evt);
            }
        });
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        d4Box.setText("Roll D4");
        d4Box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d4BoxActionPerformed(evt);
            }
        });

        d6Box.setText("Roll D6");
        d6Box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d6BoxActionPerformed(evt);
            }
        });

        d8Box.setText("Roll D8");
        d8Box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d8BoxActionPerformed(evt);
            }
        });

        d10Box.setText("Roll D10");
        d10Box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d10BoxActionPerformed(evt);
            }
        });

        pBox.setText("Roll Percentile");
        pBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pBoxActionPerformed(evt);
            }
        });

        d12Box.setText("Roll D12");
        d12Box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d12BoxActionPerformed(evt);
            }
        });

        d20Box.setText("Roll D20");
        d20Box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d20BoxActionPerformed(evt);
            }
        });

        outputBox.setEditable(false);
        outputBox.setBackground(new java.awt.Color(255, 255, 204));
        outputBox.setColumns(20);
        outputBox.setFont(new java.awt.Font("Maiandra GD", 0, 48)); // NOI18N
        outputBox.setRows(1);
        outputBox.setTabSize(4);
        outputBox.setAlignmentX(1.5F);
        outputBox.setBorder(null);
        jScrollPane1.setViewportView(outputBox);

        javax.swing.GroupLayout ppLayout = new javax.swing.GroupLayout(pp);
        pp.setLayout(ppLayout);
        ppLayout.setHorizontalGroup(
            ppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ppLayout.setVerticalGroup(
            ppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout p4Layout = new javax.swing.GroupLayout(p4);
        p4.setLayout(p4Layout);
        p4Layout.setHorizontalGroup(
            p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        p4Layout.setVerticalGroup(
            p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout p6Layout = new javax.swing.GroupLayout(p6);
        p6.setLayout(p6Layout);
        p6Layout.setHorizontalGroup(
            p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        p6Layout.setVerticalGroup(
            p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout p8Layout = new javax.swing.GroupLayout(p8);
        p8.setLayout(p8Layout);
        p8Layout.setHorizontalGroup(
            p8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        p8Layout.setVerticalGroup(
            p8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout p10Layout = new javax.swing.GroupLayout(p10);
        p10.setLayout(p10Layout);
        p10Layout.setHorizontalGroup(
            p10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 71, Short.MAX_VALUE)
        );
        p10Layout.setVerticalGroup(
            p10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 68, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout p12Layout = new javax.swing.GroupLayout(p12);
        p12.setLayout(p12Layout);
        p12Layout.setHorizontalGroup(
            p12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 71, Short.MAX_VALUE)
        );
        p12Layout.setVerticalGroup(
            p12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout p20Layout = new javax.swing.GroupLayout(p20);
        p20.setLayout(p20Layout);
        p20Layout.setHorizontalGroup(
            p20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 71, Short.MAX_VALUE)
        );
        p20Layout.setVerticalGroup(
            p20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(p4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(d4Box, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(d6Box)
                                    .addComponent(p6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(p8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(d8Box, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(d10Box)
                                    .addComponent(p10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(76, 76, 76))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(107, 107, 107)
                                .addComponent(p20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(119, 119, 119)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(90, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(p12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(pBox)
                                .addGap(18, 18, 18)
                                .addComponent(d12Box)))
                        .addGap(18, 18, 18)
                        .addComponent(d20Box)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(49, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(p8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(p10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(p6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(p4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(d4Box)
                            .addComponent(d6Box)
                            .addComponent(d8Box)
                            .addComponent(d10Box))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pBox)
                            .addComponent(d12Box))
                        .addGap(43, 43, 43))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(d20Box)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void d4BoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d4BoxActionPerformed
         int numsides = 4;
         double generatedNum = 0;
        generatedNum = numGenerator(numsides);
            numrolled = roll(numsides, generatedNum);
            outputBox.setText("" + numrolled);
            panDraw(p4,d4Box,"/images/d4animated.gif", D4.frames);
            animate(D4.ii, D4.img, "/images/d4animated.gif",g );
            d4isrolling = true;       
    }//GEN-LAST:event_d4BoxActionPerformed

    private void d6BoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d6BoxActionPerformed
            int numsides = 6;
            double generatedNum = 0;
        generatedNum = numGenerator(numsides);
            numrolled = roll(numsides, generatedNum);
            outputBox.setText("" + numrolled);
            panDraw(p6,d6Box,"/images/d6animated.gif",D6.frames);
            animate(D6.ii, D6.img, "/images/d6animated.gif",g );
            d6isrolling = true;
    }//GEN-LAST:event_d6BoxActionPerformed

    private void d8BoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d8BoxActionPerformed
       int numsides = 8;
       double generatedNum = 0;
        generatedNum = numGenerator(numsides);
           numrolled = roll(numsides, generatedNum);
            outputBox.setText("" + numrolled);
            panDraw(p8,d8Box,"/images/d8animated.gif",D8.frames);
            animate(D8.ii, D8.img, "/images/d8animated.gif",g );
            d8isrolling = true;
    }//GEN-LAST:event_d8BoxActionPerformed

    private void d10BoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d10BoxActionPerformed
         int numsides = 10;
         double generatedNum = 0;
        generatedNum = numGenerator(numsides);
           numrolled = roll(numsides, generatedNum);
            outputBox.setText("" + numrolled);
            panDraw(p10,d10Box,"/images/d10animated.gif",D10.frames);
            animate(D10.ii, D10.img, "/images/d10animated.gif",g );
            d10isrolling = true;
    }//GEN-LAST:event_d10BoxActionPerformed

    private void pBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pBoxActionPerformed
         int numsides = 100;
         double generatedNum = 0;
        generatedNum = numGenerator(numsides);
            numrolled = roll(numsides, generatedNum);
            outputBox.setText("" + numrolled);
            panDraw(pp,pBox,"/images/d4animated.gif",PercentileDice.frames);
            animate(PercentileDice.ii, PercentileDice.img, "/images/percentileanimated.gif",g);
            percentileisrolling = true;
    }//GEN-LAST:event_pBoxActionPerformed

    private void d12BoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d12BoxActionPerformed
       int  numsides = 12;
       double generatedNum = 0;
        generatedNum = numGenerator(numsides);
           numrolled = roll(numsides, generatedNum);
            outputBox.setText("" + numrolled);
            panDraw(p12,d12Box,"/images/d12animated.gif",D12.frames);
            animate(D12.ii, D12.img, "/images/d12animated.gif",g );
            d12isrolling = true;
    }//GEN-LAST:event_d12BoxActionPerformed

    private void d20BoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d20BoxActionPerformed
        int numsides = 20;
        double generatedNum = 0;
        generatedNum = numGenerator(numsides);
           numrolled = roll(numsides, generatedNum);
            outputBox.setText("" + numrolled);
            panDraw(p20,d20Box,"/images/d20animated.gif", D20.frames);
            animate(D20.ii, D20.img, "/images/d20animated.gif",g );
            d20isrolling = true;
    }//GEN-LAST:event_d20BoxActionPerformed

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentHidden

    private void formComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_formComponentAdded
//                d4.draw(g);
//                d6.draw(g);
//                d8.draw(g);
//                d10.draw(g);
//                p.draw(g);
//                d12.draw(g);
//                d20.draw(g);
    }//GEN-LAST:event_formComponentAdded

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
//         d4.draw(g);
//                d6.draw(g);
//                d8.draw(g);
//                d10.draw(g);
//                p.draw(g);
//                d12.draw(g);
//                d20.draw(g);
    }//GEN-LAST:event_formComponentShown

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
//        JFrame j = new JFrame("DICE");
//        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Window().setVisible(true);
                ticks = 1;
//                drawD4(g);
//                drawD6(g);
//                drawD8(g);
//                drawD10(g);
//                drawPercentile(g);
//                drawD12(g);
//                drawD20(g);
                
                d4.draw(g);
                d6.draw(g);
                d8.draw(g);
                d10.draw(g);
                p.draw(g);
                d12.draw(g);
                d20.draw(g);
                
                
                while (ticks >= 0 ){
                ticks++;
                if (ticks == 1000){
                   d4isrolling = false;
                   d6isrolling = false;
                   d8isrolling = false;
                   d10isrolling = false;
                   percentileisrolling = false;
                   d12isrolling = false;
                   d20isrolling = false;
                       ticks = 0;
                }
                }
                
                 if (d4isrolling == true){
                 animate(D4.ii, D4.img, "/images/d4animated.gif",g );
                }
                if (d4isrolling == false){
                 animate(D4.ii, D4.img, "/images/d4.png",g );
                }
                 if (d6isrolling == true){
                 animate(D6.ii, D6.img, "/images/d6animated.gif",g );
                }
                if (d6isrolling == false){
                 animate(D6.ii, D6.img, "/images/d6.png",g);
                }
                 if (d8isrolling == true){
                 animate(D8.ii, D8.img, "/images/d8animated.gif",g );
                }
                if (d8isrolling == false){
                 animate(D8.ii, D8.img, "/images/d8.png",g );
                }
                 if (d10isrolling == true){
                 animate(D10.ii, D10.img, "/images/d10animated.gif",g );
                }
                if (d10isrolling == false){
                 animate(D10.ii, D10.img, "/images/d10.png",g );
                }
                 if (percentileisrolling == true){
                 animate(PercentileDice.ii, PercentileDice.img, "/images/percentileanimated.gif",g );
                }
                if (percentileisrolling ==false){
                 animate(PercentileDice.ii, PercentileDice.img, "/images/percentile.png",g );
                }
                 if (d12isrolling == true){
                 animate(D12.ii, D12.img, "/images/d12animated.gif",g );
                }
                if (d12isrolling == false){
                 animate(D12.ii, D12.img, "/images/d12.png",g );
                }
                 if (d20isrolling == true){
                 animate(D20.ii, D20.img, "/images/d20animated.gif",g );
                }
                 if (d20isrolling == false){
                 animate(D20.ii, D20.img, "/images/d20.png",g );
                }
            }
        });
    }
    
   
//    public static void drawD4(Graphics g){
//         g.drawImage(D4.img,50,50, 55,55, null);
//    }
//    public static void drawD6(Graphics g){
//         g.drawImage(D6.img,50,50, 55,55, null);
//    }
//    public static void drawD8(Graphics g){
//         g.drawImage(D8.img,50,50, 55,55, null);
//    }
//    public static void drawD10(Graphics g){
//         g.drawImage(D10.img,50,50, 55,55, null);
//    }
//    public static void drawPercentile(Graphics g){
//         g.drawImage(PercentileDice.img,50,50, 55,55, null);
//    }
//    public static void drawD12(Graphics g){
//         g.drawImage(D12.img,50,50, 55,55, null);
//    }
//    public static void drawD20(Graphics g){
//         g.drawImage(D20.img,50,50, 55,55, null);
//    }
    
    
     /**
     *
     * @param fr
     * @param b
     * @param imgSrc
     * @param frames
     */
 public void panDraw(Panel p, JButton b, String imgSrc, int frames){
         ii = new ImageIcon(getClass().getResource(imgSrc));
         //b.setIcon(ii);
         ii.setImageObserver(b);
         boolean vis = p.isVisible();
         vis = true;
         p.setVisible(vis);
         boolean prep = p.prepareImage(img, b);
         prep = true;
         ImageProducer pro = null;
         ImageConsumer ic = null;
         ic.imageComplete(frames);
         pro.addConsumer(ic);
         pro.startProduction(ic);
         p.createImage(pro);
     }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton d10Box;
    private javax.swing.JButton d12Box;
    private javax.swing.JButton d20Box;
    private javax.swing.JButton d4Box;
    private javax.swing.JButton d6Box;
    private javax.swing.JButton d8Box;
    private javax.swing.JInternalFrame ftest1;
    private javax.swing.JInternalFrame ftest2;
    private javax.swing.JInternalFrame ftest3;
    private javax.swing.JInternalFrame ftest4;
    private javax.swing.JButton jButton5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea outputBox;
    private java.awt.Panel p10;
    private java.awt.Panel p12;
    private java.awt.Panel p20;
    private java.awt.Panel p4;
    private java.awt.Panel p6;
    private java.awt.Panel p8;
    private javax.swing.JButton pBox;
    private java.awt.Panel pp;
    // End of variables declaration//GEN-END:variables

   
}
