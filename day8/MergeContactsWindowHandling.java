package day8;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeContactsWindowHandling {
	public static void main(String args[]) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(90));
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
		Thread.sleep(900);
		Set<String> allWindowHandles = driver.getWindowHandles();
		ArrayList<String> tabs = new ArrayList<>(allWindowHandles);
		driver.switchTo().window(tabs.get(1));
		WebElement fromContact = driver.findElement(By.xpath("//a[text()='10052']"));
		fromContact.click();
		driver.switchTo().window(tabs.get(0));
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();

		allWindowHandles = driver.getWindowHandles();
		tabs = new ArrayList<>(allWindowHandles);
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(2000);
		WebElement toContact = driver.findElement(By.xpath("//a[text()='DemoCustomer']"));
		toContact.click();
		driver.switchTo().window(tabs.get(0));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		System.out.println("Title : " + driver.getTitle());

	}
}