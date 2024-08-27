package oazaenergy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testcase {
	public void testcase1() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://oaza.energy//login");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("vivek00532@gmail.com");
		driver.findElement(By.name("password")).sendKeys("bittu@0123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//span[contain(text();'route planner')]")).click();
		driver.findElement(By.id("starting location")).sendKeys("Delhi");
		Thread.sleep(1000);
		driver.findElement(By.id("starting_location")).sendKeys(Keys.ARROW_DOWN);
		Actions actions=new Actions(driver);
		actions.sendKeys(Keys.TAB).perform();
		driver.findElement(By.name("end_point")).sendKeys("Pune");
		Thread.sleep(1000);
		driver.findElement(By.name("end point location")).sendKeys(Keys.ARROW_DOWN);
		actions.sendKeys(Keys.TAB).perform();
		driver.findElement(By.xpath("//button[text()=go!]")).click();
		By divlocator=By.xpath("//div[@role='button'][8]");
		By buttonlocator=By.xpath("//button[normalize-space(text())='add to trip']");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement divelement=wait.until(ExpectedConditions.presenceOfElementLocated(divlocator));
		actions.moveToElement(divelement).perform();
		WebElement addtoTripbutton=wait.until(ExpectedConditions.visibilityOfElementLocated(buttonlocator));
		addtoTripbutton.click();
		
		
		
		
		
	}
	
	
	
		
	
	}


