package com.test;

public class RoundOFF {
	
	
	
	String create_new_account = "//p[@id='signup']/a";
	String email_id = "//div[@id='email-box']/input";
	String password_ID = "//div[@id='password-box']/input";
	String submit_now_button = "//button[@id='submit']";
	
	
	
	
	
	static int intialValue = 20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//long num = Math.round(11.5);
		System.out.println("first: 20");
		//long number = 20+5;
		//System.out.println("Added number" + number);
		int num = (int) Math.ceil(11.6);
		
		int logged = intialValue + num;
		System.out.println(logged);
		//randomWithRange(10,99);
	}
	  static int randomWithRange(int min, int max)
	  {
	     int range = (max - min) + 1;     
	     return (int)(Math.random() * range) + min;
	  }

}





