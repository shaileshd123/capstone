package BANKINGPROJECT.Capstone;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Pom6_OpenAccountPage {

	@FindBy(xpath = "//select[@id='userSelect']")private WebElement CustomerName;
	@FindBy(xpath = "//select[@id='currency']")private WebElement Currency;
	@FindBy(xpath = "//button[text()='Process']")private WebElement ProcessBtn;
	@FindBy(xpath = "(//button[@class='btn btn-lg tab'])[2]")private WebElement CustomersTab;
	public Pom6_OpenAccountPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void Select_CustomerName() {
		Select s1= new Select(CustomerName);
		s1.selectByVisibleText("Shailesh Deshmukh");
	}
	public void Select_Currency() {
		Select s2= new Select(Currency);
		s2.selectByVisibleText("Rupee");
	}
	public void Click_OnProcess() {
		ProcessBtn.click();
	}
	public void Clickon_CustomersTab() {
		CustomersTab.click();
	}
}
