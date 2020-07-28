package Scripts;

import java.io.IOException;
import org.testng.annotations.Test;
import config.StartBrowser;
import reusables.ReUsableMethods;

public class SC002_testCheckAccountWithdrawal extends StartBrowser{
	
	@Test
	public void Check_Account_Withdrawal() throws IOException, InterruptedException {
	  ReUsableMethods CashWithdrawal = new ReUsableMethods();
	  CashWithdrawal.TC01_Authentication();
	  CashWithdrawal.TC01_AccountWithdrawal();
	}
}