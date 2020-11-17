/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author A442UF
 */


public class screenStock {
    public screenStock() throws IOException{
        JFrame frame = new JFrame("Menu Restorant");
        frame.setSize(800, 820);
        frame.setLocationRelativeTo(null);
        
        JLabel label;
        label = new JLabel("Menu Management Stock");
        label.setBounds(310, 40, 300, 30);
        frame.add(label);
        
        JLabel label1;
        label1 = new JLabel("Menu Makanan");
        label1.setBounds(130, 70, 300, 30);
        frame.add(label1);
        
        JLabel kimbab;
        kimbab = new JLabel("Kimbap");
        kimbab.setBounds(30, 100, 100, 30);
        frame.add(kimbab);
        JButton kimbabImage;
        kimbabImage = new JButton(new ImageIcon(resizeImage("image/kimbap.jpg")));
        kimbabImage.setBounds(30, 130, 150, 62);
        frame.add(kimbabImage);
     
        
        JLabel tteoboki;
        tteoboki = new JLabel("Tteokbokki");
        tteoboki.setBounds(30, 200, 100, 30);
        frame.add(tteoboki);
        JButton tteobokiImage;
        tteobokiImage = new JButton(new ImageIcon(resizeImage("image/tteokbokki.jpg")));
        tteobokiImage.setBounds(30, 230, 150, 60);
        frame.add(tteobokiImage);
        
        JLabel burger;
        burger = new JLabel("Burger");
        burger.setBounds(30, 290, 150, 60);
        frame.add(burger);
        JButton burgerImage;
        burgerImage = new JButton(new ImageIcon(resizeImage("image/burger.jpg")));
        burgerImage.setBounds(30, 330, 150, 60);
        frame.add(burgerImage);
        
        JLabel spaghetti;
        spaghetti = new JLabel("Spaghetti");
        spaghetti.setBounds(200, 100, 100, 30);
        frame.add(spaghetti);
        JButton spaghettiImage;
        spaghettiImage = new JButton(new ImageIcon(resizeImage("image/spaghetti.jpg")));
        spaghettiImage.setBounds(200, 130, 150, 60);
        frame.add(spaghettiImage);
        
        JLabel kentangGoreng;
        kentangGoreng = new JLabel("Kentang Goreng");
        kentangGoreng.setBounds(200, 200, 100, 30);
        frame.add(kentangGoreng);
        JButton kentangGorengImage;
        kentangGorengImage = new JButton(new ImageIcon(resizeImage("image/kentang goreng.jpg")));
        kentangGorengImage.setBounds(200, 230, 150, 60);
        frame.add(kentangGorengImage);
        
        JLabel friedChicken;
        friedChicken = new JLabel("Fried Chicken");
        friedChicken.setBounds(200, 300, 100, 30);
        frame.add(friedChicken);
        JButton friedChickenImage;
        friedChickenImage = new JButton(new ImageIcon(resizeImage("image/fried chicken.jpg")));
        friedChickenImage.setBounds(200, 330, 150, 60);
        frame.add(friedChickenImage);
        
        JLabel label2;
        label2 = new JLabel("Menu Minuman");
        label2.setBounds(530, 70, 300, 30);
        frame.add(label2);
    
        JLabel boba ;
        boba = new JLabel("Brown Sugar Bubble Tea");
        boba.setBounds(420, 100, 150, 30);
        frame.add(boba);
        JButton bobaImage;
        bobaImage = new JButton(new ImageIcon(resizeImage("image/boba.jpg")));
        bobaImage.setBounds(420, 130, 150, 62);
        frame.add(bobaImage);
     
        JLabel mactha;
        mactha = new JLabel("Mactha Latte");
        mactha.setBounds(420, 200, 100, 30);
        frame.add(mactha);
        JButton macthaImage;
        macthaImage = new JButton(new ImageIcon(resizeImage("image/matcha latte.jpg")));
        macthaImage.setBounds(420, 230, 150, 60);
        frame.add(macthaImage);
        
        JLabel iceLemon;
        iceLemon = new JLabel("Lemon Ice Tea");
        iceLemon.setBounds(420, 290, 150, 60);
        frame.add(iceLemon);
        JButton iceLemonImage;
        iceLemonImage = new JButton(new ImageIcon(resizeImage("image/ice lemon.jpg")));
        iceLemonImage.setBounds(420, 330, 150, 60);
        frame.add(iceLemonImage);
        
        JLabel jusMangga;
        jusMangga = new JLabel("Jus Mangga");
        jusMangga.setBounds(590, 100, 100, 30);
        frame.add(jusMangga);
        JButton jusManggaImage;
        jusManggaImage = new JButton(new ImageIcon(resizeImage("image/Jus mangga.jpg")));
        jusManggaImage.setBounds(590, 130, 150, 60);
        frame.add(jusManggaImage);
        
        JLabel smoothies;
        smoothies = new JLabel("Strawberry Smoothies");
        smoothies.setBounds(590, 200, 150, 30);
        frame.add(smoothies);
        JButton smoothiesImage;
        smoothiesImage = new JButton(new ImageIcon(resizeImage("image/smoothie.jpg")));
        smoothiesImage.setBounds(590, 230, 150, 60);
        frame.add(smoothiesImage);
        
        JLabel milkshake;
        milkshake = new JLabel("Milkshake Chocolate");
        milkshake.setBounds(590, 300, 150, 30);
        frame.add(milkshake);
        JButton milkshakeImage;
        milkshakeImage = new JButton(new ImageIcon(resizeImage("image/milkshake.jpg")));
        milkshakeImage.setBounds(590, 330, 150, 60);
        frame.add(milkshakeImage);
        
         JLabel label3;
        label3 = new JLabel("Menu Topping");
        label3.setBounds(350, 410, 300, 30);
        frame.add(label3);
        
        JLabel keju;
        keju = new JLabel("Keju");
        keju.setBounds(160, 440, 100, 30);
        frame.add(keju);
        JButton kejuImage;
        kejuImage = new JButton(new ImageIcon(resizeImage("image/keju.jpg")));
        kejuImage.setBounds(160, 470, 150, 62);
        frame.add(kejuImage);
        
        JLabel telur;
        telur = new JLabel("Telur");
        telur.setBounds(330, 440, 100, 30);
        frame.add(telur);
        JButton telurImage;
        telurImage = new JButton(new ImageIcon(resizeImage("image/telur.jpg")));
        telurImage.setBounds(330, 470, 150, 60);
        frame.add(telurImage);
        
        JLabel kimchi;
        kimchi = new JLabel("Kimchi");
        kimchi.setBounds(500, 430, 150, 60);
        frame.add(kimchi);
        JButton kimchiImage;
        kimchiImage = new JButton(new ImageIcon(resizeImage("image/kimchi.jpg")));
        kimchiImage.setBounds(500, 470, 150, 60);
        frame.add(kimchiImage);
        
        JLabel oreo;
        oreo = new JLabel("Oreo");
        oreo.setBounds(160, 540, 100, 30);
        frame.add(oreo);
        JButton oreoImage;
        oreoImage = new JButton(new ImageIcon(resizeImage("image/oreo.jpg")));
        oreoImage.setBounds(160, 570, 150, 60);
        frame.add(oreoImage);
        
        JLabel mayonnaise;
        mayonnaise = new JLabel("Mayonnaise");
        mayonnaise.setBounds(330, 540, 100, 30);
        frame.add(mayonnaise);
        JButton mayonnaiseImage;
        mayonnaiseImage = new JButton(new ImageIcon(resizeImage("image/mayonnaise.jpg")));
        mayonnaiseImage.setBounds(330, 570, 150, 60);
        frame.add(mayonnaiseImage);
        
        JLabel susu;
        susu = new JLabel("Susu");
        susu.setBounds(500, 540, 100, 30);
        frame.add(susu);
        JButton susuImage;
        susuImage = new JButton(new ImageIcon(resizeImage("image/susu.jpg")));
        susuImage.setBounds(500, 570, 150, 60);
        frame.add(susuImage);
        
        JButton exit;
        exit = new JButton("Exit");
        exit.setBounds(610, 650, 70, 30);
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


