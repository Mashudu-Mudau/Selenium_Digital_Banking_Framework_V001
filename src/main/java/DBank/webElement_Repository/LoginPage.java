package DBank.webElement_Repository;

import org.openqa.selenium.By;


public class LoginPage {
  
  
	public static By loginUserName = By.name("username");
	public static By loginPassword = By.id("password");
	public static By loginBtn = By.id("submit");
	public static By RememberMeChekbox = By.name("remember-me");
	public static By signUpLink = By.xpath("/html/body/div[1]/div/div/div[2]/form/div[4]/p/a");
	public static By authFailMsg = By.xpath("/html/body/div[1]/div/div/div[2]/div");
}
