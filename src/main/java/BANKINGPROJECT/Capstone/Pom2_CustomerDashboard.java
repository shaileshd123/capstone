package BANKINGPROJECT.Capstone;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom2_CustomerDashboard {

	@FindBy(xpath = "//button[text()='Home']") private WebElement HomeBtn;
	@FindBy(xpath = "//select[@id='userSelect']") private WebElement SelectCustomer;
	@FindBy(xpath = "//button[text()='Login']")private WebElement LoginBtn;
	public Pom2_CustomerDashboard(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void ClickOnHomePage() {
		HomeBtn.click();
	}
	public void ClickOnSelectCustomer(WebDriver driver) {
		Actions act = new Actions(driver);
		act.moveToElement(SelectCustomer).click().sendKeys(Keys.DOWN).click().build().perform();
	}
	public void ClickOnLoginBtn() {
		LoginBtn.click();
	}
}
