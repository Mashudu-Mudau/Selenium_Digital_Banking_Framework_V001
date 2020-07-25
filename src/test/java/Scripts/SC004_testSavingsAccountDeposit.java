package Scripts;

import java.io.IOException;
import org.testng.annotations.Test;
import config.StartBrowser;
import reusables.ReUsableMethods;


public class SC004_testSavingsAccountDeposit extends StartBrowser{
	 
	@Test
	public void User_Savings_Account_Deposit() throws IOException, InterruptedException {
	  ReUsableMethods cashDeposit = new ReUsableMethods();
	  	cashDeposit.TC01_Authentication();
	  	cashDeposit.TC01_AccountDeposit();
		

	  }
	}
		  
		  
	 