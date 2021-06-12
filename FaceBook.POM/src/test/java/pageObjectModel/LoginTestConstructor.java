package pageObjectModel;

import org.testng.annotations.Test;

public class LoginTestConstructor extends BaseTest{
		
	@Test
	public void loginTest() throws InterruptedException {
		
		 LoginPageConstructor lpc = new LoginPageConstructor(driver);
		  lpc.emailField("nyla8128@gmail.com"); 
		  lpc.passwordField("password");
		  lpc.loginButton(); 
		  lpc.forgotPasswordButton();
		  lpc.mobileNumberField("8623454321"); 
		  lpc.searchButton();
		  lpc.noAccessPhrase(); 
		  lpc.facebookLogo();
		
	}
	
}
