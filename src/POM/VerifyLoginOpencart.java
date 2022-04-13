//OPENCART

package POM;
import java.sql.Driver;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
public class VerifyLoginOpencart {

	@Test
	public void TestUser() {
		WebDriver driver = BrowserFactoryOpencart.BrowserOptions("Chrome",
				"https://demo.opencart.com/index.php?route=account/login");
		LoginPageOpencart loginOpencart = PageFactory.initElements(driver,LoginPageOpencart.class);
		loginOpencart.LoginOpencart("Admin@gmail.com","admin123");
		}

}
