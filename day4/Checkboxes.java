package day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//span[text()='Basic']")).click();

		WebElement e = driver.findElement(By.xpath("//span[text()='Ajax']"));
		e.click();

		WebElement e11 = driver.findElement(By.xpath("//label[text()='Java']"));
		e11.click();
		WebElement tristate = driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']"));
		tristate.click();
		WebElement toggleswitch = driver.findElement(By.xpath("//div[@class='ui-toggleswitch ui-widget']"));
		toggleswitch.click();
		WebElement messageElement = driver.findElement(By.id("j_idt87:id_container")); // Change the locator as needed
		String actualMessage = messageElement.getText();
		System.out.println(actualMessage);
		WebElement ele = driver.findElement(By.xpath("//input[@id='j_idt87:j_idt102_input']"));
		if (ele.isEnabled()) {
			System.out.println("Enabled");
		} else {
			System.out.println("Disabled");
		}
		driver.findElement(By.xpath("//div[@class=\"ui-selectcheckboxmenu-trigger ui-state-default ui-corner-right\"]"))
				.click();
		driver.findElement(By.xpath("(//label[text()='Paris'])[2]")).click();

	}

}
