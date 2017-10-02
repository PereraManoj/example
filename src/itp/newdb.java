/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itp;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Dumindu
 */
public class newdb {
    public static Connection connect()
    {
       
        try
        {
           Class.forName("com.mysql.jdbc.Driver") ;
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/itp","root","");
           return conn;
           
        }
        catch (Exception e)
                {
                    JOptionPane.showMessageDialog(null, e);
                    return null;
                } 
      }
    
}
