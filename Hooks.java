package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Hooks extends BaseClasscucu {

	
	@Before
	public void precondition() {
		
		//Setting up the browser and chrome driver
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main/");
		
		
		//sending the username
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("DemoSalesManager");
		
		//sending the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//clicking on the CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		//clicking on Lead tab
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/leadsMain']"));
		
		
	}
	
	@After
	public void postCondition() {
	driver.close();
			}
}
