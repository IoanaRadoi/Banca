/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package banca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class Main {
    static Connection con;
    static Statement st;
    
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/bazadedate1","root","");
        st = con.createStatement();
        AddCardFrame f = new AddCardFrame();
        f.setVisible(true);
    }
}
