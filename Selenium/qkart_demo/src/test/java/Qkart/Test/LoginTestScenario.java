package Qkart.Test;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import Qkart.TestComponent.BaseTest;

public class LoginTestScenario extends BaseTest{
	@Test(dataProvider = "getDataLogin")
	public void testLogin(HashMap<String, String> input) throws InterruptedException{
		// TODO Auto-generated method stub
		po.homePage().clickonLoginPage();
		String val=po.loginPage().credential(input.get("uname"), input.get("pwd"));
		System.out.println(val);
		Assert.assertEquals(val, input.get("val"));
	}

}
