/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemeexpert;

import java.util.logging.Logger;


public class Expert extends Utilisateur{
	 private static final Logger logger = Logger.getLogger(Utilisateur.class.getName());

	public Expert() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Expert(String name, String password, int Id, String email) {
		super(name, password, Id, email);
		// TODO Auto-generated constructor stub
	}
    
    
	public String status() {
        return this.getName()+" is an expert";
    }
	
	
}
