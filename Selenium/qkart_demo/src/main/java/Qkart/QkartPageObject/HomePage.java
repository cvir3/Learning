package Qkart.QkartPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Qkart.AbstractComponent.AbstractComponent;

public class HomePage extends AbstractComponent{
	WebDriver driver;
	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Register']")
	private WebElement registerButton;
	
	@FindBy(xpath = "//button[text()='Login']")
	private WebElement loginButton;

	public void clickonRegisterPage() {
		visibilityofEle(registerButton);
		element_click(registerButton);
	}
	public void clickonLoginPage() {
		visibilityofEle(loginButton);
		element_click(loginButton);
	}
	
	public void goTo() {
		driver.get("https://crio-qkart-frontend-qa.vercel.app/");
	}
	
}
