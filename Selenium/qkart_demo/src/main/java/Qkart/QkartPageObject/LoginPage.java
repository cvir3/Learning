package Qkart.QkartPageObject;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Qkart.AbstractComponent.AbstractComponent;

public class LoginPage extends AbstractComponent{
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	private WebElement username;

	@FindBy(id="password")
	private WebElement pwd;

	@FindBy(xpath = "//button[text()='Login to QKart']")
	private WebElement loginButton;

	@FindBy(id="notistack-snackbar")
	private WebElement validation;
	
	@FindBy(xpath="//*[@class='username-text']")
	private WebElement validateName;
	
	public String credential(String uname,String pw) throws InterruptedException {
		visibilityofEle(username);
		element_clearTextbox(username);
		element_sendText(username, uname);
		element_clearTextbox(pwd);
		element_sendText(pwd, pw);
		element_click(loginButton);
		visibilityofEle(validation);
		String valid=validation.getText();
		try {
			if (validateName.isDisplayed()==true) {
				String un=validateName.getText();
				Assert.assertEquals(un, uname);
				System.out.println("Login successfully");
			}	
		} catch (Exception e) {
			// TODO: handle exception
		}
		return valid;
	}
}
