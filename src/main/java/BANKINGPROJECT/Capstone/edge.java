package BANKINGPROJECT.Capstone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;



public class edge {

	
	WebDriver driver;
	public void initBrowser() throws Exception {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\eclipse-workspace\\BCG1\\src\\test\\resources\\msedgedriver.exe");

		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get(Utility_Properties.GetData("url"));
		}
}
