package Qkart.QkartPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Qkart.AbstractComponent.AbstractComponent;

public class RegistrationPage extends AbstractComponent{
	WebDriver driver;
	public RegistrationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "username")
	private WebElement username;
	
	@FindBy(id = "password")
	private WebElement pwd;

	@FindBy(id = "confirmPassword")
	private WebElement confirmpwd;
	
	@FindBy(xpath="//button[text()='Register Now']")
	private WebElement registrationButton;
	
	@FindBy(id="notistack-snackbar")
	private WebElement validation;
	
	public String registration(String uname,String pw,String cpw) throws InterruptedException {
		visibilityofEle(username);
		element_clearTextbox(username);
		element_sendText(username, uname);
		element_clearTextbox(pwd);
		element_sendText(pwd, pw);
		element_clearTextbox(confirmpwd);
		element_sendText(confirmpwd, cpw);
		element_click(registrationButton);
		visibilityofEle(validation);
		String alert=validation.getText();
		return alert;
	}

}
