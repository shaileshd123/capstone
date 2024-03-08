package BANKINGPROJECT.Capstone;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class TestRunner2 extends edge {
	Pom1_HomePage obj1;
	Pom2_CustomerDashboard obj2;
	Pom3_ManagerLoginDashboard obj3;
	Pom4_CusomerHomePage obj4;
	Pom5_AddCustomerPage obj5;
	Pom6_OpenAccountPage obj6;
	Pom7_CustomerPage obj7;
@BeforeClass
public void setProperty() throws Exception {
	initBrowser();
	 obj1= new Pom1_HomePage(driver);
	 obj2= new Pom2_CustomerDashboard(driver);
	 obj3= new Pom3_ManagerLoginDashboard(driver);
	 obj4= new Pom4_CusomerHomePage(driver);
	 obj5= new Pom5_AddCustomerPage(driver);
	 obj6=new Pom6_OpenAccountPage(driver);
	 obj7= new Pom7_CustomerPage(driver);
}
  @Test
  public void f() throws Exception {
	  
		
	Thread.sleep(2000);
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		obj1.ClickOnCustomerLogin();
		obj2.ClickOnHomePage();
		  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		//Thread.sleep(2000);
		obj1.ClickOnManagerLogin();
		//Thread.sleep(2000);
		  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		obj2.ClickOnHomePage();
		//Thread.sleep(2000);
		  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		obj1.ClickOnCustomerLogin();
		obj2.ClickOnSelectCustomer(driver);
		obj2.ClickOnLoginBtn();
		//Thread.sleep(2000);
		  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		obj4.ClickonDepositTab();
		//Thread.sleep(2000);
		  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		obj4.Enter_DepositAmount();
		obj4.ClickOnDepositButton();
		String ActualText = obj4.Verify_successMessage();
		String ExpectedText="Deposit Successful";
		Assert.assertEquals(ActualText,ExpectedText);
		  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		//Thread.sleep(2000);
		obj4.ClickOnWithdrawField();
		obj4.EnterWithdrawAmount();
		obj4.ClickOnWithdrawBtn();
		obj4.clickOnHomePage();
		obj1.ClickOnManagerLogin();
		obj3.ClickOnAddCustomer();
		  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		//Thread.sleep(2000);
		obj5.Enter_FirstName();
		obj5.Enter_LastName();
		obj5.Enter_PostCode();
		obj5.Click_OnAddCustomerBtn();
		driver.switchTo().alert().accept();
		//Thread.sleep(2000);
		  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		obj5.ClicOn_OpenAccountTab();
		obj6.Select_CustomerName();
		obj6.Select_Currency();
		obj6.Click_OnProcess();
		driver.switchTo().alert().accept();
		obj6.Clickon_CustomersTab();
		  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		//Thread.sleep(2000);
		  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		obj7.SearchName();
		String Actual_CustomerName=obj7.VerifyNameOfCustomer();
		String Expected_CustomerName="Shailesh";
		Assert.assertEquals(Actual_CustomerName, Expected_CustomerName);
  }
  @AfterClass
  public void CloseBrowser() {
	  driver.close();
  }
}
