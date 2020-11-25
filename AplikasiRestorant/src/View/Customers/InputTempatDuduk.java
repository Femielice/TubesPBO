/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Customers;

import View.Screen;
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
public class InputTempatDuduk {
    public InputTempatDuduk(){
        JFrame frame = new JFrame("Menu Restorant");
        frame.setSize(550, 500);
        frame.setLocationRelativeTo(null);
        
        JLabel label;
        label = new JLabel("Menu Order Makanan");
        label.setBounds(190, 50, 300, 30);
        frame.add(label);
        
        JLabel Jenis_Meja;
        Jenis_Meja = new JLabel("Jenis_Meja");
        Jenis_Meja.setBounds(120, 100, 100, 30);
        frame.add(Jenis_Meja);
        JTextField Meja;
        Meja = new JTextField();
        Meja.setBounds(210, 100, 200, 30);
        frame.add(Meja);
        
        JLabel No_Meja;
        No_Meja = new JLabel("No_Meja");
        No_Meja.setBounds(120, 150, 100, 30);
        frame.add(No_Meja);
        JTextField No;
        No = new JTextField();
        No.setBounds(210, 150, 200, 30);
        frame.add(No);
        
         JButton save;
        save = new JButton("Save");
        save.setBounds(120, 200, 70, 30);
        save.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            } 
        });
        frame.add(save);

        JButton back;
        back = new JButton("Back");
        back.setBounds(350, 300, 70, 30);
        back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                new MenuOrder();
            }
            
        });
        frame.add(back);
        
        JButton exit;
        exit = new JButton("Exit");
        exit.setBounds(350, 350, 70, 30);
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
    
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
