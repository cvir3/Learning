package Qkart.Test;


import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import Qkart.TestComponent.BaseTest;

public class RegistrationTest extends BaseTest{

	@Test(dataProvider = "getData")
	public void testRegistration(HashMap<String, String> input) throws InterruptedException{
		// TODO Auto-generated method stub
		po.homePage().clickonRegisterPage();
		String val=po.registrationPage().registration(input.get("uname"), input.get("pwd"), input.get("cpwd"));
		System.out.println(val);
		Assert.assertEquals(val, input.get("val"));
	}

}
