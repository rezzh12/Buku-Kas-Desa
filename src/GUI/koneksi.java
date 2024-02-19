/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author TUF GAMING
 */
public class koneksi {
    private static Connection mysqlconfig;
    public static Connection koneksi()throws SQLException{
        try {
            String url="jdbc:mysql://localhost:3306/kas_desa"; //url database
            String user="root"; //user database
            String pass=""; //password database
             Class.forName("com.mysql.cj.jdbc.Driver");
            mysqlconfig=DriverManager.getConnection(url, user, pass);           
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null,"Tidak Connect ke Database"); //perintah menampilkan error pada koneksi
        }
        return mysqlconfig;
    }    
}
