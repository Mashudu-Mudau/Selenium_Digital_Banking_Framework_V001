package Scripts;
import java.io.IOException;
import org.testng.annotations.Test;
import config.StartBrowser;
import reusables.ReUsableMethods;



@Test
public class SC001_testUserRegistration extends StartBrowser{

  public void User_Registration() throws IOException, InterruptedException {
	  ReUsableMethods registerFunction = new ReUsableMethods();
	  registerFunction.TC01_Registration();
	
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  

}
