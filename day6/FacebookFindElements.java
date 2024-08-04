package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookFindElements {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com");
		List<WebElement> ele = driver.findElements(By.xpath("//a"));
		System.out.println(ele.size());
		for (int i = 0; i < ele.size(); i++) {
			System.out.println(ele.get(i).getText());
		}

	}

}
