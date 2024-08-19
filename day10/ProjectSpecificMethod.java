package day10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ProjectSpecificMethod {
	public ChromeOptions options;
	public ChromeDriver driver;

	@Parameters({ "url", "username", "password" })
	@BeforeMethod
	public void precondition(String url, String Username, String Password) throws InterruptedException {
		options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);

		driver.manage().window().maximize();
		driver.navigate().to(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(90));

		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys(Username);
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys(Password);
		WebElement login = driver.findElement(By.xpath("//input[@id='Login']"));
		login.click();
		Thread.sleep(3000);

	}

	@AfterMethod
	public void postcondition() {
		driver.close();

	}

}
