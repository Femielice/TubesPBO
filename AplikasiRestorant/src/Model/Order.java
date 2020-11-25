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
public class Order {
    private int id_order;
    private int jumlah_makanan;
    private String id_makanan;
    
    public Order(){
    }

    public Order(int id_order, int jumlah_makanan, String id_makanan) {
        this.id_order = id_order;
        this.jumlah_makanan = jumlah_makanan;
        this.id_makanan = id_makanan;
    }

    public int getId_order() {
        return id_order;
    }

    public void setId_order(int id_order) {
        this.id_order = id_order;
    }

    public int getJumlah_makanan() {
        return jumlah_makanan;
    }

    public void setJumlah_makanan(int jumlah_makanan) {
        this.jumlah_makanan = jumlah_makanan;
    }

    public String getId_makanan() {
        return id_makanan;
    }

    public void setId_makanan(String id_makanan) {
        this.id_makanan = id_makanan;
    }
}
