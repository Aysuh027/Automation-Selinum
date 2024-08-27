package Sample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase1 {
	
	
	WebDriver driver;
	
	@Test
	public void TestCase1() throws InterruptedException 
	{
	
		WebDriverManager.chromedriver().setup(); 
		driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://oaza.energy/login");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("vivek00532@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Bittu@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();		
		
		driver.findElement(By.xpath("//span[contains(text(),'Route planner')]")).click();		
		driver.findElement(By.id("starting_location")).sendKeys("Delhi");
		Thread.sleep(1000);
		driver.findElement(By.id("starting_location")).sendKeys(Keys.ARROW_DOWN);
		
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.TAB).perform();			
		
		driver.findElement(By.name("end_point")).sendKeys("Pune");
		Thread.sleep(1000);
		driver.findElement(By.name("end_point")).sendKeys(Keys.ARROW_DOWN);
	    actions.sendKeys(Keys.TAB).perform();		
		
		driver.findElement(By.xpath("//button[text()='Go!']")).click();
		
		By divLocator = By.xpath("//div[@role='button'][8]");
        By buttonLocator = By.xpath("//button[normalize-space(text())='Add to Trip']");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
        WebElement divElement = wait.until(ExpectedConditions.presenceOfElementLocated(divLocator));
        actions.moveToElement(divElement).perform();
        WebElement addToTripButton = wait.until(ExpectedConditions.visibilityOfElementLocated(buttonLocator));
        addToTripButton.click();
		
	}

}