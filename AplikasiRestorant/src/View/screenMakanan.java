/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Controller;
import Model.Order;
import View.Screen;
import View.screenOrderMakanan;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author A442UF
 */
public class screenMakanan {
    public screenMakanan() throws IOException{
        JFrame frame = new JFrame("Menu Restorant");
        frame.setSize(500, 700);
        frame.setLocationRelativeTo(null);
        
        JLabel label;
        label = new JLabel("Menu Makanan");
        label.setBounds(200, 50, 300, 30);
        frame.add(label);
//      Kimbab        
        JLabel kimbab;
        kimbab = new JLabel("Kimbap");
        kimbab.setBounds(50, 100, 100, 30);
        frame.add(kimbab);
        JTextField pesananKimbab;
        pesananKimbab = new JTextField();
        pesananKimbab.setBounds(100, 105, 50, 20);
        frame.add(pesananKimbab);
        JButton kimbabImage;
        kimbabImage = new JButton(new ImageIcon(resizeImage("image/kimbap.jpg")));
        kimbabImage.setBounds(50, 130, 150, 62);
        frame.add(kimbabImage);
//      Tteobokki
        JLabel tteoboki;
        tteoboki = new JLabel("Tteokbokki");
        tteoboki.setBounds(50, 200, 100, 30);
        frame.add(tteoboki);
        JTextField pesananTteoboki;
        pesananTteoboki = new JTextField();
        pesananTteoboki.setBounds(120, 205, 50, 20);
        frame.add(pesananTteoboki);
        JButton tteobokiImage;
        tteobokiImage = new JButton(new ImageIcon(resizeImage("image/tteokbokki.jpg")));
        tteobokiImage.setBounds(50, 230, 150, 60);
        frame.add(tteobokiImage);
//      Burger;
        JLabel burger;
        burger = new JLabel("Burger");
        burger.setBounds(50, 290, 150, 60);
        frame.add(burger);
        JTextField pesananBurger;
        pesananBurger = new JTextField();
        pesananBurger.setBounds(97, 306, 50, 20);
        frame.add(pesananBurger);
        JButton burgerImage;
        burgerImage = new JButton(new ImageIcon(resizeImage("image/burger.jpg")));
        burgerImage.setBounds(50, 330, 150, 60);
        frame.add(burgerImage);
//      Spaghetti        
        JLabel spaghetti;
        spaghetti = new JLabel("Spaghetti");
        spaghetti.setBounds(280, 100, 100, 30);
        frame.add(spaghetti);
        JTextField pesananSpaghetti;
        pesananSpaghetti = new JTextField();
        pesananSpaghetti.setBounds(338, 105, 50, 20);
        frame.add(pesananSpaghetti);
        JButton spaghettiImage;
        spaghettiImage = new JButton(new ImageIcon(resizeImage("image/spaghetti.jpg")));
        spaghettiImage.setBounds(280, 130, 150, 60);
        frame.add(spaghettiImage);
//      Kentang Goreng        
        JLabel kentangGoreng;
        kentangGoreng = new JLabel("Kentang Goreng");
        kentangGoreng.setBounds(280, 200, 100, 30);
        frame.add(kentangGoreng);
        JTextField pesanankentang;
        pesanankentang = new JTextField();
        pesanankentang.setBounds(380, 205, 50, 20);
        frame.add(pesanankentang);
        JButton kentangGorengImage;
        kentangGorengImage = new JButton(new ImageIcon(resizeImage("image/kentang goreng.jpg")));
        kentangGorengImage.setBounds(280, 230, 150, 60);
        frame.add(kentangGorengImage);
//      Friend Chicken        
        JLabel friedChicken;
        friedChicken = new JLabel("Fried Chicken");
        friedChicken.setBounds(280, 300, 100, 30);
        frame.add(friedChicken);
        JTextField pesananfriedChicken;
        pesananfriedChicken = new JTextField();
        pesananfriedChicken.setBounds(370, 306, 50, 20);
        frame.add(pesananfriedChicken);
        JButton friedChickenImage;
        friedChickenImage = new JButton(new ImageIcon(resizeImage("image/fried chicken.jpg")));
        friedChickenImage.setBounds(280, 330, 150, 60);
        frame.add(friedChickenImage);
        
        JButton save;
        save = new JButton("Save");
        save.setBounds(50, 430, 70, 30);
        save.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            } 
        });
        frame.add(save);

        JButton update;
        update = new JButton("Update");
        update.setBounds(50, 500, 80, 30);
        update.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                 frame.setVisible(false);
                try {
                    new screenMakanan();
                } catch (IOException ex) {
                    Logger.getLogger(screenMakanan.class.getName()).log(Level.SEVERE, null, ex);
                }
            } 
        });
        frame.add(update);

        JButton back;
        back = new JButton("Back");
        back.setBounds(355, 550, 70, 30);
        back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                new screenOrderMakanan();
            }
            
        });
        frame.add(back);
        
        JButton exit;
        exit = new JButton("Exit");
        exit.setBounds(355, 500, 70, 30);
        exit.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                new Screen();
            }
        });
        frame.add(exit);
        
        
        frame.setLayout(null);
        frame.setVisible(true);
    } 

    private Image resizeImage(String url) throws IOException {
        Image dimg = null;
        try{
            BufferedImage img = ImageIO.read(new File(url));
            dimg = img.getScaledInstance(180,57, Image.SCALE_SMOOTH);
        }catch(IOException ex){
            ex.printStackTrace(System.err);
        }
        return dimg;
    }
    
}
