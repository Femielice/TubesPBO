/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import View.Customers.InputMembership;
import View.Customers.InputReservasiMeja;
import View.Customers.MenuOrder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author A442UF
 */
public class ScreenCustomers extends JFrame {
    public ScreenCustomers(){
        JFrame frame = new JFrame("Menu Restorant");
        frame.setSize(500, 700);
        frame.setLocationRelativeTo(null);
        
        JPanel panel = new JPanel();
        
        JLabel label;
        label = new JLabel("Menu Customers");
        label.setBounds(200, 50, 300, 30);
        frame.add(label);
        JPanel labell = new JPanel();
        panel.add(labell);
        
        JButton orderPesanan;
        orderPesanan = new JButton("Order Pesanan");
        orderPesanan.setBounds(179, 100, 130, 30);
        orderPesanan.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                new MenuOrder();
            }
            
        });
        frame.add(orderPesanan);
        JPanel order = new JPanel();
        panel.add(order);
        
        JButton inputMember;
        inputMember = new JButton("Membership");
        inputMember.setBounds(179, 150, 130, 30);
        inputMember.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                new InputMembership();
            }
            
        });
        frame.add(inputMember);
        JPanel input = new JPanel();
        panel.add(input);
        
        JButton reservasi;
        reservasi = new JButton("Reservasi Meja");
        reservasi.setBounds(179, 200, 135, 30);
        reservasi.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                new InputReservasiMeja();
            }
            
        });
        frame.add(reservasi);
        
         JButton exit;
        exit = new JButton("Exit");
        exit.setBounds(355, 500, 70, 30);
        exit.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                new Screen();
                frame.setVisible(false);
            }
            
        });
        frame.add(exit);
        JPanel exitt = new JPanel();
        panel.add(exitt);
        
        frame.add(panel);
        frame.setLayout(null);
        frame.setVisible(true);
    
    }
}
