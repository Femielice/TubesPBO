/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Asus
 */
public class UpdateStockMakanan {

    public UpdateStockMakanan() {
        JFrame frame = new JFrame("Menu Restorant");
        frame.setSize(500, 700);
        frame.setLocationRelativeTo(null);
        
        JLabel label;
        label = new JLabel("Menu Update Stock Makanan");
        label.setBounds(200, 50, 300, 30);
        frame.add(label);
        
        JLabel Kimbap;
        Kimbap = new JLabel("Kimbap");
        Kimbap.setBounds(120, 100, 100, 30);
        frame.add(Kimbap);
        JTextField jumlah1;
        jumlah1 = new JTextField();
       jumlah1.setBounds(210, 100, 157, 30);
        frame.add(jumlah1);
        
        JLabel Spaghetti;
        Spaghetti = new JLabel("Spaghetti");
        Spaghetti.setBounds(120, 150, 100, 30);
        frame.add(Spaghetti);
        JTextField jumlah2;
        jumlah2 = new JTextField();
        jumlah2.setBounds(210, 150, 157, 30);
        frame.add(jumlah2);
        
        JLabel Teokbokki;
        Teokbokki = new JLabel("Teokbokki");
        Teokbokki.setBounds(120, 200, 100, 30);
        frame.add(Teokbokki);
        JTextField jumlah3;
        jumlah3 = new JTextField();
        jumlah3.setBounds(210, 200, 157, 30);
        frame.add(jumlah3);
        
        
        JLabel Kentang;
        Kentang = new JLabel("Kentang");
        Kentang.setBounds(120, 250, 100, 30);
        frame.add(Kentang);
        JTextField jumlah4;
        jumlah4 = new JTextField();
        jumlah4.setBounds(210, 250, 157, 30);
        frame.add(jumlah4);
        
        JLabel Burger;
        Burger = new JLabel("Burger");
        Burger.setBounds(120, 300, 100, 30);
        frame.add(Burger);
        JTextField jumlah5;
        jumlah5 = new JTextField();
        jumlah5.setBounds(210, 300, 157, 30);
        frame.add(jumlah5);
        
        JLabel Fried_Chicken;
        Fried_Chicken = new JLabel("Fried Chicken");
        Fried_Chicken.setBounds(120, 350, 100, 30);
        frame.add(Fried_Chicken);
        JTextField jumlah6;
        jumlah6 = new JTextField();
        jumlah6.setBounds(210, 350, 157, 30);
        frame.add(jumlah6);
        
        JButton save;
        save = new JButton("Save");
        save.setBounds(355, 500, 70, 30);
        frame.add(save);
        
        JButton back;
        back = new JButton("Back");
        back.setBounds(355, 550, 70, 30);
        back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                new screenCustomers();
            }
            
        });
        frame.add(back);
        
        frame.setSize(500, 700);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    
}
