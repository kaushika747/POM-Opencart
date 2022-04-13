//OPENCART

package POM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageOpencart {
WebDriver driver;
	
	public void LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.ID, using="input-email")
	WebElement EmailID;
	
	@FindBy(how = How.ID, using = "input-password")
	WebElement Password;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"content\"]/div/div[2]/div/form/input")
	WebElement LoginBtn;
	
	public void LoginOpencart(String emailid, String Psd) {
		EmailID.sendKeys(emailid);
		Password.sendKeys(Psd);
		LoginBtn.click();
	}

}
