package Scripts;

import java.io.IOException;
import org.testng.annotations.Test;

import Utilities.JiraPolicy;
import config.StartBrowser;
import reusables.ReUsableMethods;

public class SC003_testCheckAccountWithdrawal extends StartBrowser{
	
	@JiraPolicy(logTicketReady=true)
	@Test
	public void Check_Account_Withdrawal() throws IOException, InterruptedException {
	  ReUsableMethods CashWithdrawal = new ReUsableMethods();
	  CashWithdrawal.TC01_AccountWithdrawal();
	  CashWithdrawal.TC02_AccountWithdrawal();
	}
}