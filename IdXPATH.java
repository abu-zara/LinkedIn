package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IdXPATH {

	public static void main(String[] args) {
		
		
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Abdulkarim.samrumi-boys-HP\\Downloads\\selenium-workspace\\geckodriver-v0.19.1-win64/geckodriver.exe");
		driver = new FirefoxDriver();
		String baseURL = "http://www.google.com ";
		driver.manage().window().maximize();		
		driver.get(baseURL);
		
		driver.findElement(By.id("lst-ib")).sendKeys("facebook");
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[3]/center/input[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"vn1s0p1c0\"]")).click();
		
	}
	

}
