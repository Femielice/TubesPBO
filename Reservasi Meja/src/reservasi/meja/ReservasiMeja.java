/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservasi.meja;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author Asus
 */
public class ReservasiMeja {
    /**
     * @param args the command line arguments
     */
    public class MenuScreen {
        
    public MenuScreen(){
        showMenu();
    }
    private void showMenu(){
       boolean menu = true;
       while(menu){
           int choosen = Integer.parseInt(JOptionPane.showInputDialog(null, "Selamat Datang!!! \nMenu: \n1. Input Nama \n2.  Pemesanan Kursi \n" ));
           switch(choosen){
               case 1: new ScreenInputNama();
                    break;
               case 2: new ScreenPemesananKursi();
                    break;
               case 3: menu = false;
                    break;
//           }
       }
    }
}
    }
}

