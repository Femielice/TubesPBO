/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Meja;

/**
 *
 * @author A442UF
 */
public class Reservasi extends Meja{
    private String ID;
    private String Nama;
    int JumlahOrang;
    private String No_Telp;
    private String Tanggal_Reservasi;
   
    public Reservasi() {
        
    }

    public Reservasi(String ID, String Nama, int JumlahOrang, String No_Telp, String Tanggal_Reservasi, String ID_Meja, String Jenis_Meja, int No_Meja) {
        super(ID_Meja, Jenis_Meja, No_Meja);
        this.ID = ID;
        this.Nama = Nama;
        this.JumlahOrang = JumlahOrang;
        this.No_Telp = No_Telp;
        this.Tanggal_Reservasi = Tanggal_Reservasi;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public int getJumlahOrang() {
        return JumlahOrang;
    }

    public void setJumlahOrang(int JumlahOrang) {
        this.JumlahOrang = JumlahOrang;
    }

    public String getNo_Telp() {
        return No_Telp;
    }

    public void setNo_Telp(String No_Telp) {
        this.No_Telp = No_Telp;
    }

    public String getTanggal_Reservasi() {
        return Tanggal_Reservasi;
    }

    public void setTanggal_Reservasi(String Tanggal_Reservasi) {
        this.Tanggal_Reservasi = Tanggal_Reservasi;
    }
    
   

   
    
    
}
