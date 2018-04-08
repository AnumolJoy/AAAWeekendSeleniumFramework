package scripts;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import generic.BaseTest;
import generic.Lib;
import pompages.LoginPage;
public class TestValidLogin extends BaseTest{
	static Logger log = LogManager.getLogger(TestValidLogin.class.getName());
	@Test
	public void testValidLogin(){
		
		//enter username
		log.info("Creating an object of LoginPage pom class");
		LoginPage lp = new LoginPage(driver);
		log.info("LoginPage object is created successfully");
		log.debug("Fetching username from excel file");
		String username = Lib.getCellValue("ValidLogin", 1, 0);
		log.debug(" username successfully fetched rom excel file");
		lp.setUsername(username);
		//enter password
		String password = Lib.getCellValue("ValidLogin", 1, 1);
		lp.setPassword(password);
		//click on Login button
		lp.clickLogin();
		Assert.fail();
	}

}
