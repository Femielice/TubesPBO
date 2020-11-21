/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import View.Screen;
import View.screenOrderMakanan;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author A442UF
 */
public class screenMinuman {
    public screenMinuman() throws IOException{
        JFrame frame = new JFrame("Menu Restorant");
        frame.setSize(500, 700);
        frame.setLocationRelativeTo(null);
        
        JLabel label;
        label = new JLabel("Menu Minuman");
        label.setBounds(200, 50, 300, 30);
        frame.add(label);

        JLabel boba ;
        boba = new JLabel("Brown Sugar");
        boba.setBounds(50, 100, 150, 30);
        frame.add(boba);
        JTextField pesananboba;
        pesananboba = new JTextField();
        pesananboba.setBounds(130, 105, 50, 20);
        frame.add(pesananboba);
        JButton bobaImage;
        bobaImage = new JButton(new ImageIcon(resizeImage("image/boba.jpg")));
        bobaImage.setBounds(50, 130, 150, 62);
        frame.add(bobaImage);

        JLabel matcha;
        matcha = new JLabel("Matcha Latte");
        matcha.setBounds(50, 200, 100, 30);
        frame.add(matcha);
        JTextField pesananmatcha;
        pesananmatcha = new JTextField();
        pesananmatcha.setBounds(130, 205, 50, 20);
        frame.add(pesananmatcha);
        JButton macthaImage;
        macthaImage = new JButton(new ImageIcon(resizeImage("image/matcha latte.jpg")));
        macthaImage.setBounds(50, 230, 150, 60);
        frame.add(macthaImage);

        JLabel iceLemon;
        iceLemon = new JLabel("Lemon Ice Tea");
        iceLemon.setBounds(50, 290, 150, 60);
        frame.add(iceLemon);
        JTextField pesananicelemon;
        pesananicelemon = new JTextField();
        pesananicelemon.setBounds(140, 306, 50, 20);
        frame.add(pesananicelemon);
        JButton iceLemonImage;
        iceLemonImage = new JButton(new ImageIcon(resizeImage("image/ice lemon.jpg")));
        iceLemonImage.setBounds(50, 330, 150, 60);
        frame.add(iceLemonImage);
    
        JLabel jusMangga;
        jusMangga = new JLabel("Jus Mangga");
        jusMangga.setBounds(280, 100, 100, 30);
        frame.add(jusMangga);
        JTextField pesananJusmangga;
        pesananJusmangga = new JTextField();
        pesananJusmangga.setBounds(360, 105, 50, 20);
        frame.add(pesananJusmangga);
        JButton jusManggaImage;
        jusManggaImage = new JButton(new ImageIcon(resizeImage("image/Jus mangga.jpg")));
        jusManggaImage.setBounds(280, 130, 150, 60);
        frame.add(jusManggaImage);
 
        JLabel Teh;
        Teh = new JLabel("Teh");
        Teh.setBounds(280, 200, 150, 30);
        frame.add(Teh);
        JTextField pesananTeh;
        pesananTeh = new JTextField();
        pesananTeh.setBounds(310, 205, 50, 20);
        frame.add(pesananTeh);
        JButton TehImage;
        TehImage = new JButton(new ImageIcon(resizeImage("image/teh.jpg")));
        TehImage.setBounds(280, 230, 150, 60);
        frame.add(TehImage);

        JLabel Cappuccino;
        Cappuccino = new JLabel("Cappuccino");
        Cappuccino.setBounds(280, 300, 150, 30);
        frame.add(Cappuccino);
        JTextField pesananCappuccino;
        pesananCappuccino = new JTextField();
        pesananCappuccino.setBounds(360, 305, 50, 20);
        frame.add(pesananCappuccino);
        JButton CappuccinoImage;
        CappuccinoImage = new JButton(new ImageIcon(resizeImage("image/Cappuccino.jpg")));
        CappuccinoImage.setBounds(280, 330, 150, 60);
        frame.add(CappuccinoImage);
        
        JButton save;
        save = new JButton("Save");
        save.setBounds(50, 430, 70, 30);
        frame.add(save);
        
        JButton update;
        update = new JButton("Update");
        update.setBounds(50, 500, 80, 30);
        update.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                 frame.setVisible(false);
                try {
                    new screenMinuman();
                } catch (IOException ex) {
                    Logger.getLogger(screenMinuman.class.getName()).log(Level.SEVERE, null, ex);
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

