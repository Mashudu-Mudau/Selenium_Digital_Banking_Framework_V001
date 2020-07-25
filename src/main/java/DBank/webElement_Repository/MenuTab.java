package DBank.webElement_Repository;

import org.openqa.selenium.By;

public class MenuTab {

	public static By checkAccountMenu = By.xpath("/html/body/aside/nav/div[2]/ul/li[2]/a");
	public static By viewCheckAccount = By.xpath("/html/body/aside/nav/div[2]/ul/li[2]/ul/li[1]/a");
	public static By newCheckAccount = By.xpath("/html/body/aside/nav/div[2]/ul/li[2]/ul/li[2]/a");
	
	public static By savingsAccountMenu = By.xpath("/html/body/aside/nav/div[2]/ul/li[3]/a");
	public static By viewSavingsAccount = By.xpath("/html/body/aside/nav/div[2]/ul/li[3]/ul/li[1]/a");
	public static By newSavingsAccount = By.xpath("/html/body/aside/nav/div[2]/ul/li[3]/ul/li[2]/a");
	
	public static By transactionsMenu = By.xpath("/html/body/aside/nav/div[2]/ul/li[4]/a");
	public static By depositTransaction = By.xpath("/html/body/aside/nav/div[2]/ul/li[4]/ul/li[1]/a");
	public static By withdrawTransaction = By.xpath("/html/body/aside/nav/div[2]/ul/li[4]/ul/li[2]/a");
	
	public static By digitalCreditMenu = By.xpath("/html/body/aside/nav/div[2]/ul/li[5]/a");
	public static By digitalCreditApplication = By.xpath("/html/body/aside/nav/div[2]/ul/li[5]/ul/li/a");
	
	public static By transfersPaymentsMenu = By.xpath("/html/body/aside/nav/div[2]/ul/li[6]/a");
	public static By transferBetween = By.xpath("/html/body/aside/nav/div[2]/ul/li[6]/ul/li/a");
	
	public static By visaDirectMenu = By.xpath("/html/body/aside/nav/div[2]/ul/li[7]/a");
	public static By visaTransfer = By.xpath("/html/body/aside/nav/div[2]/ul/li[7]/ul/li/a");
}
