/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import View.Screen;
import View.screenOrderMakanan;
import java.awt.Image;
import java.awt.TextField;
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
public class screenTopping {

    public screenTopping() throws IOException {
        JFrame frame = new JFrame("Menu Restorant");
        frame.setSize(500, 700);
        frame.setLocationRelativeTo(null);
        
        JLabel label;
        label = new JLabel("Menu Topping");
        label.setBounds(200, 50, 300, 30);
        frame.add(label);
   
        JLabel keju;
        keju = new JLabel("Keju");
        keju.setBounds(50, 100, 100, 30);
        frame.add(keju);
        JTextField pesananKeju;
        pesananKeju = new JTextField();
        pesananKeju.setBounds(87, 105, 50, 20);
        frame.add(pesananKeju);
        JButton kejuImage;
        kejuImage = new JButton(new ImageIcon(resizeImage("image/keju.jpg")));
        kejuImage.setBounds(50, 130, 150, 62);
        frame.add(kejuImage);
    
        JLabel telur;
        telur = new JLabel("Telur");
        telur.setBounds(50, 200, 100, 30);
        frame.add(telur);
        JTextField pesananTelur;
        pesananTelur = new JTextField();
        pesananTelur.setBounds(90, 205, 50, 20);
        frame.add(pesananTelur);
        JButton telurImage;
        telurImage = new JButton(new ImageIcon(resizeImage("image/telur.jpg")));
        telurImage.setBounds(50, 230, 150, 60);
        frame.add(telurImage);
     
        JLabel kimchi;
        kimchi = new JLabel("Kimchi");
        kimchi.setBounds(50, 290, 150, 60);
        frame.add(kimchi);
        JTextField pesananKimchi;
        pesananKimchi = new JTextField();
        pesananKimchi.setBounds(98, 306, 50, 20);
        frame.add(pesananKimchi);
        JButton kimchiImage;
        kimchiImage = new JButton(new ImageIcon(resizeImage("image/kimchi.jpg")));
        kimchiImage.setBounds(50, 330, 150, 60);
        frame.add(kimchiImage);

        JLabel oreo;
        oreo = new JLabel("Oreo");
        oreo.setBounds(280, 100, 100, 30);
        frame.add(oreo);
        JTextField pesananOreo;
        pesananOreo = new JTextField();
        pesananOreo.setBounds(315, 105, 50, 20);
        frame.add(pesananOreo);
        JButton oreoImage;
        oreoImage = new JButton(new ImageIcon(resizeImage("image/oreo.jpg")));
        oreoImage.setBounds(280, 130, 150, 60);
        frame.add(oreoImage);
   
        JLabel mayonnaise;
        mayonnaise = new JLabel("Mayonnaise");
        mayonnaise.setBounds(280, 200, 100, 30);
        frame.add(mayonnaise);
        JTextField pesananMayonnaise;
        pesananMayonnaise = new JTextField();
        pesananMayonnaise.setBounds(355, 205, 50, 20);
        frame.add(pesananMayonnaise);
        JButton mayonnaiseImage;
        mayonnaiseImage = new JButton(new ImageIcon(resizeImage("image/mayonnaise.jpg")));
        mayonnaiseImage.setBounds(280, 230, 150, 60);
        frame.add(mayonnaiseImage);
     
        JLabel susu;
        susu = new JLabel("Susu");
        susu.setBounds(280, 300, 100, 30);
        frame.add(susu);
        JTextField pesananSusu;
        pesananSusu = new JTextField();
        pesananSusu.setBounds(315, 305, 50, 20);
        frame.add(pesananSusu);
        JButton susuImage;
        susuImage = new JButton(new ImageIcon(resizeImage("image/susu.jpg")));
        susuImage.setBounds(280, 330, 150, 60);
        frame.add(susuImage);
        
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
                    new screenTopping();
                } catch (IOException ex) {
                    Logger.getLogger(screenTopping.class.getName()).log(Level.SEVERE, null, ex);
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
    

