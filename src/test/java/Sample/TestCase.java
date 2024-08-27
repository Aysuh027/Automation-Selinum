package Sample;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase {
	
	
	WebDriver driver;
	
	@Test
	public void TestCase1() throws InterruptedException 
	{
	
		WebDriverManager.chromedriver().setup(); 
		driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://oaza.energy/login");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("vivek00532@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Bittu@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();		
		
		driver.findElement(By.xpath("//span[contains(text(),'Route planner')]")).click();		
		driver.findElement(By.id("starting_location")).sendKeys("Delhi");
	
		driver.findElement(By.id("starting_location")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(100);
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.TAB).perform();			
		
		driver.findElement(By.name("end_point")).sendKeys("Pune");
		Thread.sleep(100);
		driver.findElement(By.name("end_point")).sendKeys(Keys.ARROW_DOWN);
	    actions.sendKeys(Keys.TAB).perform();
		
		
		driver.findElement(By.xpath("//button[text()='Go!']")).click();

		
		
	}

}
