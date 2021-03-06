package extentReports;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class HomePage {
	ExtentTest test;
	WebDriver driver = null;

	public HomePage(WebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}

	public void clickSignUpLink() {
		WebElement signupLink = driver.findElement(By.xpath("//*[@id=\"comp-iiqg1vggactionTitle\"]"));
		signupLink.click();
		test.log(LogStatus.INFO, "Clicked on signup link");

	}

	public void clickLoginLink() {
		WebElement loginLink = driver.findElement(By.id("signUpDialogswitchDialogLink"));
		loginLink.click();
		test.log(LogStatus.INFO, "Clicked on login link");
	}

	public void enterEmail(String email) {
		WebElement emailField = driver.findElement(By.xpath("//div[@id='memberLoginDialogemail']//input"));
		emailField.sendKeys(email);
		test.log(LogStatus.INFO, "Enter email");
	}

	public void enterPassword(String password) {
		WebElement passwordField = driver.findElement(By.xpath("//div[@id='memberLoginDialogpassword']//input"));
		passwordField.sendKeys(password);
		test.log(LogStatus.INFO, "Enter password");
	}

	public void clickgoButton() {
		WebElement goButton = driver.findElement(By.id("memberLoginDialogokButton"));
		goButton.click();
		test.log(LogStatus.INFO, "Clicked Go button");

	}

	public boolean isWelcomeTestPresent() {
		WebElement welcomeText = null;

		try {
			welcomeText = driver.findElement(By.id("comp-iiqg1vggmemberTitle"));
			if(welcomeText != null) {
				return true;
			}
		} 
		catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
			return false;
		}
		return false;
	}

}
