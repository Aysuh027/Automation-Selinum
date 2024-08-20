package YourStore;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageIncpect {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		String url = "https://demo.opencart.com/";	
		driver.get(url);
		driver.manage().window().maximize();
		
		  // driver.findElement(By.name("search")).sendKeys("Mac");
        
		
       // boolean logo =driver.findElement(By.id("logo")).isDisplayed();
       // System.out.println(logo);
        
        //driver.findElement(By.linkText("Cameras")).click();
        
        //List<WebElement> headerLinks =driver.findElements(By.className("list-inline-item"));
        //System.out.println("Total Number of HeaderLink : " +headerLinks.size());
		
		List<WebElement> image = driver.findElements(By.tagName("img"));
		System.out.println("Total Number of Image :" +image.size());
		
		List<WebElement> Links = driver.findElements(By.tagName("a"));
		System.out.println("Total Number of Image :" +Links.size());
		
		
	}

}
