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
public class StockMakanan {
    private String id_makanan;
    private String nama;
    private int jumlah;
    private double harga;
    
    public StockMakanan(){
    }

    public StockMakanan(String id_makanan, String nama, int jumlah, double harga) {
        this.id_makanan = id_makanan;
        this.nama = nama;
        this.jumlah = jumlah;
        this.harga = harga;
    }

    public String getId_makanan() {
        return id_makanan;
    }

    public void setId_makanan(String id_makanan) {
        this.id_makanan = id_makanan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }    
}
