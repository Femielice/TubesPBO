/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Controller;
import Model.Person;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author A442UF
 */
public class screenManager extends JFrame{
    public screenManager(){
        JFrame frame = new JFrame("Menu Restorant");
        frame.setSize(500, 350);
        frame.setLocationRelativeTo(null);
        
        JLabel label;
        label = new JLabel("Menu Manager");
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
        
        JButton input = new JButton("Sign IN");
        input.setBounds(150, 209, 100, 25);
        input.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Person p = new Person();
                if(e.getSource().equals(input)){
                    Controller.Person(p);
                    if(fieldID.getText().equals(p.getID_Person())){
                            JOptionPane.showMessageDialog(null, "Silahkan Masuk");
                            new screenPendapatan();
                            frame.setVisible(false);
                    } else {
                            JOptionPane.showMessageDialog(null, "Data yang Tidak ada");
                    }
                }
            }
            
        });
        frame.add(input);
        
        JButton signUP = new JButton("Sign UP");
        signUP.setBounds(300, 209, 100, 25);
        signUP.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                Person p = new Person();
                p.setID_Person(fieldID.getText());
                p.setNama(fieldNama.getText());
                Controller.Person(p);
                if(e.getSource().equals(signUP)){
                    JOptionPane.showMessageDialog(null, "Data telah tersimpan");
                     new screenPendapatan();
                     frame.setVisible(false);
                }
            }
        });
        
        frame.add(signUP);
        
        frame.setLayout(null);
        frame.setVisible(true);
        
    }
}
