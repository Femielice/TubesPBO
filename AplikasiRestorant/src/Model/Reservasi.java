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
    private String id;
    private String nama;
    private String jumlahorang;
    private String notelp;
    private String tanggalreservasi;
   
    public Reservasi() {
        
    }

    public Reservasi(String id, String nama, String jumlahorang, String notelp, String tanggalreservasi, String id_meja, String jenis_meja, int no_meja) {
        super(id_meja, jenis_meja, no_meja);
        this.id = id;
        this.nama = nama;
        this.jumlahorang = jumlahorang;
        this.notelp = notelp;
        this.tanggalreservasi = tanggalreservasi;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJumlahorang() {
        return jumlahorang;
    }

    public void setJumlahorang(String jumlahorang) {
        this.jumlahorang = jumlahorang;
    }

    public String getNotelp() {
        return notelp;
    }

    public void setNotelp(String notelp) {
        this.notelp = notelp;
    }

    public String getTanggalreservasi() {
        return tanggalreservasi;
    }

    public void setTanggalreservasi(String tanggalreservasi) {
        this.tanggalreservasi = tanggalreservasi;
    }
    
}
