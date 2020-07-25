package DBank.webElement_Repository;

import org.openqa.selenium.By;

public class NewCheckAccountPage {
	
	public static By userNewStdCheckAccountType = By.id("Standard Checking");
	public static By userNewInterestCheckAccountType = By.id("Interest Checking");
	
	public static By userNewIndividualCheckAccountOwnershipType = By.id("Individual");
	public static By userNewJointCheckAccountOwnershipType = By.id("Joint");

	public static By userNewCheckAccountName = By.id("name");
	public static By userNewCheckAccountInititialDPAmount = By.id("openingBalance");
	
	public static By btnUserNewcheckAccoutSubmit = By.xpath("/html/body/div[1]/div[2]/div/div/div/div/form/div[2]/button[1]");
	public static By userNewCheckAccountFormResetBtn = By.xpath("/html/body/div[1]/div[2]/div/div/div/div/form/div[2]/button[2]");

}
