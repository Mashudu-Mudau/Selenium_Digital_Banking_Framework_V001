package Scripts;

import java.io.IOException;
import org.testng.annotations.Test;

import Utilities.JiraPolicy;
import config.StartBrowser;
import reusables.ReUsableMethods;


public class SC002_testSavingsAccountDeposit extends StartBrowser {
	
	@JiraPolicy(logTicketReady=true)
	@Test
	public void Savings_Account_Deposits() throws IOException, InterruptedException {
		ReUsableMethods Deposit = new ReUsableMethods();
		Deposit.TC01_AccountDeposit();
		Deposit.TC02_AccountDeposit();
	}
}