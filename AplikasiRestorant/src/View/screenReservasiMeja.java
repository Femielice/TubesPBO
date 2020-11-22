/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Controller;
import Controller.DatabaseHandler;
import Model.Meja;
import Model.Reservasi;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
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
        
        JLabel ID;
        ID = new JLabel("ID");
        ID.setBounds(120, 100, 100, 30);
        frame.add(ID);
        JTextField fieldID;
        fieldID = new JTextField();
        fieldID.setBounds(210, 100, 157, 30);
        frame.add(fieldID);
        
        JLabel Nama;
        Nama = new JLabel("Nama");
        Nama.setBounds(120, 150, 100, 30);
        frame.add(Nama);
        JTextField fieldNama;
        fieldNama = new JTextField();
        fieldNama.setBounds(210, 150, 157, 30);
        frame.add(fieldNama);
        
        JLabel Jumlah;
        Jumlah = new JLabel("Jumlah Orang");
        Jumlah.setBounds(120, 200, 100, 30);
        frame.add(Jumlah);
        JTextField fieldJumlah;
        fieldJumlah = new JTextField();
        fieldJumlah.setBounds(210, 200, 157, 30);
        frame.add(fieldJumlah);
        
        JLabel No_Telp;
        No_Telp = new JLabel("No Telp");
        No_Telp.setBounds(120, 250, 100, 30);
        frame.add(No_Telp);
        JTextField fieldNo_Telp;
        fieldNo_Telp = new JTextField();
        fieldNo_Telp.setBounds(210, 250, 157, 30);
        frame.add(fieldNo_Telp);
     
        JLabel Tanggal;
        Tanggal = new JLabel("Tanggal");
        Tanggal.setBounds(120, 300, 100, 30);
        frame.add(Tanggal);
        JTextField fieldTanggal;
        fieldTanggal = new JTextField();
        fieldTanggal.setBounds(210, 300, 157, 30);
        frame.add(fieldTanggal);
        
        JLabel ID_meja;
        ID_meja = new JLabel("ID meja");
        ID_meja.setBounds(120, 350, 157, 30);
        frame.add(ID_meja);
        JComboBox idBox = new JComboBox();
        idBox.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Meja input_meja = new Meja();
                ArrayList<Meja> meja = Controller.getAllMeja();
                for(Meja new_meja : meja){
                    idBox.addItem(input_meja.getID_Meja());
                }
            }
            
        });
        idBox.setBounds(210, 350, 157, 30);
        frame.add(idBox);
        
        JButton save;
        save = new JButton("Save");
        save.setBounds(355, 500, 70, 30);
        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Reservasi new_reservasi = new Reservasi();
                new_reservasi.setID(fieldID.getText());
                new_reservasi.setNama(fieldNama.getText());
                new_reservasi.setTanggal_Reservasi(fieldTanggal.getText());
                new_reservasi.setJumlahOrang(fieldJumlah.getColumns());
                new_reservasi.setNo_Telp(fieldNo_Telp.getText());
                new_reservasi.setID_Meja(idBox.getActionCommand());
                Controller.Reservasi(new_reservasi);
            }
        });
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
