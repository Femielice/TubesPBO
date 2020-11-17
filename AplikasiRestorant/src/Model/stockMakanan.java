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
public class stockMakanan {
    String ID_Makanan;
    private String Nama;
    private int Jumlah;
    private double Harga;
    
    public stockMakanan(){
    }

    public stockMakanan(String ID_Makanan, String Nama, int Jumlah, double Harga) {
        this.ID_Makanan = ID_Makanan;
        this.Nama = Nama;
        this.Jumlah = Jumlah;
        this.Harga = Harga;
    }
    
    public String getID_Makanan() {
        return ID_Makanan;
    }

    public void setID_Makanan(String ID_Makanan) {
        this.ID_Makanan = ID_Makanan;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public int getJumlah() {
        return Jumlah;
    }

    public void setJumlah(int Jumlah) {
        this.Jumlah = Jumlah;
    }

    public double getHarga() {
        return Harga;
    }

    public void setHarga(double Harga) {
        this.Harga = Harga;
    }

    @Override
    public String toString() {
        return "stockMakanan{" + "ID_Makanan=" + ID_Makanan + ", Nama=" + Nama + ", Jumlah=" + Jumlah + ", Harga=" + Harga + '}';
    }
    
    
}
