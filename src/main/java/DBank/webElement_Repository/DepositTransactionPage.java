package DBank.webElement_Repository;

import org.openqa.selenium.By;

public class DepositTransactionPage {
	
	public static By accountDeposit_pageElement = By.xpath("//*[@id=\"right-panel\"]/div[2]/div/div/div/div/div/strong");
	public static By accountDeposit_Dropdown = By.xpath("/html/body/div[1]/div[2]/div/div/div/div/form/div[1]/div[2]/div/select");
	public static By  depositAmount_txt = By.xpath("/html/body/div[1]/div[2]/div/div/div/div/form/div[1]/div[3]/div/input");
	public static By btnSubmitDeposit= By.xpath("/html/body/div[1]/div[2]/div/div/div/div/form/div[2]/button[1]");
	public static By btnResetDeposit_fields = By.xpath("/html/body/div[1]/div[2]/div/div/div/div/form/div[2]/button[2]");
	public static By loginUserName = By.name("username");
}
