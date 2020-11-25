/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Manager;

import View.Screen;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author A442UF
 */
public class ShowPendapatan {
    public ShowPendapatan(){
        JFrame frame = new JFrame("Menu Restaurant");
        frame.setSize(600, 300);
        frame.setLocationRelativeTo(null);
        
        JPanel panel = new JPanel();
        
        JLabel label;
        label = new JLabel("Pendapatan Restaurant");
        label.setBounds(200, 50, 300, 30);
        frame.add(label);
        JPanel labell = new JPanel();
        panel.add(labell);
        
        JLabel totalPendapatan;
        totalPendapatan = new JLabel("Bulan");
        totalPendapatan.setBounds(170, 100, 100, 30);
        frame.add(totalPendapatan);
        JTextField FieldtotalPendapatan;
        FieldtotalPendapatan = new JTextField();
        FieldtotalPendapatan.setBounds(210, 100, 170, 30);
        frame.add(FieldtotalPendapatan);
        
        JButton input;
        input = new JButton("Input");
        input.setBounds(210, 150, 70, 30);
        frame.add(input);
        
        JButton exit;
        exit = new JButton("Exit");
        exit.setBounds(299, 150, 70, 30);
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
