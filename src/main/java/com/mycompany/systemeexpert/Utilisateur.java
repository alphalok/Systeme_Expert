/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemeexpert;


public abstract class Utilisateur {
	private boolean IS_EXPERT;
    private String name;
	private String password;
    private int Id;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Utilisateur() {
    }

    public Utilisateur(String name, String password, int Id, String email) {
        this.name = name;
        this.password = password;
        this.Id = Id;
        this.email = email;
    }
    
    public boolean isIS_EXPERT() {
		return IS_EXPERT;
	}

	public void setIS_EXPERT(boolean iS_EXPERT) {
		IS_EXPERT = iS_EXPERT;
	}
    
    
    
}
