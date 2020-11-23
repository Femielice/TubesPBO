/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Meja;
import Model.Membership;
import Model.Order;
import Model.Person;
import Model.Reservasi;
import Model.stockMakanan;
import View.screenMembership;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

/**
 *
 * @author A442UF
 */
public class Controller {
    static DatabaseHandler conn = new DatabaseHandler();
    
    public static boolean Reservasi(Reservasi nreservasi){
        conn.connect();
        String query = "INSERT INTO reservasi VALUES (?,?,?,?,?,?)";
        try{
            PreparedStatement stmt = conn.con.prepareStatement(query);
            stmt.setString(1, nreservasi.getID());
            stmt.setString(2, nreservasi.getNama());
            stmt.setString(3, nreservasi.getTanggal_Reservasi());
            stmt.setInt(4, nreservasi.getJumlahOrang());
            stmt.setString(5, nreservasi.getNo_Telp());
            stmt.setString(6, nreservasi.getID_Meja());
            stmt.executeUpdate();
            return(true);
        } catch (SQLException ex) {
            ex.printStackTrace();
            return(false);
        }
    }
    
    public static boolean Membership(Membership member){
        conn.connect();
        String query = "INSERT INTO members VALUES (?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = conn.con.prepareStatement(query);
            stmt.setString(1, member.getID_Member());
            stmt.setString(2, member.getNama());
            stmt.setString(3, member.getNo_Telp());
            stmt.setString(4, member.getTl());
            stmt.setString(5, member.getEmail());
            stmt.setString(6, member.getTanggal_ExpDate());
            stmt.executeUpdate();
            return(true);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return(false);
    }
    
    public static boolean Person(Person persons){
        conn.connect();
        String query = "INSERT INTO person VALUES (?,?)";
        try {
            PreparedStatement stmt = conn.con.prepareStatement(query);
            stmt.setString(1, persons.getID_Person());
            stmt.setString(2, persons.getNama());
            stmt.executeUpdate();
            return(true);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return(false);
    }
    
    public static boolean insertOrder(Order order){
        conn.connect();
        String query = "INSERT INTO orders VALUES (?,?)";
        try {
            PreparedStatement stmt = conn.con.prepareStatement(query);
            stmt.setInt(1, order.getJumlah_Makanan());
            stmt.setInt(1, order.getJumlah_Makanan());
            stmt.executeUpdate();
            return(true);
        } catch (SQLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
            return(false);
        } 
    }
        
    public static Person getPerson(String ID_person){
        conn.connect();
        String query = "SELECT * FROM person WHERE ID_person = '" + ID_person + "'";
        Person person = new Person();
        try{
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                person.setID_Person(ID_person);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return(person);
    }
    
    //SELECT ALL from table meja
    public static ArrayList<Meja> getAllMeja(){
       ArrayList<Meja> meja = new ArrayList<>();
       conn.connect();
       String query = "SELECT * FROM meja";
       try{
           Statement stmt = conn.con.createStatement();
           ResultSet rs = stmt.executeQuery(query);
           while(rs.next()){
               Meja new_meja = new Meja();
               new_meja.setID_Meja(rs.getString("ID_meja"));
           }
       } catch (SQLException ex) {
            ex.printStackTrace();
        }
       return(meja);
    }
    
    
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
                Stock.setHarga(rs.getInt("Harga"));
                stockmakanan.add(Stock);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return(stockmakanan);
    }
//     public static boolean Meja( String ID_Meja,String Jenis_Meja,int No_Meja){
//        conn.connect();
//        String query = "INSERT INTO Meja VALUES (?,?,?,?,?,?)";
//        try {
//            PreparedStatement stmt = conn.con.prepareStatement(query);
//            stmt.setString(1, ID_Meja);
//            stmt.setString(2, Jenis_Meja);
//            stmt.setInt(3, No_Meja);
//            stmt.executeUpdate();
//            return(true);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return(false);
//    }
//     public static boolean Transaksi( double totalHarga, String tanggalPesanan, String metodePembayaran, double Diskon, int ID_Order, int Jumlah_Makanan, String ID_Makanan, String Nama, int Jumlah, double Harga){
//        conn.connect();
//        String query = "INSERT INTO Transaksi VALUES (?,?,?,?,?,?,?,?,?,?)";
//        try {
//            PreparedStatement stmt = conn.con.prepareStatement(query);
//            stmt.setInt(1, ID_Order);
//            stmt.setString(2, tanggalPesanan);
//            stmt.setString(3, Nama);
//            stmt.setString(4, ID_Makanan);
//            stmt.setInt(5, Jumlah_Makanan);
//            stmt.setInt(6, Jumlah);
//            stmt.setString(7, metodePembayaran);
//            stmt.setDouble(8,Diskon);
//            stmt.setDouble(9,Harga);
//            stmt.setDouble(10,totalHarga);
//            stmt.executeUpdate();
//            return(true);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return(false);
//    }
//    public static boolean Order( int ID_Order, int Jumlah_Makanan, String ID_Makanan, String Nama, int Jumlah, double Harga,String StatusOrder){
//        conn.connect();
//        String query = "INSERT INTO Order VALUES (?,?,?,?,?,?,?)";
//        try {
//            PreparedStatement stmt = conn.con.prepareStatement(query);
//            stmt.setInt(1, ID_Order);
//            stmt.setString(2, Nama);
//            stmt.setString(3,ID_Makanan );
//            stmt.setInt(4, Jumlah);
//            stmt.setInt(5, Jumlah_Makanan);
//            stmt.setDouble(6,Harga);
//            stmt.setString(7,StatusOrder );   
//            stmt.executeUpdate();
//            return(true);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return(false);
//    }
//    public static boolean Makanan( String ID_Makanan, String Nama, int Jumlah, double Harga){
//        conn.connect();
//        String query = "INSERT INTO Makanan VALUES (?,?,?,?)";
//        try {
//            PreparedStatement stmt = conn.con.prepareStatement(query);
//            stmt.setString(1, ID_Makanan);
//            stmt.setString(2,Nama );
//            stmt.setInt(3, Jumlah);
//            stmt.setDouble(4,Harga);
//            stmt.executeUpdate();
//            return(true);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return(false);
//    }
}
