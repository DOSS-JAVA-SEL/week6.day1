package StepDefinitions;



	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;

	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;
	import io.github.bonigarcia.wdm.WebDriverManager;

	public class LoginStep extends BaseClasscucu
	{
		
	//Create	
		@Given(" Click the Create Lead {string}")

			public void clickCreateLead(String createLeadButton) {
			driver.findElement(By.linkText(createLeadButton)).click();
		}
		@Given("Enter the company name {string}")
			public void enterCompanyName(String companyName) {
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
				
			}
			@Given("Enter the first name {string}")
			public void enterFirstName(String firstName) {
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
				
			}
			@Given("Enter the last name {string}")
			public void enterLastName(String lastName) {
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
			}
			@When("Click tab create lead")
			public void clickOnCreateLead() {
				driver.findElement(By.name("submitButton")).click();
			}
			@Then("Lead creation")
			public void leadCreated() {
				System.out.println(driver.getTitle());
				System.out.println("Lead is created");
			}
			
			
		//Update	
				@Given("Click Find Lead")
				public void findLeads() {
					driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
				    
				}
				
				@Given("Enter first name {string}")
				public void enterName(String firstName) {
					driver.findElement(By.xpath("(//div[@class='x-form-element']//input[@name='firstName'])[3]")).sendKeys(firstName);
				    
				}
				
				@Given("Click Find Lead for result")
				public void ClickOnFindLead() throws InterruptedException {
					driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
					Thread.sleep(2000);			}
				@Given("click on first resulting data")
				public void clickOnFirstResultingData() throws InterruptedException {
					driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).click();
					String pageTitle=driver.getTitle();
					System.out.println(pageTitle);
					Thread.sleep(2000);
				}
				@Given("Click edit")
				public void clickEdit() {
					driver.findElement(By.xpath("//div[@class='frameSectionExtra']/a[text()='Edit']")).click();
				}
				@Given("Update company name {string}")
				public void updateCompanyName(String companyName) {
					WebElement oldCompanyName=driver.findElement(By.xpath("(//input[@name='companyName'])[2]"));
					oldCompanyName.clear();
					oldCompanyName.sendKeys(companyName);
					
				}
				@Given("Click update button")
				public void clickUpdateButton() {
					driver.findElement(By.xpath("//input[@value='Update']")).click();
				}
				@Then("verify the updated data")
				public void verifyTheUpdatedData() {
					WebElement name=driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']"));
					String firstName=name.getText();
					
					if( firstName.contains("Info"))
					{
						System.out.println("Company name updated");
					}
					else
					{
						System.out.println("failed");
					}
					
					System.out.println("Edited");
					
				}
				
				
		//Duplicate
				@Given("Find Lead")
				public void findLead() {
					driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
				}
				@Given("click email tab")
				public void clickEmailTab() {
					driver.findElement(By.xpath("//span[text()='Email']")).click();
				}
				@Given("Enter email address")
				public void enterEmailAddress() {
					driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("babu@testleaf.com");
				}
				@Given("Click find lead filter")
				public void clickFindLeadFilter() throws InterruptedException {
					driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
					Thread.sleep(5000);
				}
				@Given("click first resulting data")
				public void clickFirstResultingData() throws InterruptedException {
					WebElement firstName = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a"));
					String name = firstName.getText();
					System.out.println("First resulting name is " + name);
					Thread.sleep(5000);
					firstName.click();
				}
				@Given("duplicate click")
				public void duplicateClick() {
					driver.findElement(By.xpath("//div[@class='frameSectionExtra']/a[text()='Duplicate Lead']")).click();
					}
				@Then("verify duplicate")
				public void verifyDuplicate() {
					WebElement pageTitle = driver.findElement(By.xpath("//div[@id='sectionHeaderTitle_leads']"));
					String title = pageTitle.getText();
					//System.out.println(title);
					//System.out.println(expectedTitle);
					// Thread.sleep(2000);
					String expectedTitle = "Duplicate Lead";
					if (title.matches(expectedTitle)) {
						System.out.println("Check passed expected title matches the opened page");
					} else {
						System.out.println("Check failed expected title doesnot match the opened page");
					}
					// driver.findElement(By.xpath("//div[@class='frameSectionBody']//a[text()='Create
					// Lead']")).click();
					WebElement detailPageName = driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']"));
					//System.out.println(detailPageName.getAttribute("value"));
					String duplicatePageName = detailPageName.getAttribute("Value");
					System.out.println("First resulting name is " + duplicatePageName);
					// Thread.sleep(5000);
					//Login name=new Login();
					
					
					
			System.out.println("Duplicated");
				}
				

				
				
			//Delete

	@Given("Enter first name")
	public void enterFirstName() {
		driver.findElement(By.xpath("(//div[@class='x-tab-panel-bwrap']//div[@class='x-form-element']/input)[2]")).sendKeys("Doss");
	}
	@Given("Click filter Find lead")
	public void clickFilterFindLead() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
	}
	@Given("delete click")
	public void deleteClick() {
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
	}
	@Then("verify delete")
	public void verifyDelete() throws InterruptedException {
		driver.findElement(By.xpath("//div[contains(@class,'x-grid3-cell-inner')]/a[@class='linktext']"))
		.getAttribute("value");

	WebElement output = driver
		.findElement(By.xpath("//div[contains(@class,'x-grid3-cell-inner')]/a[@class='linktext']"));
	String leadId = output.getText();

	System.out.println(leadId);
	output.click();
	driver.findElement(By.xpath("//a[text()='Delete']")).click();
	driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
	driver.findElement(By.xpath("//span[text()='Phone']")).click();
	driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9677699819");
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	Thread.sleep(2000);
	WebElement news = driver.findElement(By.xpath("//div[@class='x-paging-info']"));
	String result = news.getText();
	System.out.println(result);
	System.out.println("It is deleted");
	}
	}

		
