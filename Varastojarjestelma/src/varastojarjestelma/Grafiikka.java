/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package varastojarjestelma;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
/**
 *
 *
 */
class Grafiikka extends JFrame {
    //luodaan paneeli-olio
    private JPanel Paneeli;

    private int tool = 1;
    int currentX, currentY, oldX, oldY;

    public Grafiikka() {
        initComponents();
    }

    private void initComponents() {
        // we want a custom Panel2, not a generic JPanel!
        Paneeli = new Paneeli();

        Paneeli.setBackground(new java.awt.Color(255, 255, 255));
        Paneeli.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        Paneeli.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
            public void mouseReleased(MouseEvent evt) {
                jPanel2MouseReleased(evt);
            }
        });
        Paneeli.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });

        // add the component to the frame to see it!
        this.setContentPane(Paneeli);
        // be nice to testers..
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
    }// </editor-fold>

    private void jPanel2MouseDragged(MouseEvent evt) {
        if (tool == 1) {
            currentX = evt.getX();
            currentY = evt.getY();
            oldX = currentX;
            oldY = currentY;
            System.out.println(currentX + " " + currentY);
            System.out.println("PEN!!!!");
        }
    }

    private void jPanel2MousePressed(MouseEvent evt) {
        oldX = evt.getX();
        oldY = evt.getY();
        System.out.println(oldX + " " + oldY);
    }


    //mouse released//
    private void jPanel2MouseReleased(MouseEvent evt) {
        if (tool == 2) {
            currentX = evt.getX();
            currentY = evt.getY();
            System.out.println("line!!!! from" + oldX + "to" + currentX);
        }
    }

    //main + laita näkyväksi
    
    /*
    public static void main(String args[]) {
        EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new Grafiikka().setVisible(true);
            }
        });
    }
    */
    public void asetaNakyvyys(){
        //noni
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Grafiikka().setVisible(true);
            }
        });
    }
    
    //get paneeli
    public JPanel getPaneeli(){
        return this.Paneeli;
    }
    
    
    
    
    public static void main(String[] args){
    }
    
}