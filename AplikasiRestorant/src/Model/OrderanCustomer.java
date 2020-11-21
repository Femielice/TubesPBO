/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author willi
 */
public class OrderanCustomer {
    String ID_orderanCust;
    String ID_Makanan;
    String ID_Minuman;
    
    
    public OrderanCustomer(){
        
    }
    
    public OrderanCustomer (String ID_orderanCust){
        this.ID_orderanCust = ID_orderanCust;
        this.ID_Makanan = ID_Makanan;
        this.ID_Minuman = ID_Minuman;
    }
}
