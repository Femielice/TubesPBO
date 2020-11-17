/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;


import Model.Order;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import javafx.scene.paint.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author A442UF
 */
public class Screen extends JFrame {
    JButton InsertData;
    public Screen(){
        JFrame frame = new JFrame("Menu Restorant");
        frame.setSize(500, 700);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true); 
        
        JPanel panel = new JPanel();
        panel.setBounds(50, 70, 500, 700);
        
        JLabel label;
        label = new JLabel("SELAMAT DATANG DI MENU RESTORANT");
        label.setBounds(120, 50, 300, 30);
        JPanel labell = new JPanel();
        panel.add(labell);
        frame.add(label);
        
        JButton customer;
        customer = new JButton("Customers");
        customer.setBounds(179, 100, 100, 30);
        customer.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                new screenCustomers();
            }
            
        });
        JPanel cust = new JPanel();
        panel.add(cust);
        frame.add(customer);
       
        JButton cashier;
        cashier = new JButton("Cashier");
        cashier.setBounds(179, 150, 100, 30);
        cashier.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                new screenCashier();
            }
            
        });
        JPanel cashierpanel = new JPanel();
        panel.add(cashierpanel);
        frame.add(cashier);
        
        JButton manager;
        manager = new JButton("Manager");
        manager.setBounds(179, 200, 100, 30);
        manager.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                new screenManager();
            }
            
        });
        JPanel managerpanel = new JPanel();
        panel.add(managerpanel);
        frame.add(manager);
        
        JButton kitchen;
        kitchen = new JButton("Kitchen");
        kitchen.setBounds(179, 250, 100, 30);
        kitchen.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                new screenKitchen();
            }    
        });
        frame.add(kitchen);
        JPanel Kitchen = new JPanel();
        panel.add(Kitchen);
    }
    
        
    
}


