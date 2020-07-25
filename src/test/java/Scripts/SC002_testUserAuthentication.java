package Scripts;

import java.io.IOException;
import org.testng.annotations.Test;
import config.StartBrowser;
import reusables.ReUsableMethods;

public class SC002_testUserAuthentication extends StartBrowser {
	
	@Test
	public void User_Authentication() throws IOException, InterruptedException {
	  ReUsableMethods Authentication = new ReUsableMethods();
	  Authentication.TC01_Authentication();
	  Authentication.TC02_Authentication();
	}
}
