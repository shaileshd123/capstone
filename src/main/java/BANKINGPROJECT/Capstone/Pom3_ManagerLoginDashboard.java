package BANKINGPROJECT.Capstone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom3_ManagerLoginDashboard {

	@FindBy(xpath = "//button[text()='Home']")private WebElement HomeBtn2;
	@FindBy(xpath = "(//button[@class='btn btn-lg tab'])[1]")private WebElement AddCustomerBtn;
	public Pom3_ManagerLoginDashboard(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void ClickOnHomeBtn2() {
		HomeBtn2.click();
	}
	public void ClickOnAddCustomer() {
		AddCustomerBtn.click();
	}
	
}
