package BANKINGPROJECT.Capstone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom4_CusomerHomePage {

	@FindBy(xpath = "(//button[@class='btn btn-lg tab'])[2]")private WebElement DepositField;
	@FindBy(xpath = "//input[@class='form-control ng-pristine ng-untouched ng-invalid ng-invalid-required']")private WebElement AmountText;
	@FindBy(xpath = "//button[text()='Deposit']")private WebElement DepositBtn;
	@FindBy(xpath = "//span[text()='Deposit Successful']")private WebElement SuccessMessage;
	@FindBy(xpath = "(//button[@class='btn btn-lg tab'])[2]")private WebElement WithdrawField;
	@FindBy(xpath = "//input[@class='form-control ng-pristine ng-untouched ng-invalid ng-invalid-required']")private WebElement WithdrawAmount;
	@FindBy(xpath = "//button[text()='Withdraw']")private WebElement Withdrawbtn;
	@FindBy(xpath = "//button[text()='Home']") private WebElement HomeBtn_customerpage;
	public Pom4_CusomerHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void ClickonDepositTab() {
		DepositField.click();
	}
	public void Enter_DepositAmount() throws Exception {
		AmountText.sendKeys("2000");
		Thread.sleep(2000);
	}
	public void ClickOnDepositButton() throws Exception {
		DepositBtn.click();
		Thread.sleep(2000);
	}
	public String Verify_successMessage() {
		String ActText = SuccessMessage.getText();
		return ActText;
	}
	public void ClickOnWithdrawField() throws Exception {
	
		WithdrawField.click();
	}
	public void EnterWithdrawAmount() throws Exception {
		
		WithdrawAmount.sendKeys("1000");
	}
	public void ClickOnWithdrawBtn() {
		Withdrawbtn.click();
	}
	public void clickOnHomePage() throws Exception {
		Thread.sleep(2000);
		HomeBtn_customerpage.click();
	}
	
	
}
