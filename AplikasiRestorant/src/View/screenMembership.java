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
public class screenMembership {
    public screenMembership(){
        JFrame frame = new JFrame("Menu Restorant");
        frame.setSize(500, 700);
        frame.setLocationRelativeTo(null);
        
        JLabel label;
        label = new JLabel("Menu Membership");
        label.setBounds(200, 50, 300, 30);
        frame.add(label);
        
        JLabel ID_Member;
        ID_Member = new JLabel("ID Member");
        ID_Member.setBounds(120, 100, 100, 30);
        frame.add(ID_Member);
        JTextField Member;
        Member = new JTextField();
        Member.setBounds(210, 100, 157, 30);
        frame.add(Member);
        
        JLabel nama;
        nama = new JLabel("Nama");
        nama.setBounds(120, 150, 100, 30);
        frame.add(nama);
        JTextField fieldNama;
        fieldNama = new JTextField();
        fieldNama.setBounds(210, 150, 157, 30);
        frame.add(fieldNama);
        
        JLabel No_Telp;
        No_Telp = new JLabel("No Telp");
        No_Telp.setBounds(120, 200, 100, 30);
        frame.add(No_Telp);
        JTextField fieldNo_Telp;
        fieldNo_Telp = new JTextField();
        fieldNo_Telp.setBounds(210, 200, 157, 30);
        frame.add(fieldNo_Telp);
        
        
        JLabel tl;
        tl = new JLabel("Tanggal Lahir");
        tl.setBounds(120, 250, 100, 30);
        frame.add(tl);
        JTextField fieldTl;
        fieldTl = new JTextField();
        fieldTl.setBounds(210, 250, 157, 30);
        frame.add(fieldTl);
        
        JLabel email;
        email = new JLabel("Email");
        email.setBounds(120, 300, 100, 30);
        frame.add(email);
        JTextField fieldEmail;
        fieldEmail = new JTextField();
        fieldEmail.setBounds(210, 300, 157, 30);
        frame.add(fieldEmail);
        
        JLabel EXpDate;
        EXpDate = new JLabel("EXp Date");
        EXpDate.setBounds(120, 350, 100, 30);
        frame.add(EXpDate);
        JTextField fieldEXpDate;
        fieldEXpDate = new JTextField();
        fieldEXpDate.setBounds(210, 350, 157, 30);
        frame.add(fieldEXpDate);
        
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
