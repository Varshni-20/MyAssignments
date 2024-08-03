package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("//input[@id=\"createLeadForm_firstName\"]")).sendKeys("a");
		driver.findElement(By.xpath("//input[@id=\"createLeadForm_lastName\"]")).sendKeys("b");
		driver.findElement(By.xpath("//input[@id=\"createLeadForm_firstNameLocal\"]")).sendKeys("ab");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("CSE");
		WebElement description=driver.findElement(By.id("createLeadForm_description"));
		description.sendKeys("DESC");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Desc@gmail.com");
		WebElement e=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select options=new Select(e);
		options.selectByVisibleText("New York");
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		Thread.sleep(700);
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Imp");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		System.out.println(driver.getTitle());
		driver.close();
		
		

	}

}
