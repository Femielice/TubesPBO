/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Customers;

import View.Screen;
import View.ScreenCustomers;
import View.Customers.InputMakanan;
import View.Customers.InputMinuman;
import View.Customers.InputTopping;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


/**
 *
 * @author A442UF
 */
public class MenuOrder {
    public MenuOrder(){
        JFrame frame = new JFrame("Menu Restorant");
        frame.setSize(500, 700);
        frame.setLocationRelativeTo(null);
        
        JLabel label;
        label = new JLabel("Menu Order Makanan");
        label.setBounds(180, 50, 300, 30);
        frame.add(label);
        
        JButton makanan;
        makanan = new JButton("Makanan");
        makanan.setBounds(180, 100, 150, 30);
        makanan.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    frame.setVisible(false);
                    new InputMakanan();
                } catch (IOException ex) {
                    Logger.getLogger(MenuOrder.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        frame.add(makanan);
        
        JButton minuman;
        minuman = new JButton("Minuman");
        minuman.setBounds(180, 150, 150, 30);
        minuman.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    frame.setVisible(false);
                    new InputMinuman();
                } catch (IOException ex) {
                    Logger.getLogger(MenuOrder.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
            
        });
        frame.add(minuman);
        
        JButton topping;
        topping = new JButton("Topping");
        topping.setBounds(180, 200, 150, 30);
        topping.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    frame.setVisible(false);
                    new InputTopping();
                } catch (IOException ex) {
                    Logger.getLogger(MenuOrder.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        });
        frame.add(topping);
        
        JButton tempatDuduk;
        tempatDuduk = new JButton("Input Tempat");
        tempatDuduk.setBounds(180, 250, 150, 30);
        tempatDuduk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                new InputTempatDuduk();
            }
        });
        frame.add(tempatDuduk);
        
        
        
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
        
        frame.setSize(500, 700);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
