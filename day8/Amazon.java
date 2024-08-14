package day8;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(90));
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("oneplus 9 pro", Keys.ENTER);
		System.out.println(driver.findElement(By.xpath("(//span[@class=\"a-price-whole\"])[1]")).getText());
		WebElement rating = driver.findElement(By.xpath("//span[@class=\"a-size-base s-underline-text\"]"));
		System.out.println(rating.getText());

		driver.findElement(By.xpath("(//span[@class=\"a-size-medium a-color-base a-text-normal\"])[1]")).click();
		Set<String> allWindowHandles = driver.getWindowHandles();
		ArrayList<String> tabs = new ArrayList<>(allWindowHandles);

		// Switch to the first new tab/window
		driver.switchTo().window(tabs.get(1));
		// Perform actions on the first new tab
		System.out.println("Title of the first new tab: " + driver.getTitle());

		WebElement phonescreenshot = driver.findElement(By.xpath("//div[@id=\"imgTagWrapperId\"]"));
		File screenshot = phonescreenshot.getScreenshotAs(OutputType.FILE);
		File destinationFile = new File("C:\\Users\\VEDAVARSHNI\\Desktop\\screenshot.png");
		FileUtils.copyFile(screenshot, destinationFile);
		System.out.println("Screenshot saved to: " + destinationFile.getAbsolutePath());

		Thread.sleep(900);
		WebElement cart = driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[1]"));

		cart.click();
		Thread.sleep(2000);

		String value = driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-price a-text-bold']"))
				.getText();
		System.out.println("Subtotal : " + value);

		driver.quit();

	}

}
