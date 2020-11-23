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
public class Person {
    private String ID_Person;
    private String Nama;
    
    public Person() {
    }

    public void setID_Person(String ID_Person) {
        this.ID_Person = ID_Person;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getID_Person() {
        return ID_Person;
    }

    public String getNama() {
        return Nama;
    }  
}
