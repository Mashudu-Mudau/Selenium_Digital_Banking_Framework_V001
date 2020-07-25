package DBank.webElement_Repository;

import org.openqa.selenium.By;

public class WithdrawalTransactionPage {
	
	public static By accountWithdrawal_pageElement = By.xpath("//*[@id=\"right-panel\"]/div[2]/div/div/div/div/div/strong");
	public static By withdrwalAccount_Dropdown = By.xpath("/html/body/div[1]/div[2]/div/div/div/div/form/div[1]/div[2]/div/select");
	public static By  withdrawalAmount_txt = By.xpath("/html/body/div[1]/div[2]/div/div/div/div/form/div[1]/div[3]/div/input");
	public static By btnSubmitWithdrawal= By.xpath("/html/body/div[1]/div[2]/div/div/div/div/form/div[2]/button[1]");
	public static By btnResetWithdrawal_fields = By.xpath("/html/body/div[1]/div[2]/div/div/div/div/form/div[2]/button[2]");
	public static By InsufficientFundsAlert = By.xpath("/html/body/div[1]/div[2]/div/div/div/div/form/div[1]/div[1]/div/span[2]");
	
}
