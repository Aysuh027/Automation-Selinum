package Flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FPageInspect {
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		String url = "https://www.flipkart.com/";
		driver.get(url);
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("Iphone");
		

	}
}
