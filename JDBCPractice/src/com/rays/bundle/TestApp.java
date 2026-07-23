package com.rays.bundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class TestApp {
	
	public static void main(String[] args) {
		
		ResourceBundle rb = ResourceBundle.getBundle("Bundle.app");
		
		String driver = rb.getString("driver");
		
		String url = rb.getString("url");
		
		String username = rb.getString("username");
		
		String password = rb.getString("password");
		
		System.out.println(driver + "\n"+ url+"\n"+username+"\n"+password);
		
		rb = ResourceBundle.getBundle("Bundle.app", new Locale("hi"));
		System.out.println(rb.getString("greeting"));  
		
	}

}