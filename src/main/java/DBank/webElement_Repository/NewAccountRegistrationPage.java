package DBank.webElement_Repository;

import org.openqa.selenium.By;


public class NewAccountRegistrationPage {
	public static By formErrorAlert = By.id("//*[@id=\"center_column\"]/div");
	public static By accountregistrationSuccesful = By.xpath("/html/body/div[1]/div/div/div[2]/div/span[2]");
	public static By customerTitle = By.id("title");
	public static By radiomaleTitle = By.xpath("/html/body/div[1]/div/div/div[2]/form/div[5]/label[1]/input");
	public static By radiofemaleTitle = By.xpath("/html/body/div[1]/div/div/div[2]/form/div[5]/label[2]/input");
	public static By customerFirstName = By.id("firstName");
	public static By customerLastName = By.id("lastName");
	public static By customerEmail = By.id("emailAddress");
	public static By customerPassword = By.id("password");
	public static By customerConfirmPassword = By.id("confirmPassword");
	public static By customerDateOfBirth = By.id("dob");
	public static By customerSSNID = By.id("ssn");
	public static By checkBoxRecieveNewsLetter = By.name("newsletter");
	public static By profileImage = By.xpath("/html/body/div[1]/div/div/div[1]/a/img");
	public static By btnNext = By.xpath("/html/body/div[12]/div/div/div[2]/form/button");
	public static By customerAddress = By.id("address");
	public static By customerLocality = By.id("locality");
	public static By customerRegion = By.id("region");
	public static By customerPostalCode = By.id("postalCode");
	public static By customerCountry = By.id("country");
	public static By customerHomePhone = By.id("homePhone");
	public static By customerMobilePhone = By.id("mobilePhone");
	public static By customerWorkPhone = By.id("workPhone");
	public static By customerAgreeTerms = By.id("agree-terms");
	
	
	
	
	public static By btnRegister = By.xpath("/html/body/div[1]/div/div/div[2]/form/button");
	

	
	
}
