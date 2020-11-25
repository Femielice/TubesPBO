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
public class Transaksi extends Order{
    private double totalharga;
    private int tanggalpesanan;
    private String metodepembayaran;
    private double diskon;

    public Transaksi() {
    }

    public Transaksi(double totalharga, int tanggalpesanan, String metodepembayaran, double diskon, int id_order, int jumlah_makanan, String id_makanan) {
        super(id_order, jumlah_makanan, id_makanan);
        this.totalharga = totalharga;
        this.tanggalpesanan = tanggalpesanan;
        this.metodepembayaran = metodepembayaran;
        this.diskon = diskon;
    }

    public double getTotalharga() {
        return totalharga;
    }

    public void setTotalharga(double totalharga) {
        this.totalharga = totalharga;
    }

    public int getTanggalpesanan() {
        return tanggalpesanan;
    }

    public void setTanggalpesanan(int tanggalpesanan) {
        this.tanggalpesanan = tanggalpesanan;
    }

    public String getMetodepembayaran() {
        return metodepembayaran;
    }

    public void setMetodepembayaran(String metodepembayaran) {
        this.metodepembayaran = metodepembayaran;
    }

    public double getDiskon() {
        return diskon;
    }

    public void setDiskon(double diskon) {
        this.diskon = diskon;
    }    
}
