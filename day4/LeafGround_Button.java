package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGround_Button {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		System.out.println(driver.getTitle());
		driver.navigate().to("https://leafground.com/button.xhtml");
		WebElement e=driver.findElement(By.xpath("//button[@class=\"ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only ui-state-disabled\"]"));
        if(e.isEnabled()) {
        	System.out.println("Button is enabled");
        }
        else {
        	System.out.println("Button is disabled");
        }
        WebElement position=driver.findElement(By.xpath("//button[@class=\"ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-left mr-2\"]"));
        System.out.println(position.getLocation());
        WebElement color=driver.findElement(By.xpath("//button[@class=\"ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-left ui-button-secondary mr-2 mb-2\"]"));
        System.out.println(color.getCssValue("background-color"));
        WebElement size=driver.findElement(By.xpath("//button[@class=\"ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-right\"]"));
        System.out.println(size.getSize());
        driver.close();
	}

}
