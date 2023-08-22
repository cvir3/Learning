package Qkart.AbstractComponent;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractComponent {
	WebDriver driver;

	public AbstractComponent(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void javascriptE(WebElement ele) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", ele);
	}

	public void visibilityofEle(WebElement ele) {
		try {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(ele));
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Element not visible");
		}
	}

	public void element_click(WebElement ele) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOf(ele)).click();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Element not Clickable" + ele);
		}
	}
	public void element_sendText(WebElement ele,String text) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOf(ele)).sendKeys(text);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Text not to be send in textbox" + text);
		}
	}
	
	public void element_clearTextbox(WebElement ele) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOf(ele)).clear();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Text box not cleared" );
		}
	}
}
