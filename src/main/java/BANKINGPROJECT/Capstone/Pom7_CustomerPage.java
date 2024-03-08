package BANKINGPROJECT.Capstone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom7_CustomerPage {

	
	@FindBy(xpath = "//input[@placeholder='Search Customer']")private WebElement SearchField;
	@FindBy(xpath = "//td[text()='Shailesh']") private WebElement Name;
	public Pom7_CustomerPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void SearchName() {
		SearchField.sendKeys("Shailesh");
	}
	public String VerifyNameOfCustomer() {
		String ActText = Name.getText();
		return ActText;
	}
	
}
