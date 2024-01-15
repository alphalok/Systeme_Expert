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
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
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
            Properties properties = new Properties();
            try (FileReader reader = new FileReader("database.properties")) {
                properties.load(reader);
            }
            String url = properties.getProperty("db.url");
            String user = properties.getProperty("db.user");
            String password = properties.getProperty("db.password");

            connection = DriverManager.getConnection(url, user, password);
        }catch(Exception e){
            System.out.println(e.getMessage());
          
        } }
        return connection;
    }
     
     
     public static HashMap<String,String> databaseSnapshot(){
         
        HashMap<String,String> snapshot = new HashMap<String,String>();
        snapshot.clear();
        PreparedStatement ps =null;
        ResultSet rs = null;
        String query ="SELECT * FROM `reglesfait` WHERE `Fait`!=''";
        
    
        try {
                ps = MyConnection.getConnection().prepareStatement(query);
                rs = ps.executeQuery();
                
                
                
                while (rs.next()) {
                    snapshot.put(rs.getString("Regles"),rs.getString("Fait"));   
                }    
             }catch (SQLException ex) {
                
            }finally {
            	try {
            		if(ps !=null && !ps.isClosed()) {
            			ps.close();
            		}
            		if(rs !=null && !rs.isClosed()) {
            			rs.close();
            		}
            	}catch (Exception e) {
            		System.out.println(e);
				}
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
