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
    private double totalHarga;
    private int tanggalPesanan;
    private String metodePembayaran;
    private double Diskon;

    public Transaksi() {
    }

    public Transaksi(double totalHarga, int tanggalPesanan, String metodePembayaran, double Diskon, int ID_Order, int Jumlah_Makanan, String ID_Makanan, String Nama, int Jumlah, double Harga) {
        super(ID_Order, Jumlah_Makanan, ID_Makanan, Nama, Jumlah, Harga);
        this.totalHarga = totalHarga;
        this.tanggalPesanan = tanggalPesanan;
        this.metodePembayaran = metodePembayaran;
        this.Diskon = Diskon;
    }

    public double getTotalHarga() {
        return totalHarga;
    }

    public void setTotalHarga(double totalHarga) {
        this.totalHarga = totalHarga;
    }

    public int getTanggalPesanan() {
        return tanggalPesanan;
    }

    public void setTanggalPesanan(int tanggalPesanan) {
        this.tanggalPesanan = tanggalPesanan;
    }

    public String getMetodePembayaran() {
        return metodePembayaran;
    }

    public void setMetodePembayaran(String metodePembayaran) {
        this.metodePembayaran = metodePembayaran;
    }

    public double getDiskon() {
        return Diskon;
    }

    public void setDiskon(double Diskon) {
        this.Diskon = Diskon;
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
