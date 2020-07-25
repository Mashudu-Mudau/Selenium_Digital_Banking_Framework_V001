package commands;


import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.MediaEntityBuilder;

import DBank.webElement_Repository.CheckAccountViewPage;
import DBank.webElement_Repository.SavingsAccountViewPage;
import DBank.webElement_Repository.WithdrawalTransactionPage;
import config.StartBrowser;


public class ActionDriver {
	
	WebDriver driver;
	
	public ActionDriver() {
		driver = StartBrowser.driver;
	}
	
	public void navigateToApplication(String url) throws IOException {
		try {
			driver.get(url);
			StartBrowser.childTest.pass("Successfully navigated to : " +url);
		}
		catch (Exception e) {
			StartBrowser.childTest.fail("Unable to navigated to : " +url,MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot()).build());
			StartBrowser.childTest.info(e);
		}
		
	}
	
	
	public void click(By locator, String eleName) throws IOException {
		try {
			driver.findElement(locator).click();
			StartBrowser.childTest.pass("Successfully clicked on : " +eleName);
		}
		catch (Exception e){
			StartBrowser.childTest.fail("Unable to click on : " +eleName ,MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot()).build());
			StartBrowser.childTest.info(e);
		}
		
	}
	
	public void enter_txt(By locator, String text, String eleName) throws IOException {
		
		try {
			driver.findElement(locator).sendKeys(text);
			StartBrowser.childTest.pass("Successfully entered : " +eleName + " With : "+text);
		}
		catch (Exception e){
			StartBrowser.childTest.fail("Unable to enter text in : " +eleName + " With data : "+text ,MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot()).build());
			StartBrowser.childTest.info(e);

		}
	}
	
	
	public void selectDropDown(By locator, int val, String txt) throws IOException {
		WebElement dropElement;
		try{
			dropElement = driver.findElement(locator);
			
			Select element = new Select(dropElement);
			
			element.selectByIndex(val);
			
			 String ele = driver.findElement(locator).getAttribute("25111");
			 
 			StartBrowser.childTest.pass("Successfully selected " +ele+" from drop down list ");
		}
		catch(Exception e) {
			StartBrowser.childTest.fail("Unable to Select dropdown element from drop down list ",MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot()).build());		 
			StartBrowser.childTest.info(e);			
		}
		
		 
	}
	
	
	public String getAmount(By locator,String eleName) throws IOException {
		try {
			
			
			eleName = driver.findElement(locator).getText();
			
		}
		catch (Exception e){
			StartBrowser.childTest.fail("Unable to enter Withdraw Amount ",MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot()).build());		 
			StartBrowser.childTest.info(e);
		}
		return eleName;
	}
	
	
	
	
	
	public void captureElement(By locator,String testCase ,String eleName) throws IOException {
		try {
			String url = driver.getCurrentUrl();
			StartBrowser.childTest.pass("Successfully navigated to : " +url,MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot()).build());	
			eleName = driver.findElement(locator).getText();
			
		}
		catch (Exception e){
			StartBrowser.childTest.fail("Unsuccessful Page " +eleName +" Verification. element Not Found : ",MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot()).build());		 
			StartBrowser.childTest.info(e);
		}
	}
	
	public void verifyWithdrawalValidation() throws IOException {
		 
			try {
				 String withdrawalAmount = driver.findElement(CheckAccountViewPage.withdraw_txt2).getText();
				 String currentSavingsBalance = driver.findElement(CheckAccountViewPage.currentBalance).getText();
				 String balanceBroughtForward = driver.findElement(CheckAccountViewPage.balanceBroughtForward).getText();
				 
				 withdrawalAmount = withdrawalAmount.replaceAll("[$][-]", "");
				 balanceBroughtForward = balanceBroughtForward.substring(1);
				 currentSavingsBalance = currentSavingsBalance.replaceAll("[$]", "");
				 
				 double currentSavingsBalanceDouble = Double.parseDouble(currentSavingsBalance);
				 double balanceBroughtForwardDouble = Double.parseDouble(balanceBroughtForward);
				 double withdrawalAmountDouble = Double.parseDouble(withdrawalAmount);
				
				 
				 double expectedBalaceBroughtForward = (currentSavingsBalanceDouble - withdrawalAmountDouble);
				 double actualBalaceBroughtForward = balanceBroughtForwardDouble ;
				
				 System.out.println(currentSavingsBalanceDouble); 
				 System.out.println(withdrawalAmountDouble);
				 
				System.out.println(expectedBalaceBroughtForward);
				System.out.println(actualBalaceBroughtForward);
				
				
					if (expectedBalaceBroughtForward  == actualBalaceBroughtForward) {
						 StartBrowser.childTest.fail("Withdrawal Validation Failed!  " +currentSavingsBalanceDouble+" -  "+withdrawalAmountDouble+" =  "+balanceBroughtForwardDouble);
					}
				
			}
			catch (Exception e){
				StartBrowser.childTest.pass("Successfully Validated Insufficient Withdrawal Funds Transaction  : ",MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot()).build());		 
				
			}
		
	}
	
	public void verifyDepositValidation() throws IOException {
		 
		 
		 String deposit_txt2 = driver.findElement(SavingsAccountViewPage.withdrawal_txt2).getText();
		 String currentSavingsBalance = driver.findElement(SavingsAccountViewPage.currentBalance).getText();
		 String balanceBroughtForward = driver.findElement(SavingsAccountViewPage.balanceBroughtForward).getText();
		 
		 deposit_txt2 = deposit_txt2.replaceAll("[$]", "");
		 balanceBroughtForward = balanceBroughtForward.substring(1);
		 currentSavingsBalance = currentSavingsBalance.replaceAll("[$]", "");
		 
		 double currentSavingsBalanceDouble = Double.parseDouble(currentSavingsBalance);
		 double balanceBroughtForwardDouble = Double.parseDouble(balanceBroughtForward);
		 double depositAmountDouble = Double.parseDouble(deposit_txt2);
		
		 
		 double expectedBalaceBroughtForward = (currentSavingsBalanceDouble + depositAmountDouble);
		 double actualBalaceBroughtForward = balanceBroughtForwardDouble ;
		
		 System.out.println(currentSavingsBalanceDouble); 
		 System.out.println(depositAmountDouble);
		 
		System.out.println(expectedBalaceBroughtForward);
		System.out.println(actualBalaceBroughtForward);
		
		
			if (expectedBalaceBroughtForward  == actualBalaceBroughtForward) {
				 StartBrowser.childTest.fail("Withdrawal Validation Failed! " +currentSavingsBalanceDouble+" + "+depositAmountDouble+" = "+balanceBroughtForwardDouble);
			}
			else {
			 StartBrowser.childTest.pass("Successfully Verified Expected Deposit Transaction Balance Of: " +currentSavingsBalanceDouble+" + "+depositAmountDouble+" = "+balanceBroughtForwardDouble+"   "+" With Actual Deposit Transaction ",MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot()).build());
			}
	
		 
		
	}
	
	public void mouseHover(By locator) {
		Actions a = new Actions(driver);
		WebElement mo = driver.findElement(locator);
		a.moveToElement(mo).build().perform();
	
	}
	
	
	


	
	public String screenShot(){
		
		return((TakesScreenshot) driver) .getScreenshotAs(OutputType.BASE64);
	}
	
	public void wait_s() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

}

	

