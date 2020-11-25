/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.Controller;
import java.util.ArrayList;

/**
 *
 * @author A442UF
 */
public class Meja {
    private String id_meja;
    private String jenis_meja;
    private int no_meja;
    
    public Meja(){
    
    }

    public Meja(String id_meja, String jenis_meja, int no_meja) {
        this.id_meja = id_meja;
        this.jenis_meja = jenis_meja;
        this.no_meja = no_meja;
    }

    public String getId_meja() {
        return id_meja;
    }

    public void setId_meja(String id_meja) {
        this.id_meja = id_meja;
    }

    public String getJenis_meja() {
        return jenis_meja;
    }

    public void setJenis_meja(String jenis_meja) {
        this.jenis_meja = jenis_meja;
    }

    public int getNo_meja() {
        return no_meja;
    }

    public void setNo_meja(int no_meja) {
        this.no_meja = no_meja;
    }

    @Override
    public String toString() {
        return id_meja;
    }
}
