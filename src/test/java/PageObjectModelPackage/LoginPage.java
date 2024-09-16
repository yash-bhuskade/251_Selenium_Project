package PageObjectModelPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email") WebElement txtEmail;
	@FindBy(id="password") WebElement txtPassword;
	@FindBy(xpath="//*[@id=\"form\"]/div[3]/div/button") WebElement btnSignIN;
	@FindBy(xpath="/html/body/div/div[2]/a") WebElement linkNewMemberShip;
	
	public void email(String EnterMail) {
		txtEmail.sendKeys(EnterMail);
	}
	public void password(String EnterPass) {
		txtPassword.sendKeys(EnterPass);
	}
	public void signIn() {
		btnSignIN.click();
	}
	public void newMemberShip() {
		linkNewMemberShip.click();
	}
}
