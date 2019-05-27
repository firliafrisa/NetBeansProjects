/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobakoneksi;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

/**
 *
 * @author Lee-PC
 */
public class CobaKoneksi {
//    Connection c;
//    ResultSet r;
//Statement s;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
         Connection c;
    ResultSet r;
Statement s;
        
        try {
            InputStream input = new FileInputStream("src/konek.txt");
            Properties prop = new Properties();
            prop.load(input);
            
            String url = (prop.getProperty("db.url"));
            String user = (prop.getProperty("db.user"));
            String pw = (prop.getProperty("db.password"));
            
//             Class.forName("com.mysql.jdbc.Driver");
//            c=DriverManager.getConnection("jdbc:mysql://localhost/db_tokoif17fx","root","");
//            System.out.println("Koneksi Berhasil");
//            
          Class.forName("com.mysql.jdbc.Driver");
//            
            c=DriverManager.getConnection(url,user,pw);
             System.out.println("Koneksi Berhasil");
            
//            System.out.println(user);
//           System.out.println(url);
        } catch (Exception e) {
          
           System.out.println("Gagal");
           
           System.out.println(e);
            
        }
        
    }
    
}
