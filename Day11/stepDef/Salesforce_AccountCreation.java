package stepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Salesforce_AccountCreation {
	public ChromeDriver driver;
	public ChromeOptions options;

	@Given("Launch the browser and load the url")
	public void launch_the_browser_and_load_the_url() {

		options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);

		driver.navigate().to("https://login.salesforce.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(90));

	}

	@When("Enter the username as {string}")
	public void enter_the_username_as_dilip_testleaf_com(String user) {
		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys(user);

	}

	@When("Enter the password as {string}")
	public void enter_the_password_as_testleaf(String pass) {
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys(pass);

	}

	@When("Click on Login button")
	public void click_on_login_button() throws InterruptedException {
		WebElement login = driver.findElement(By.xpath("//input[@id='Login']"));
		login.click();
		Thread.sleep(3000);

	}

	@Then("click on toggle menu button from left corner")
	public void click_on_toggle_menu_button_from_left_corner() throws InterruptedException {
		WebElement toggle = driver.findElement(By.xpath("//div[@class='slds-icon-waffle']"));
		toggle.click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		Thread.sleep(3000);

	}

	@Then("select Sales from app launcher")
	public void select_sales_from_app_launcher() throws InterruptedException {
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		Thread.sleep(1500);

	}

	@Then("click on Accounts tab")
	public void click_on_accounts_tab() {
		driver.findElement(By.xpath("(//a[@class='slds-button slds-button_reset'])[5]")).click();

	}

	@Then("click on New button")
	public void click_on_new_button() {
		WebElement entity = driver
				.findElement(By.xpath("(//one-app-nav-bar-menu-item[@class='slds-dropdown__item'])[1]"));
		entity.click();

	}

	@Then("enter your name as account name")
	public void enter_your_name_as_account_name() {
		WebElement name = driver.findElement(By.xpath("//input[@name='Name']"));
		name.sendKeys("Varshni");

	}

	@Then("select Ownership as Public")
	public void select_ownership_as_public() throws InterruptedException {
		WebElement ownership = driver.findElement(By.xpath(
				"(//button[@class='slds-combobox__input slds-input_faux fix-slds-input_faux slds-combobox__input-value'])[3]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", ownership);

		ownership.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[text()='Public'])[1]")).click();

	}

	@Then("click Save")
	public void click_save() {
		WebElement save = driver.findElement(By.xpath("//button[@name='SaveEdit']"));
		save.click();

	}

	@Then("I should see the account name your name in the account list")
	public void i_should_see_the_account_name_your_name_in_the_account_list() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath(
				"//div[@class='slds-theme--success slds-notify--toast slds-notify slds-notify--toast forceToastMessage']"));
		String web = e.getText();
		System.out.println(web);
		if (web.contains("Varshni")) {
			System.out.println("Account successfully created");
		} else {
			System.out.println("Account not created");
		}

	}

}