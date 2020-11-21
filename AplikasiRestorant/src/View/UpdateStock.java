/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import View.Screen;
import View.screenCustomers;
import View.screenMakanan;
import View.screenMinuman;
import View.screenTopping;
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
public class UpdateStock {
    public UpdateStock(){
        JFrame frame = new JFrame("Menu Restorant");
        frame.setSize(500, 700);
        frame.setLocationRelativeTo(null);
        
        JLabel label;
        label = new JLabel("Menu Update");
        label.setBounds(180, 50, 300, 30);
        frame.add(label);
        
        JButton updatemakanan;
        updatemakanan = new JButton("Update Makanan");
        updatemakanan.setBounds(100, 100, 150, 30);
        updatemakanan.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                new UpdateStockMakanan();
            }
        });
        frame.add(updatemakanan);
        
        JButton updateminuman;
        updateminuman = new JButton("Update Minuman");
        updateminuman.setBounds(100, 170, 150, 30);
        updateminuman.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                new UpdateStockMinuman();
                
            }
            
        });
        frame.add(updateminuman);
        
        JButton updatetopping;
        updatetopping = new JButton("Update Topping");
        updatetopping.setBounds(270, 100, 150, 30);
        updatetopping.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                new UpdateStockTopping();
            }
            
        });
        frame.add(updatetopping);
        
        JButton back;
        back = new JButton("Back");
        back.setBounds(270, 170, 150, 30);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                new screenCashier();
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
        
        frame.setSize(500, 700);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
