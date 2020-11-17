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
}
