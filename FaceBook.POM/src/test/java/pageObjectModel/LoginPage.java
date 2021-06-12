package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	WebDriver driver;
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement email;
	
	@FindBy(xpath="//input[@id='pass']")
	private WebElement password;
	
	@FindBy(xpath="//button[@id='loginbutton']")
	private WebElement login;
	
	@FindBy(xpath="//a[contains(text(),'Forgot Password?')]")
	private WebElement forgotPassword;
	
	@FindBy(xpath="//input[@id='identify_email']")
	private WebElement mobileNumber;
	
	@FindBy(xpath="//button[@id='did_submit']")
	private WebElement search;
	
	@FindBy(xpath="//a[contains(text(),'No longer have access to these?')]")
	private WebElement noAccess;
	
	@FindBy(xpath="//*[@id=\"blueBarDOMInspector\"]/div/div/div/div[1]/h1/a/i")
	private WebElement facebook;
	
	
	/*public LoginPage(WebDriver driver, WebElement email, WebElement password, WebElement login,
			WebElement forgotPassword, WebElement mobileNumber, WebElement search, WebElement noAccess,
			WebElement cannotEmail, WebElement facebook) {
		super();
		this.driver = driver;
		this.email = email;
		this.password = password;
		this.login = login;
		this.forgotPassword = forgotPassword;
		this.mobileNumber = mobileNumber;
		this.search = search;
		this.noAccess = noAccess;
		this.facebook = facebook;
	}*/

	public WebElement emailField(String eF) {
		email.sendKeys(eF);
		System.out.println("email field test");
		return email;
	}
	
	public WebElement passwordField(String pF) {
		password.sendKeys(pF);
		System.out.println("password field test");
		return password;
		
	}
	
	public WebElement loginButton() {
		login.click();
		System.out.println("login button test");
		return login;
	}
	
	public WebElement forgotPasswordButton() {
		forgotPassword.click();
		System.out.println("forgotPassword button test");
		return forgotPassword;
	}
	
	public WebElement mobileNumberField(String mNF) {
		mobileNumber.sendKeys(mNF);
		System.out.println("mobileNumber field test");
		return mobileNumber;
	}
	
	public WebElement searchButton() {
		search.click();
		System.out.println("search button test");
		return search;
	}
	
	public WebElement noAccessPhrase() {
		noAccess.click();
		System.out.println("noAccess phrase test");
		return noAccess;
	}
	
	public WebElement facebookLogo() {
		facebook.click();
		System.out.println("facebook logo test");
		return facebook;
	}
	
	

}
