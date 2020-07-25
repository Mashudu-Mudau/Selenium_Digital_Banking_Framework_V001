package DBank.webElement_Repository;

import org.openqa.selenium.By;

public class UserAuthenticationPage {
	
	public static By userEmailAddress = By.id("email");
	public static By userPassword = By.name("passwd");
	public static By btnSignIn = By.xpath("//*[@id=\"SubmitLogin\"]/span");
	public static By authErrorMsg = By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li");
	public static By authSuccessMsg = By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span");
	public static By btnSignOut = By.xpath("//*[@id=\"footer\"]/div/section[5]/div/ul/li[5]/a");
}
