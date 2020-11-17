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
 * @author A442UF
 */
public class screenTransaksi {
    public screenTransaksi(){
        JFrame frame = new JFrame("Menu Restorant");
        frame.setSize(500, 700);
        frame.setLocationRelativeTo(null);
        
        JLabel label;
        label = new JLabel("Menu Transaksi");
        label.setBounds(200, 50, 300, 30);
        frame.add(label);
        
        JLabel nama;
        nama = new JLabel("Nama");
        nama.setBounds(120, 100, 100, 30);
        frame.add(nama);
        JTextField fieldNama;
        fieldNama = new JTextField();
        fieldNama.setBounds(210, 100, 157, 30);
        frame.add(fieldNama);
        
        JButton input;
        input = new JButton("Input");
        input.setBounds(355, 500, 70, 30);
        frame.add(input);
        
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

        frame.setLayout(null);
        frame.setVisible(true);
    }
}
