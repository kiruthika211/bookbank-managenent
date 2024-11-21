/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.DriverManager;
import java.sql.Connection;


/**
 *
 * @author jananishanmugi
 */
public class ConnectionProvider{
    
    
    public static Connection getCon()
    {
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/l","root","janani");
            return con;
        }catch(Exception ex)
        {
            System.out.println(ex);
            return null;
        }
            
          
        
    }

    
}

