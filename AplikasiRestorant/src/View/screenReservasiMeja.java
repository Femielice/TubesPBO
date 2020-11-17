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
public class screenReservasiMeja {
    public screenReservasiMeja(){
        JFrame frame = new JFrame("Menu Restorant");
        frame.setSize(500, 700);
        frame.setLocationRelativeTo(null);
        
        JLabel label;
        label = new JLabel("Menu Reservasi Meja");
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
        
        JLabel Jumlah;
        Jumlah = new JLabel("Jumlah Orang");
        Jumlah.setBounds(120, 150, 100, 30);
        frame.add(Jumlah);
        JTextField fieldJumlah;
        fieldJumlah = new JTextField();
        fieldJumlah.setBounds(210, 150, 157, 30);
        frame.add(fieldJumlah);
        
        JLabel No_Telp;
        No_Telp = new JLabel("No Telp");
        No_Telp.setBounds(120, 200, 100, 30);
        frame.add(No_Telp);
        JTextField fieldNo_Telp;
        fieldNo_Telp = new JTextField();
        fieldNo_Telp.setBounds(210, 200, 157, 30);
        frame.add(fieldNo_Telp);
        
        JLabel No_Meja;
        No_Meja = new JLabel("No Meja");
        No_Meja.setBounds(120, 250, 100, 30);
        frame.add(No_Meja);
        JTextField fieldNo_Meja;
        fieldNo_Meja = new JTextField();
        fieldNo_Meja.setBounds(210, 250, 157, 30);
        frame.add(fieldNo_Meja);
     
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
        
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
