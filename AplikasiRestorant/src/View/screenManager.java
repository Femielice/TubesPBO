/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.BorderLayout;
import java.awt.GridLayout;
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
        JFrame frame = new JFrame();
        JPanel panel = new JPanel(new BorderLayout(5,5));
        JPanel label = new JPanel(new GridLayout(0, 1, 2, 2));
        label.add(new JLabel("UserName", SwingConstants.RIGHT));
        label.add(new JLabel("Password", SwingConstants.RIGHT));
        panel.add(label, BorderLayout.WEST);
        
        JPanel controls = new JPanel(new GridLayout(0, 1, 2, 2));
        JTextField username = new JTextField();
        controls.add(username);
        JPasswordField password = new JPasswordField();
        controls.add(password);
        panel.add(controls, BorderLayout.CENTER);

        int input = JOptionPane.showConfirmDialog(frame, panel, "login", JOptionPane.OK_CANCEL_OPTION);
        if(input == JOptionPane.OK_OPTION){
            new screenPendapatan();
        } else{
            new Screen();
        }
    }
}
