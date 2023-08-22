package Qkart.QkartPageObject;

import org.openqa.selenium.WebDriver;

public class PageObect{

	WebDriver driver;
	public RegistrationPage rp;
	public HomePage hp;
	public LoginPage lp;
	
	public PageObect(WebDriver driver) {
		this.driver=driver;
	}
	
	public RegistrationPage registrationPage() {
		rp= new RegistrationPage(driver);
		return rp;
	}
	
	public HomePage homePage() {
		hp=new HomePage(driver);
		return hp;
	}
	
	public LoginPage loginPage() {
		lp=new LoginPage(driver);
		return lp;
	}
	
}
