package Scripts;

import java.io.IOException;
import org.testng.annotations.Test;

import config.StartBrowser;
import reusables.ReUsableMethods;




public class SC004_testUserRegistration extends StartBrowser{

@Test
  public void Test_User_Registration() throws IOException, InterruptedException {
	  ReUsableMethods registerFunction = new ReUsableMethods();
	  registerFunction.TC01_Registration();
	
  }
}
