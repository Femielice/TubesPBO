/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author A442UF
 */
public class screenCashier {
    public screenCashier(){
        JFrame frame = new JFrame("Menu Restorant");
        frame.setSize(500, 700);
        frame.setLocationRelativeTo(null);
        JPanel panel = new JPanel();
        
        JLabel label;
        label = new JLabel("Menu Cashier");
        label.setBounds(200, 50, 300, 30);
        frame.add(label);
        JPanel labell = new JPanel();
        panel.add(labell);
        
        JButton managemenstock;
        managemenstock = new JButton("Management Stock");
        managemenstock.setBounds(150, 100, 170, 30);
        managemenstock.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    frame.setVisible(false);
                    new screenStock();
                } catch (IOException ex) {
                    Logger.getLogger(screenCashier.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        });
        frame.add(managemenstock);
        JPanel stock = new JPanel();
        panel.add(stock);
        
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
}
