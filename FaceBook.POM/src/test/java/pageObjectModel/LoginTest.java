package pageObjectModel;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
	
	@Test
	public void loginTest() {
		
		LoginPage lp = PageFactory.initElements(driver, LoginPage.class);
		lp.emailField("nyla8128@gmail.com");
		lp.passwordField("password");
		lp.loginButton();
		lp.forgotPasswordButton();
		lp.mobileNumberField("3216549876");
		lp.searchButton();
		lp.noAccessPhrase();
		lp.facebookLogo();
	}

}
