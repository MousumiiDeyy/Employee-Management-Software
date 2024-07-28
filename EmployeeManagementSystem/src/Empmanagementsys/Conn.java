/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empmanagementsys;

import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;
    
    public Conn(){
        try{
            //register driver class
          Class.forName("com.mysql.cj.jdbc.Driver");
          //connection string
          c=DriverManager.getConnection("jdbc:mysql:///employeemanagementsystem", "root", "SHIVSHAKTI11");
          s = c.createStatement();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
