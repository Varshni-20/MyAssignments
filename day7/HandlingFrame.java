package day7;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrame {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(90));
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button['Try it']")).click();
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		String alert_check = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		System.out.println("Message :" + alert_check);

	}

}
