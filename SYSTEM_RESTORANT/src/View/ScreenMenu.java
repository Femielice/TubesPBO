/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JOptionPane;

/**
 *
 * @author A442UF
 */
public class ScreenMenu {
    public class MenuScreen {
        
    public MenuScreen(){
        showMenu();
    }
    private void showMenu(){
       boolean menu = true;
       while(menu){
           int choosen = Integer.parseInt(JOptionPane.showInputDialog(null, "Selamat Datang!!! \nMenu: \n1. Customers \n2.  Cashier \n3. Manager" ));
           switch(choosen){
               case 1: new ScreenMenuCustomers();
                    break;
               case 2: new ScreenMenuCashier();
                    break;
               case 3: new ScreenMenuManager();
                    break;
               case 4: menu = false;
                    break;
//           }
       }
    }
}
    }
}
