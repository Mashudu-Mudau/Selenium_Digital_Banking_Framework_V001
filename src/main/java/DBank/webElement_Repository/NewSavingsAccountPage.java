package DBank.webElement_Repository;

import org.openqa.selenium.By;

public class NewSavingsAccountPage {
	
	public static By userNewSavingsAccountType = By.id("Savings");
	public static By userNewSavaingsMoneyMarketAccountType = By.id("Money Market");

	public static By userNewIndividualSavingsAccountOwnershipType = By.id("Individual");
	public static By userNewJointSavingsAccountOwnershipType = By.id("Joint");

	public static By userNewSavingsAccountName = By.id("name");
	public static By userNewSavingsAccountInititialDPAmount = By.id("openingBalance");
	
	public static By btnUserNewSavingsAccoutSubmit = By.id("newSavingsSubmit");
	public static By userNewSavingsAccountFormResetBtn = By.xpath("/html/body/div[1]/div[2]/div/div/div/div/form/div[2]/button[2]");

}
