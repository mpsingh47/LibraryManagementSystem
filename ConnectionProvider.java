/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
import java.sql.*;

/**
 *
 * @author KApoor
 */
public class ConnectionProvider {
    public static Connection getCon()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
//            Connection con=DriverManager.getConnection("https://localhost/phpmyadmin/librarymanagementsystem","root","");
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/librarymanagementsystem", "root", "");
            return con;
        }
        catch(Exception e)
        {
            System.out.println(e);
            return null;
        }
    }
    
}
