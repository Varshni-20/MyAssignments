package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SalesforceDynamic extends ProjectSpecificMethod {
	@DataProvider(name = "Legal Entity name")
	public String[][] createEntity() {
		String[][] data = new String[][] { { "SalesForce Automation by Varshu" },
				{ "SalesForce Automation by Varshni" } };
		return data;
	}

	@Test(dataProvider = "Legal Entity name")
	public void salesforce(String value) throws InterruptedException {

		WebElement toggle = driver.findElement(By.xpath("//div[@class='slds-icon-waffle']"));
		toggle.click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		Thread.sleep(3000);
		WebElement legal = driver.findElement(By.xpath("//p[contains(text(),'Legal E')]"));
		Actions action = new Actions(driver);
		action.scrollToElement(legal).perform();
		legal.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='slds-button slds-button_reset'])[14]")).click();
		Thread.sleep(1500);
		WebElement entity = driver
				.findElement(By.xpath("(//one-app-nav-bar-menu-item[@class='slds-dropdown__item'])[1]"));
		entity.click();
		WebElement name = driver.findElement(By.xpath("//input[@name='Name']"));
		name.sendKeys(value);
		WebElement save = driver.findElement(By.xpath("//button[@name='SaveEdit']"));
		save.click();
		WebElement e = driver.findElement(By.xpath(
				"//div[@class='slds-theme--success slds-notify--toast slds-notify slds-notify--toast forceToastMessage']"));
		String web = e.getText();
		System.out.println(web);

	}
}