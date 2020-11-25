/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Cashier;

import View.Screen;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author A442UF
 */
public class ShowTempatDudukReservasi {
    public ShowTempatDudukReservasi(){
        JFrame frame = new JFrame("Menu Restorant");
        frame.setSize(500, 700);
        frame.setLocationRelativeTo(null);
        
        JLabel label;
        label = new JLabel("Input Tempat duduk");
        label.setBounds(200, 50, 300, 30);
        frame.add(label);
        
        JLabel Nama;
        Nama = new JLabel("Nama");
        Nama.setBounds(120, 100, 100, 30);
        frame.add(Nama);
        JTextField fieldNama;
        fieldNama = new JTextField();
        fieldNama.setBounds(210, 100, 157, 30);
        frame.add(fieldNama);
        
        JLabel Tanggal;
        Tanggal = new JLabel("Tanggal");
        Tanggal.setBounds(120, 150, 100, 30);
        frame.add(Tanggal);
        JTextField fieldTanggal;
        fieldTanggal = new JTextField();
        fieldTanggal.setBounds(210, 150, 157, 30);
        frame.add(fieldTanggal);
        
        JButton insert;
        insert = new JButton("Insert");
        insert.setBounds(355, 500, 70, 30);
        insert.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
      
            } 
        });
        frame.add(insert);
        
        JButton exit;
        exit = new JButton("Exit");
        exit.setBounds(355, 550, 70, 30);
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
