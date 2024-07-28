package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountwithSelect {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Varsh");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		WebElement industry=driver.findElement(By.xpath("//select[@name='industryEnumId']"));
		Select options=new Select(industry);
		options.selectByVisibleText("Computer Software");
		WebElement Ownership=driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
		Select option=new Select(Ownership);
		option.selectByVisibleText("S-Corporation");
		WebElement Source=driver.findElement(By.xpath("//select[@name='dataSourceId']"));
		Select options2=new Select(Source);
		options2.selectByValue("LEAD_EMPLOYEE");
		WebElement Campaign=driver.findElement(By.xpath("//select[@name='marketingCampaignId']"));
		Select options3=new Select(Campaign);
		options3.selectByIndex(5);
		WebElement State=driver.findElement(By.xpath("//select[@name='generalCountryGeoId']"));
		Select options4=new Select(State);
		options4.selectByValue("ATA");
		driver.findElement(By.linkText("Create Account")).click();
		//driver.close();
		
		
		
	
		

	}

}
