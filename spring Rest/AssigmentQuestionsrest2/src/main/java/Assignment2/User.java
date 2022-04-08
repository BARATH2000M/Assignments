package Assignment2;


import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class User {
	private String username;
	private String password;

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean checkdata(String username,String password) {
		if(username.equals("Barath")&password.equals("Barath")) {	
			return true;
		}
		else if(username.equals("Roshan")&password.equals("Roshan")) 
			return true;
			return false;
		
}
}