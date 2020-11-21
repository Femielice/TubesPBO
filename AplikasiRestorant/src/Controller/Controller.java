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
     public static boolean Transaksi( double totalHarga, String tanggalPesanan, String metodePembayaran, double Diskon, int ID_Order, int Jumlah_Makanan, String ID_Makanan, String Nama, int Jumlah, double Harga){
        conn.connect();
        String query = "INSERT INTO Transaksi VALUES (?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = conn.con.prepareStatement(query);
            stmt.setInt(1, ID_Order);
            stmt.setString(2, tanggalPesanan);
            stmt.setString(3, Nama);
            stmt.setString(4, ID_Makanan);
            stmt.setInt(5, Jumlah_Makanan);
            stmt.setInt(6, Jumlah);
            stmt.setString(7, metodePembayaran);
            stmt.setDouble(8,Diskon);
            stmt.setDouble(9,Harga);
            stmt.setDouble(10,totalHarga);
            stmt.executeUpdate();
            return(true);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return(false);
    }
    public static boolean Order( int ID_Order, int Jumlah_Makanan, String ID_Makanan, String Nama, int Jumlah, double Harga,String StatusOrder){
        conn.connect();
        String query = "INSERT INTO Order VALUES (?,?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = conn.con.prepareStatement(query);
            stmt.setInt(1, ID_Order);
            stmt.setString(2, Nama);
            stmt.setString(3,ID_Makanan );
            stmt.setInt(4, Jumlah);
            stmt.setInt(5, Jumlah_Makanan);
            stmt.setDouble(6,Harga);
            stmt.setString(7,StatusOrder );   
            stmt.executeUpdate();
            return(true);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return(false);
    }
    public static boolean Makanan( String ID_Makanan, String Nama, int Jumlah, double Harga){
        conn.connect();
        String query = "INSERT INTO Makanan VALUES (?,?,?,?)";
        try {
            PreparedStatement stmt = conn.con.prepareStatement(query);
            stmt.setString(1, ID_Makanan);
            stmt.setString(2,Nama );
            stmt.setInt(3, Jumlah);
            stmt.setDouble(4,Harga);
            stmt.executeUpdate();
            return(true);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return(false);
    }
    public static boolean Person( String ID_Person,String nama,String Status){
        conn.connect();
        String query = "INSERT INTO Person VALUES (?,?,?)";
        try {
            PreparedStatement stmt = conn.con.prepareStatement(query);
            stmt.setString(1, ID_Person);
            stmt.setString(2, nama);
            stmt.setString(3, Status);
            
            stmt.executeUpdate();
            return(true);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return(false);
    }
}
