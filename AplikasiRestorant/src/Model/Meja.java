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
public class Meja {
    private String ID_Meja;
    String Jenis_Meja;
    private int No_Meja;
    
    public Meja() {
    }

    public Meja(String ID_Meja, String Jenis_Meja, int No_Meja) {
        this.ID_Meja = ID_Meja;
        this.Jenis_Meja = Jenis_Meja;
        this.No_Meja = No_Meja;
    }

    public String getID_Meja() {
        return ID_Meja;
    }

    public void setID_Meja(String ID_Meja) {
        this.ID_Meja = ID_Meja;
    }

    public String getJenis_Meja() {
        return Jenis_Meja;
    }

    public void setJenis_Meja(String Jenis_Meja) {
        this.Jenis_Meja = Jenis_Meja;
    }

    public int getNo_Meja() {
        return No_Meja;
    }

    public void setNo_Meja(int No_Meja) {
        this.No_Meja = No_Meja;
    }
    
}
