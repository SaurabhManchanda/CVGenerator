/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import java.awt.Graphics2D;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author VCI
 */
public class myconnection {
 
    Connection db;
    public myconnection()
    {
        try
        {
            
          // Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver");
           //db=DriverManager.getConnection("jdbc:microsoft:sqlserver://VCI-PC\\Sqlexpress/dbtest","","");
           //com.mysql.jdbc.Driver
            Class.forName("com.mysql.jdbc.Driver");
            db=DriverManager.getConnection("jdbc:mysql://localhost/cvproject", "root","");
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
            
        }
        catch(ClassNotFoundException e)
        {
              System.out.println(e.getMessage());
        }
        
        
    }
}
