package Qkart.TestComponent;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import Qkart.QkartPageObject.HomePage;
import Qkart.QkartPageObject.PageObect;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	public WebDriver driver;
	public PageObect po;

	public WebDriver initializeBrowser() throws IOException {

		FileInputStream fis = new FileInputStream(
				"/Users/virenchauhan/Downloads/Qkart/src/test/resources/Global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String browserName =System.getProperty("browser")!=null ? System.getProperty("browser") : prop.getProperty("browser");
		if (browserName.contains("chrome")) {
			WebDriverManager.chromedriver().browserVersion("113.0.5672.93").setup();
			// System.setProperty("webdriver.chrome.driver",
			// "C:\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.contains("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		} else if (browserName.contains("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		return driver;
	}

	@BeforeMethod
	public void setUp() throws IOException {
		initializeBrowser();
		po=new PageObect(driver);
		po.homePage().goTo();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	@DataProvider
	public Object[][] getData() throws IOException {
		List<HashMap<String ,String>> map=getJsonData("/Users/virenchauhan/Downloads/Qkart/src/test/java/Qkart/Data/RegistratonDetails.json");
		return new Object[][] { { map.get(0) },{ map.get(1) },{ map.get(2) },{ map.get(3) },{ map.get(4) },{ map.get(5) } };
	}
	
	@DataProvider
	public Object[][] getDataLogin() throws IOException {
		List<HashMap<String ,String>> map=getJsonData("/Users/virenchauhan/Downloads/Qkart/src/test/java/Qkart/Data/LoginDetails.json");
		return new Object[][] { { map.get(0) },{ map.get(1) },{ map.get(2) },{ map.get(3) } };
	}

	public List<HashMap<String,String>> getJsonData(String filePath) throws IOException {
		String jasonContent= FileUtils.readFileToString(new File(filePath),StandardCharsets.UTF_8);
		ObjectMapper mapper=new ObjectMapper();
		List<HashMap<String ,String>> data= mapper.readValue(jasonContent, new TypeReference<List<HashMap<String ,String>>>() {
		});
		
		return data;
	}
	
	public String getScreenShot(String testCase,WebDriver driver) throws IOException {
		TakesScreenshot tc = (TakesScreenshot) driver;
		File src = tc.getScreenshotAs(OutputType.FILE);
		File destination = new File(System.getProperty("user.dir") + "//report//" + testCase + ".png");
		FileUtils.copyFile(src, destination);
		return System.getProperty("user.dir") + "//report//" + testCase + ".png";
	}
}
