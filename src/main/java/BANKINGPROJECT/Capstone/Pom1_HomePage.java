package BANKINGPROJECT.Capstone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom1_HomePage {

@FindBy(xpath ="//button[text()='Customer Login']" )	private WebElement customerLoginBtn;
@FindBy(xpath ="//button[text()='Bank Manager Login']" )  private WebElement managerLoginBtn;
	
public Pom1_HomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}	
public void ClickOnCustomerLogin() {
	customerLoginBtn.click();
}
public void ClickOnManagerLogin() {
	managerLoginBtn.click();
}
	
	
}
