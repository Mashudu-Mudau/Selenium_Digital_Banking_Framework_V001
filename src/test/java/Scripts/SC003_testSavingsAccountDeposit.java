package Scripts;

import java.io.IOException;
import org.testng.annotations.Test;
import config.StartBrowser;
import reusables.ReUsableMethods;


public class SC003_testSavingsAccountDeposit extends StartBrowser {
	
	@Test
	public void Test_Savings_Account_Deposits() throws IOException, InterruptedException {
		ReUsableMethods Deposit = new ReUsableMethods();
		Deposit.TC01_Authentication();
		Deposit.TC01_AccountDeposit();
	}
}