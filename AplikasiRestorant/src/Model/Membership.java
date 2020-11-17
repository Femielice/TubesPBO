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
public class Membership {
    String ID_Member;
    private String Nama;
    private String Tl;
    private String Email;
    private String No_Telp;
    String Tanggal_ExpDate;
    
    public Membership() {
    }

    public Membership(String ID_Member, String Nama, String Tl, String Email, String No_Telp, String Tanggal_ExpDate) {
        this.ID_Member = ID_Member;
        this.Nama = Nama;
        this.Tl = Tl;
        this.Email = Email;
        this.No_Telp = No_Telp;
        this.Tanggal_ExpDate = Tanggal_ExpDate;
    }
    
    
    public String getID_Member() {
        return ID_Member;
    }

    public void setID_Member(String ID_Member) {
        this.ID_Member = ID_Member;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getTl() {
        return Tl;
    }

    public void setTl(String Tl) {
        this.Tl = Tl;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getNo_Telp() {
        return No_Telp;
    }

    public void setNo_Telp(String No_Telp) {
        this.No_Telp = No_Telp;
    }

    public String getTanggal_ExpDate() {
        return Tanggal_ExpDate;
    }

    public void setTanggal_ExpDate(String Tanggal_ExpDate) {
        this.Tanggal_ExpDate = Tanggal_ExpDate;
    }
    
    
}
