package BANKINGPROJECT.Capstone;

import java.sql.Driver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom5_AddCustomerPage {

	@FindBy(xpath = "//input[@placeholder='First Name']")private WebElement FirstName;
	@FindBy(xpath = "//input[@placeholder='Last Name']")private WebElement LastName;
	@FindBy(xpath = "//input[@placeholder='Post Code']")private WebElement PostCode;
	@FindBy(xpath = "//button[text()='Add Customer']")private WebElement AddcustomerBtn;
	@FindBy(xpath = "(//button[@class='btn btn-lg tab'])[1]") private WebElement OpenAcoountTab;
	public Pom5_AddCustomerPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void Enter_FirstName() {
		FirstName.sendKeys("Shailesh");
	}
	public void Enter_LastName() {
		LastName.sendKeys("Deshmukh");
	}
	public void Enter_PostCode() {
		PostCode.sendKeys("411111");
	}
	public void Click_OnAddCustomerBtn() throws Exception {
		AddcustomerBtn.click();
	}
	public void ClicOn_OpenAccountTab() {
		OpenAcoountTab.click();
	}
}

