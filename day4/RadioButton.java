package day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		WebElement browser = driver
				.findElement(By.xpath("(//table[@class='ui-selectoneradio ui-widget']//label[text()='Chrome'])[1]"));
		browser.click();
		driver.findElement(By.xpath("(//table[@class='ui-selectoneradio ui-widget']//label[text()='Safari'])[1]"))
				.click();
		if (browser.isSelected()) {
			System.out.println("Chrome is selected");
		} else {
			System.out.println("Chrome is not selected");
		}
		WebElement age = driver
				.findElement(By.xpath("//span[@class=\"ui-radiobutton-icon ui-icon ui-c ui-icon-bullet\"]"));
		if (age.isSelected()) {
			System.out.println("Already Selected");
		} else {
			age.click();

		}

	}

}
