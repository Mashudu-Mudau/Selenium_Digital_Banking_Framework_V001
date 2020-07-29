package Scripts;

import java.io.IOException;
import org.testng.annotations.Test;

import Utilities.JiraPolicy;
import config.StartBrowser;
import reusables.ReUsableMethods;




public class SC004_testUserRegistration extends StartBrowser{

@JiraPolicy(logTicketReady=true)
@Test
  public void User_Registration() throws IOException, InterruptedException {
	  ReUsableMethods registerFunction = new ReUsableMethods();
	  registerFunction.TC01_Registration();
	
  }
}
