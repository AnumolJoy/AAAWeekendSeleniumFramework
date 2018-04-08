package scripts;
import org.testng.annotations.Test;
import generic.BaseTest;
import generic.Lib;
import pompages.LoginPage;
public class TestValidLogin extends BaseTest{
	@Test
	public void testValidLogin(){
		
		//enter username
		LoginPage lp = new LoginPage(driver);
		String username = Lib.getCellValue("ValidLogin", 1, 0);
		lp.setUsername(username);
		
		//enter password
		String password = Lib.getCellValue("ValidLogin", 1, 1);
		lp.setPassword(password);
		
		//click on Login button
		lp.clickLogin();
	}

}
