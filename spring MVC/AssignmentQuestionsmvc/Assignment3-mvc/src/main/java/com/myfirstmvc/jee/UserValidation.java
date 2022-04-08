package com.myfirstmvc.jee;

public class UserValidation {
	
	public boolean isUserValid(String user, String password) {
		if ((user.equals("Barath")) && (password.equals("Barath"))) {
			return true;
		}
		
		else {
			return false;
		}
		
		
	}
	

}
