/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author A442UF
 */
public class Order extends stockMakanan {
    int ID_Order;
    int Jumlah_Makanan;
    
    public Order(){
    }

    public Order(int ID_Order, int Jumlah_Makanan, String ID_Makanan, String Nama, int Jumlah, double Harga) {
        super(ID_Makanan, Nama, Jumlah, Harga);
        this.ID_Order = ID_Order;
        this.Jumlah_Makanan = Jumlah_Makanan;
    }
    
    
    public int getID_Order() {
        return ID_Order;
    }

    public void setID_Order(int ID_Order) {
        this.ID_Order = ID_Order;
    }

    public int getJumlah_Makanan() {
        return Jumlah_Makanan;
    }

    public void setJumlah_Makanan(int Jumlah_Makanan) {
        this.Jumlah_Makanan = Jumlah_Makanan;
    }

    public String getID_Makanan() {
        return ID_Makanan;
    }

    public void setID_Makanan(String ID_Makanan) {
        this.ID_Makanan = ID_Makanan;
    }

}
