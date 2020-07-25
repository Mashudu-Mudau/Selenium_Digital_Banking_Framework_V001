package DBank.webElement_Repository;

import org.openqa.selenium.By;

public class SavingsAccountViewPage {
	
	public static By userSavingsView = By.xpath("//*[@id=\"24769\"]/div/div[1]");
	public static By userSavingsAccountName = By.xpath("/html/body/div[1]/div[2]/div/div[1]/div/div/form/div/div[1]");
	public static By userSavingsAccountType = By.xpath("/html/body/div[1]/div[2]/div/div[1]/div/div/form/div/div[2]/small");
	public static By userSavingsAccountOwnershipType = By.xpath("/html/body/div[1]/div[2]/div/div[1]/div/div/form/div/div[3]/small");
	public static By userSavingsAccountNumber = By.xpath("/html/body/div[1]/header/div/div[2]/div[1]/div/a[1]");
	public static By userSavingsAccountIR = By.xpath("/html/body/div[1]/div[2]/div/div[1]/div/div/form/div/div[5]/small");
	public static By savingsAccoutBalance = By.xpath("/html/body/div[1]/div[2]/div/div[1]/div/div/form/div/div[7]");
	public static By savingsAccoutTransactionBalance = By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/table/tbody/tr/td[5]");
	public static By userProfile = By.xpath("/html/body/div[1]/header/div/div[2]/div[1]/div/a[1]");
	
	public static By currentBalance =  By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/table/tbody/tr[2]/td[5]");
	public static By balanceBroughtForward = By.xpath ("/html/body/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td[5]");
	public static By withdrawal_txt2 = By.xpath ("/html/body/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/table/tbody/tr[2]/td[4]");
}

