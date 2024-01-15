/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemeexpert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author elhou
 */
public class MyConnection {
    
     private static Connection connection;
     
     public static Connection getConnection() {
        
        if(connection==null){
            try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/systeme_expert","root","");
            
        }catch(Exception e){
            System.out.println(e.getMessage());
          
        } }
        return connection;
    }
     
     
     public static HashMap<String,String> databaseSnapshot(){
         
        HashMap<String,String> snapshot = new HashMap<String,String>();
        snapshot.clear();
        PreparedStatement ps;
        ResultSet rs;
        String query ="SELECT * FROM `reglesfait` WHERE `Fait`!=''";
        
    
        try {
                ps = MyConnection.getConnection().prepareStatement(query);
                rs = ps.executeQuery();
                
                
                
                while (rs.next()) {
                    snapshot.put(rs.getString("Regles"),rs.getString("Fait"));   
                }    
             }catch (SQLException ex) {
                
            } 
        return snapshot;
    }
     
     public static ArrayList<String> nouveauRegles(){
         
        ArrayList<String> nouveauRegles = new ArrayList<String>();
        nouveauRegles.clear();
        PreparedStatement ps;
        ResultSet rs;
        String query ="SELECT * FROM `reglesfait` WHERE `Fait`='' ";
        
    
        try {
                ps = MyConnection.getConnection().prepareStatement(query);
                rs = ps.executeQuery();
                
                
                
                while (rs.next()) {
                    nouveauRegles.add(rs.getString("Regles"));   
                }    
             }catch (SQLException ex) {
                
            } 
        return nouveauRegles;
    } 
     
    
    
}
