package reusables;

import java.io.IOException;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.MediaEntityBuilder;

import DBank.webElement_Repository.CheckAccountViewPage;
import DBank.webElement_Repository.DepositTransactionPage;
import DBank.webElement_Repository.HomePage;
import DBank.webElement_Repository.LoginPage;
import DBank.webElement_Repository.MenuTab;
import DBank.webElement_Repository.NewAccountRegistrationPage;

import DBank.webElement_Repository.SavingsAccountViewPage;

import DBank.webElement_Repository.UserAuthenticationPage;
import DBank.webElement_Repository.WithdrawalTransactionPage;
import Utilities.Xls_Reader;
import commands.ActionDriver;
import config.StartBrowser;

	public class ReUsableMethods {
		public Xls_Reader reader;
		WebDriver driver;
		ActionDriver aDriver;
		
	public ReUsableMethods() {
		driver = StartBrowser.driver;
		aDriver = new ActionDriver();
		reader = new Xls_Reader("TestData/data.xlsx");
		
	}
	
	
	public String randomstring() {
		String generatedstring = RandomStringUtils.randomAlphanumeric(6,9);
		return(generatedstring);
	}
	
	public String randomstring2() {
		String generatedstring = RandomStringUtils.randomNumeric(4, 4);
		return(generatedstring);
	}
	
	public String randomstring3() {
		String generatedstring = RandomStringUtils.randomNumeric(5, 5);
		return(generatedstring);
	}
	
	public void TC01_Registration() throws IOException, InterruptedException {
		 ActionDriver aDriver = new ActionDriver();
		 StartBrowser.childTest = StartBrowser.parentTest.createNode("TC01_Verify Successful User Registration With Valid Email ID");
		  aDriver.navigateToApplication("http://dbankdemo.com");
		  Thread.sleep(2500);
		  aDriver.click(LoginPage.signUpLink,"Sign Up Button");
		  Thread.sleep(2500);
		  aDriver.selectDropDown(NewAccountRegistrationPage.customerTitle, 1,"Customer Title");
		  Thread.sleep(2500);
			 aDriver.enter_txt(NewAccountRegistrationPage.customerFirstName, reader.getCellData("Sheet1", "firstname", 2), "FirstName Field");
			 Thread.sleep(2500);
			 aDriver.enter_txt(NewAccountRegistrationPage.customerLastName, reader.getCellData("Sheet1", "lastname", 2), "LastName Field");
			 aDriver.click(NewAccountRegistrationPage.radiomaleTitle, "Male Gender Title");
			 Thread.sleep(2500);
			 aDriver.enter_txt(NewAccountRegistrationPage.customerDateOfBirth, "09/10/1995","Date Of Birth");
			 Thread.sleep(2500);
			 aDriver.enter_txt(NewAccountRegistrationPage.customerSSNID, "254-98-"+randomstring2(),"Social Security Number");
			 Thread.sleep(2500);
			 aDriver.enter_txt(NewAccountRegistrationPage.customerEmail,randomstring()+"@gmail.com", "email Address");
			 
			
			 aDriver.enter_txt(NewAccountRegistrationPage.customerPassword, reader.getCellData("Sheet1", "password", 2), "Password Field");
			 aDriver.enter_txt(NewAccountRegistrationPage.customerConfirmPassword, reader.getCellData("Sheet1", "password", 2), "Confirm Password Field");
			 Thread.sleep(2500);
			 aDriver.click(NewAccountRegistrationPage.btnNext, "Sign up for New Account");
			 Thread.sleep(2500);
			 
			 aDriver.enter_txt(NewAccountRegistrationPage.customerAddress,reader.getCellData("Sheet1", "address1", 2), "Street Address");
			 Thread.sleep(2500);
			 aDriver.enter_txt(NewAccountRegistrationPage.customerLocality, reader.getCellData("Sheet1", "city", 2), "City Name");
			 
			 aDriver.enter_txt(NewAccountRegistrationPage.customerRegion, reader.getCellData("Sheet1", "Rigion", 2), "Rigion Name");
			 
			 aDriver.enter_txt(NewAccountRegistrationPage.customerPostalCode, reader.getCellData("Sheet1", "postalCode", 2), "Postal Code");
			 
			 aDriver.enter_txt(NewAccountRegistrationPage.customerCountry, reader.getCellData("Sheet1", "state", 2), "Country Name");
			 
			 aDriver.enter_txt(NewAccountRegistrationPage.customerHomePhone, reader.getCellData("Sheet1", "Hphone", 2), "Home Contact Details");
			 Thread.sleep(2500);
			 aDriver.enter_txt(NewAccountRegistrationPage.customerMobilePhone, reader.getCellData("Sheet1", "Mphone", 2), "Mobile Contact Details");
			 Thread.sleep(2500);
			 aDriver.enter_txt(NewAccountRegistrationPage.customerWorkPhone, reader.getCellData("Sheet1", "Wphone", 2), "Work Contact Details");
			 Thread.sleep(2500);
			 aDriver.click(NewAccountRegistrationPage.customerAgreeTerms, "Agree Terms");
			 Thread.sleep(2500);
			 aDriver.click(NewAccountRegistrationPage.btnRegister, "Register Button");
			 Thread.sleep(2500);
			 aDriver.captureElement(NewAccountRegistrationPage.accountregistrationSuccesful,"User Registration With Valid Email ID","Page");	
	}
	
	
	public void TC01_AccountWithdrawal() throws IOException, InterruptedException {
		 ActionDriver aDriver = new ActionDriver();
		 StartBrowser.childTest = StartBrowser.parentTest.createNode("TC02_Verify Correct Account Balance Reflects After a Withdrawal is Made");
		 Thread.sleep(2500);
		 aDriver.click(MenuTab.transactionsMenu, "Savings Account");
		 Thread.sleep(2500);
		 aDriver.click(MenuTab.withdrawTransaction, "Withdraw menu");
		 Thread.sleep(2500);
		 aDriver.captureElement(WithdrawalTransactionPage.accountWithdrawal_pageElement,"Account Withdrawal Page","Account Withdrawal Page");
		 Thread.sleep(2500);
		 aDriver.selectDropDown(WithdrawalTransactionPage.withdrwalAccount_Dropdown,1,"Savings Account Withdrawal");
		 Thread.sleep(2500);
		 aDriver.enter_txt(WithdrawalTransactionPage.withdrawalAmount_txt,"1"+randomstring3() , "Amount to Withdraw");
		 
		 Thread.sleep(2500);
		 aDriver.click(WithdrawalTransactionPage.btnSubmitWithdrawal, " Withdraw");
		 Thread.sleep(2500);
		 
		 aDriver.verifyWithdrawalValidation();
		 //aDriver.captureElement(WithdrawalTransactionPage.InsufficientFundsAlert,"Error Insufficient Funds","");
	}
	
	
	
	public void TC01_AccountDeposit() throws IOException, InterruptedException {
		ActionDriver aDriver = new ActionDriver();
		 StartBrowser.childTest = StartBrowser.parentTest.createNode("TC02_Verify Correct Account Balance Reflects After a Deposit is Made");
		 Thread.sleep(2500);
		 aDriver.click(MenuTab.transactionsMenu, "Savings Account");
		 Thread.sleep(2500);
		 aDriver.click(MenuTab.depositTransaction, "Deposit menu");
		 Thread.sleep(2500);
		 aDriver.captureElement(DepositTransactionPage.accountDeposit_pageElement,"Account Deposit Page","Account Deposit Page");
		 Thread.sleep(2500);
		 aDriver.selectDropDown(DepositTransactionPage.accountDeposit_Dropdown,2,"Check Account Deposit");
		 Thread.sleep(2500);
		 aDriver.enter_txt(DepositTransactionPage.depositAmount_txt,"1"+randomstring3() , "Amount to Deposit");
		 
		 Thread.sleep(2500);
		 aDriver.click(DepositTransactionPage.btnSubmitDeposit, " Deposit");
		 Thread.sleep(2500);
		 
		 aDriver.verifyDepositValidation();
		 aDriver.captureElement(SavingsAccountViewPage.userSavingsView,"Savings Account View","");
	}
		 
   

	public void TC01_Authentication() throws IOException, InterruptedException {
		 ActionDriver aDriver = new ActionDriver();
		 StartBrowser.childTest = StartBrowser.parentTest.createNode("TC01_Verify Successful User Authentication With Valid Credentials");
		 Thread.sleep(2500);
		  aDriver.navigateToApplication("http://dbankdemo.com");
		  Thread.sleep(2500);
		  aDriver.enter_txt(LoginPage.loginUserName, reader.getCellData("Sheet2", "authEmailAddress", 2), "UserName");
		  aDriver.enter_txt(LoginPage.loginPassword, reader.getCellData("Sheet2", "authPassword", 2), "User Password");
		  aDriver.click(LoginPage.loginBtn, "SignIn Button");
		  Thread.sleep(2500);
		  aDriver.captureElement(HomePage.authSuccessMsg, "Success Login","Login Success");
		
		  //aDriver.click(UserAuthenticationPage.btnSignOut, "Logout");
	}
	
	public void TC02_Authentication() throws IOException, InterruptedException {
		 ActionDriver aDriver = new ActionDriver();
		  StartBrowser.childTest = StartBrowser.parentTest.createNode("TC02_Verify User Authentication Denaial With Invalid Credentials");
		  aDriver.click(HomePage.userProfileImage, "Profile Menu");
		  Thread.sleep(2500);
		  aDriver.click(HomePage.btnLogout, "SignOut");
		  Thread.sleep(2500);
		  aDriver.navigateToApplication("http://dbankdemo.com");
		  Thread.sleep(2500);
		  aDriver.enter_txt(LoginPage.loginUserName, reader.getCellData("Sheet2", "authEmailAddress", 3), "UserName");
		  aDriver.enter_txt(LoginPage.loginPassword, reader.getCellData("Sheet2", "authPassword", 3), "User Password");
		  aDriver.click(LoginPage.loginBtn, "SignIn Button");
		  Thread.sleep(2500);
		  aDriver.captureElement(LoginPage.authFailMsg,"User Authentication Error With User Invalid Credentials","Error Message");
	}
	
}
