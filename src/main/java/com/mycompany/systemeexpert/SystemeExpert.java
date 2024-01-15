/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.systemeexpert;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author elhou
 */
public class SystemeExpert {
     private static Connection connection;

    public static void main(String[] args) {
        ArrayList<String> fait = new ArrayList<String>();
        
        connection=MyConnection.getConnection();
        
        
        PreparedStatement ps;
        ResultSet rs;
        String query ="SELECT * FROM `reglesfait`";
        
    
        try {
                ps = MyConnection.getConnection().prepareStatement(query);
                
                
                rs = ps.executeQuery();
                
                
                
                while (rs.next()) {
                      fait.add(rs.getString("NAME"));
                }    
             }catch (SQLException ex) {
                 System.err.println(ex);
                
            } 
        
        System.out.println("Hello World!");
        System.out.println(fait);
    }
}
