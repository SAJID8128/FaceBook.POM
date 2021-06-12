package pageObjectModel;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageConstructor extends BaseTest{

	WebDriver driver;

	public LoginPageConstructor(WebDriver driver) { this.driver = driver;
	PageFactory.initElements(driver, this); }

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

	@Test(priority = 1,  groups= {"smoke","regression"})
	public WebElement emailField(String mail) {
		email.sendKeys(mail);
		System.out.println("email field test");
		return email;
	}

	@Test(priority = 2,  groups= {"smoke","regression"}, dependsOnMethods= {"emailField"})
	public WebElement passwordField(String pass) throws InterruptedException {
		password.sendKeys(pass);
		Thread.sleep(1000);
		System.out.println("password field test");
		return password;
	}

	@Test(priority = 3,  groups= {"smoke","regression"})
	public WebElement loginButton() throws InterruptedException {
		login.click();
		Thread.sleep(1000);
		System.out.println("login button test");
		return login;
	}

	@Test(priority = 4,  groups= {"smoke","regression"})
	public WebElement forgotPasswordButton() throws InterruptedException {
		forgotPassword.click();
		Thread.sleep(1000);
		System.out.println("forgotPassword button test");
		return forgotPassword;
	}

	@Test(priority = 5,  groups= {"smoke","regression"})
	public WebElement mobileNumberField(String mobile) throws InterruptedException {
		mobileNumber.sendKeys(mobile);
		Thread.sleep(1000);
		System.out.println("mobileNumber field test");
		return mobileNumber;
	}

	@Test(priority = 6,  groups= {"smoke","regression"}, dependsOnMethods= {"mobileNumberField"})
	public WebElement searchButton() throws InterruptedException {
		search.click();
		Thread.sleep(1000);
		System.out.println("search button test");
		return search;
	}

	@Test(priority = 7,  groups= {"smoke","regression"})
	public WebElement noAccessPhrase() throws InterruptedException {
		noAccess.click();
		Thread.sleep(1000);
		System.out.println("noAccess phrase test");
		return noAccess;
	}

	@Test(priority = 8,  groups= {"smoke","functional"})
	public WebElement facebookLogo() throws InterruptedException {
		facebook.click();
		Thread.sleep(1000);
		System.out.println("facebook logo test");
		return facebook;
	}

}
