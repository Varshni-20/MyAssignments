package day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSelect {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://en-gb.facebook.com");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("varsh");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("S");
		driver.findElement(By.xpath("//input[@name='reg_email__' ]")).sendKeys("7598183368");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("abc");
		WebElement date=driver.findElement(By.xpath("//select[@id='day']"));
		Select options=new Select(date);
		options.selectByVisibleText("20");
		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		Select options1=new Select(month);
		options1.selectByVisibleText("Sep");
		WebElement day=driver.findElement(By.xpath("//select[@id='year']"));
		Select options2=new Select(day);
		options2.selectByVisibleText("2000");
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
		
		

	}

}
