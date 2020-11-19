/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Order;
import Model.stockMakanan;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author A442UF
 */
public class Controller {
    static DatabaseHandler conn = new DatabaseHandler();
    
    //SELECT ALL from table stockMakanan
    public ArrayList<stockMakanan> getAllstock(){
        ArrayList<stockMakanan> stockmakanan = new ArrayList<>();
        conn.connect();
        String query = "SELECT * FROM stockmakanan";
        try{
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                stockMakanan Stock = new stockMakanan();
                Stock.setID_Makanan(rs.getString("ID_Makanan"));
                Stock.setNama(rs.getString("Nama"));
                Stock.setJumlah(rs.getInt("Jumlah"));
                Stock.setHarga(rs.getDouble("Harga"));
                stockmakanan.add(Stock);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return(stockmakanan);
    }
    public static boolean Membership(String ID_Member, String Nama, String Tl, String Email, String No_Telp, String Tanggal_ExpDate){
        conn.connect();
        String query = "INSERT INTO membership VALUES (?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = conn.con.prepareStatement(query);
            stmt.setString(1,ID_Member );
            stmt.setString(2, Nama);
            stmt.setString(3, Tl);
            stmt.setString(4, Email);
            stmt.setString(5, No_Telp);
            stmt.setString(6, Tanggal_ExpDate);
            stmt.executeUpdate();
            return(true);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return(false);
    }
    public static boolean Reservasi(String ID, String Nama, int JumlahOrang, String No_Telp, String Jenis_Meja,String Tanggal_Reservasi){
        conn.connect();
        String query = "INSERT INTO Reservasi VALUES (?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = conn.con.prepareStatement(query);
            stmt.setString(1, ID);
            stmt.setString(2, Nama);
            stmt.setInt(3, JumlahOrang);
            stmt.setString(4, No_Telp);
            stmt.setString(5, Jenis_Meja);
            stmt.setString(6, Tanggal_Reservasi);
            stmt.executeUpdate();
            return(true);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return(false);
    }
    public static boolean Meja( String ID_Meja,String Jenis_Meja,int No_Meja){
        conn.connect();
        String query = "INSERT INTO Meja VALUES (?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = conn.con.prepareStatement(query);
            stmt.setString(1, ID_Meja);
            stmt.setString(2, Jenis_Meja);
            stmt.setInt(3, No_Meja);
            
            stmt.executeUpdate();
            return(true);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return(false);
    }
}
