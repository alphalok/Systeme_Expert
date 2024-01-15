/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemeexpert;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

/**
 *
 * @author elhou
 */
public class User extends Utilisateur{
	 private static final Logger logger = Logger.getLogger(Utilisateur.class.getName());

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String name, String password, int Id, String email) {
		super(name, password, Id, email);
		// TODO Auto-generated constructor stub
	}
	
	public String status() {
        return this.getName()+" is not an expert";
    }
	
    
    
    
}
