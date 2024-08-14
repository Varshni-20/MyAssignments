package day8;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(90));
		driver.navigate().to("https://www.snapdeal.com/");

		Actions act = new Actions(driver);
		WebElement t1 = driver.findElement(By.xpath("//span[text()=\"Men's Fashion\"]"));
		act.moveToElement(t1).perform();
		driver.findElement(By.xpath("//span[text()='Sports Shoes']")).click();
		WebElement count = driver.findElement(By.xpath("//span[@class=\"category-name category-count\"]"));
		System.out.println("Count of shoes : " + count.getText());
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		WebElement dropdown = driver.findElement(By.xpath("//i[@class=\"sd-icon sd-icon-expand-arrow sort-arrow\"]"));
		dropdown.click();
		WebElement low = driver.findElement(By.xpath("//li[@class=\"search-li\"][1]"));
		act.moveToElement(low);
		low.click();
		WebElement fromprice = driver.findElement(By.xpath("//input[@name=\"fromVal\"]"));
		fromprice.clear();
		fromprice.sendKeys("500");
		WebElement toprice = driver.findElement(By.xpath("//input[@name=\"toVal\"]"));
		toprice.clear();
		toprice.sendKeys("700");
		driver.findElement(By.xpath("//div[@class=\"price-go-arrow btn btn-line btn-theme-secondary\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class=\"sdCheckbox filters-list \"])[1]")).click();
		WebElement firstShoe = driver.findElement(By.xpath("//img[@class=\"product-image wooble\"]"));
		// JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("arguments[0].scrollIntoView(true);", firstShoe);

		Actions actions = new Actions(driver);
		actions.moveToElement(firstShoe).perform();
		driver.findElement(By.xpath("//div[@class='clearfix row-disc']")).click();
		Thread.sleep(700);
		String percent = driver.findElement(By.xpath("//span[@class=\"percent-desc \"]")).getText();
		System.out.println(percent);
		String cost = driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();
		System.out.println(cost);
		// Taking Screenshot
		WebElement img = driver.findElement(By.xpath("//img[@class='cloudzoom']"));
		File screenshot = img.getScreenshotAs(OutputType.FILE);
		File destinationFile = new File("C:\\Users\\VEDAVARSHNI\\Desktop\\screenshot.png");
		FileUtils.copyFile(screenshot, destinationFile);
		System.out.println("Screenshot saved to: " + destinationFile.getAbsolutePath());
		// Close the browser
		driver.close();
		driver.quit();

	}

}
