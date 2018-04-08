package scripts;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Lib;
import pompages.LoginPage;
public class TestInvalidLogin extends BaseTest {
	@Test
	public void testInvalidLogin() throws InterruptedException{
		//enter username
		LoginPage lp = new LoginPage(driver);
		int rowCount = Lib.getRowCount("InvalidLogin");
		for (int i = 1; i <= rowCount; i++) {
			String username = Lib.getCellValue("InvalidLogin", i, 0);
			lp.setUsername(username);
			Thread.sleep(2000);
			//enter password
			String password = Lib.getCellValue("InvalidLogin", i, 1);
			lp.setPassword(password);
			Thread.sleep(2000);
			//click on Login button
			lp.clickLogin();
			Thread.sleep(2000);
		}
	}
}




