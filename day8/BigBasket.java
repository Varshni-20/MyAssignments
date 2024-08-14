package day8;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasket {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(90));
		driver.navigate().to("https://www.bigbasket.com/");
		Actions action = new Actions(driver);
		WebElement shop = driver.findElement(By.xpath("(//span[contains(text(),'Shop by')])[2]"));
		shop.click();
		Thread.sleep(900);
		WebElement foodgrains = driver.findElement(By.xpath("(//a[text()='Foodgrains, Oil & Masala'])[2]"));
		action.moveToElement(foodgrains).perform();
		action.moveToElement(driver.findElement(By.xpath("(//a[text()='Rice & Rice Products'])[1]"))).perform();
		driver.findElement(By.xpath("//a[text()='Boiled & Steam Rice']")).click();
		action.scrollToElement(driver.findElement(By.xpath("//span[text()='Brands']"))).perform();

		driver.findElement(By.xpath(
				"//input[@class=\"flex-1 min-w-0 leading-md lg:text-sm xl:text-md placeholder-silverSurfer-700\"]"))
				.sendKeys("BB Royal");

		driver.findElement(By.xpath("//input[@id=\"i-BBRoyal\"]")).click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//h3[text()='Tamil Ponni Boiled Rice']")).click();

		// Window Handling
		Set<String> handles = driver.getWindowHandles();
		String originalHandle = driver.getWindowHandle();

		for (String handle : handles) {
			if (!handle.equals(originalHandle)) {
				driver.switchTo().window(handle);
				break;
			}
		}

		WebElement kg = driver
				.findElement(By.xpath("(//div[@class=\"flex flex-col items-start justify-start w-full p-2.5\"])[5]"));

		action.moveToElement(kg).perform();
		kg.click();
		WebElement price = driver.findElement(By.xpath(
				"(//span[@class=\"Label-sc-15v1nk5-0 PackSizeSelector___StyledLabel6-sc-l9rhbt-6 gJxZPQ bOoRyb\"])[5]"));
		System.out.println("Price is : " + price.getText());
		driver.findElement(By.xpath("//button[text()='Add to basket']")).click();
		WebElement p = driver.findElement(By.xpath("//p[@class=\"mx-4 flex-1\"]"));
		System.out.println(p.getText());
		Thread.sleep(1000);

		// Screenshot code
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destinationFile = new File("C:\\Users\\VEDAVARSHNI\\Desktop\\screenshot.png");
		FileUtils.copyFile(screenshot, destinationFile);
		System.out.println("Screenshot saved to: " + destinationFile.getAbsolutePath());

		// Closing the window
		driver.close();
		driver.quit();

	}
}
