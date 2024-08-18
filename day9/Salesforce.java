package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Salesforce extends ProjectSpecificMethod {
	@Test
	public void salesforce() throws InterruptedException {

		WebElement toggle = driver.findElement(By.xpath("//div[@class='slds-icon-waffle']"));
		toggle.click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		Thread.sleep(3000);
		WebElement legal = driver.findElement(By.xpath("//p[contains(text(),'Legal E')]"));
		Actions action = new Actions(driver);
		action.scrollToElement(legal).perform();
		legal.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='slds-button slds-button_reset'])[6]")).click();
		Thread.sleep(1500);
		WebElement entity = driver
				.findElement(By.xpath("(//one-app-nav-bar-menu-item[@class='slds-dropdown__item'])[1]"));
		entity.click();
		WebElement companyname = driver.findElement(By.xpath("//input[@name='CompanyName']"));
		companyname.sendKeys("TestLeaf");
		WebElement description = driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]"));
		description.sendKeys("Salesforces");

		WebElement status = driver.findElement(By.xpath(
				"//button[@class='slds-combobox__input slds-input_faux fix-slds-input_faux slds-combobox__input-value']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", status);

		status.click();
		driver.findElement(By.xpath("(//span[text()='Active'])[1]")).click();
		Thread.sleep(300);
		WebElement save = driver.findElement(By.xpath("//button[@name='SaveEdit']"));
		save.click();
		WebElement text = driver.findElement(By.xpath("//div[@class='slds-form-element__help']"));
		System.out.println("Alert Message : " + text.getText());
	}

}
