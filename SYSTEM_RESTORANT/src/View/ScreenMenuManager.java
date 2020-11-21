/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import View.ScreenManager.ScreenCheckPendapatan;
import View.ScreenManager.ScreenCheckStock;
import javax.swing.JOptionPane;

/**
 *
 * @author A442UF
 */
public class ScreenMenuManager {
    public class MenuManager {
        
    public MenuManager(){
        showMenu();
    }
    private void showMenu(){
       boolean menu = true;
       while(menu){
           int choosen = Integer.parseInt(JOptionPane.showInputDialog(null, "Selamat Datang!!! \nMenu: \n1. Check Pendapatan \n2. Check Stock" ));
           switch(choosen){
               case 1: new ScreenCheckPendapatan();
                    break;
               case 2: new ScreenCheckStock();
                    break;
               case 4: menu = false;
                    break;
//           }
       }
    }
}
    }
}
