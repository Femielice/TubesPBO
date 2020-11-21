/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author A442UF
 */
public class View_MenuScreen {
    public class MenuScreen {
    public MenuScreen(){
        showMenu();
    }
    private void showMenu(){
       Scanner input = new Scanner(System.in);
       
       boolean menu = true;
       while(menu){
           int choosen = Integer.parseInt(JOptionPane.showInputDialog(null, "Selamat Datang!!! \nMenu: \n1. Customers \n2.  Cashier \n3. Manager" ));
           switch(choosen){
               case 1: new View_MenuCustomers();
                    break;
               case 2: new View_MenuCashier();
                    break;
               case 3: new View_MenuManager();
                    break;
               case 4: menu = false;
                    break;
//           }
       }
    }
}
    }
}
