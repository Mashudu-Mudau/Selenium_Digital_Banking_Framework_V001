package DBank.webElement_Repository;

import org.openqa.selenium.By;

public class HomePage {
	
	public static By userProfileImage = By.xpath("/html/body/div[1]/header/div/div[2]/div[1]/a/img");
	public static By userProfile = By.xpath("/html/body/div[1]/header/div/div[2]/div[1]/div/a[1]");
	public static By userchangePassword = By.xpath("/html/body/div[1]/header/div/div[2]/div[1]/div/a[2]");
	public static By btnLogout = By.xpath("/html/body/div[1]/header/div/div[2]/div[1]/div/a[3]");
	public static By authSuccessMsg = By.xpath("//*[@id=\"right-panel\"]/div[1]/div[2]/div/div/ol/li");
	public static By btnSignOut1 = By.xpath("//*[@id=\"footer\"]/div/section[5]/div/ul/li[5]/a");
	 
	
}
