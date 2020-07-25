package DBank.webElement_Repository;

import org.openqa.selenium.By;

public class CheckAccountViewPage {
	
	
	public static By userCheckAccountName = By.xpath("/html/body/div[1]/div[2]/div/div[1]/div/div/form/div/div[1]");
	public static By userCheckAccountType = By.xpath("/html/body/div[1]/div[2]/div/div[1]/div/div/form/div/div[2]/small");
	public static By userCheckAccountOwnershipType = By.xpath("/html/body/div[1]/div[2]/div/div[1]/div/div/form/div/div[3]/small");
	public static By userCheckAccountNumber = By.xpath("/html/body/div[1]/header/div/div[2]/div[1]/div/a[1]");
	public static By userCheckAccountIR = By.xpath("/html/body/div[1]/div[2]/div/div[1]/div/div/form/div/div[5]/small");
	public static By checkAccoutBalance = By.xpath("/html/body/div[1]/div[2]/div/div[1]/div/div/form/div/div[7]");
	public static By checkAccoutTransactionBalance = By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/table/tbody/tr/td[5]");
	public static By userProfile = By.xpath("/html/body/div[1]/header/div/div[2]/div[1]/div/a[1]");

	public static By currentBalance =  By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/table/tbody/tr[2]/td[5]");
	public static By balanceBroughtForward = By.xpath ("/html/body/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td[5]");
	public static By withdraw_txt2 = By.xpath ("/html/body/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td[4]");

}
