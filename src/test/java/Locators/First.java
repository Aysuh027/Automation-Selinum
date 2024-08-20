package Locators;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		String url = "https://demo.opencart.com/";
		driver.get(url);
		driver.manage().window().maximize();
		//1.Name
		driver.findElement(By.name("search")).sendKeys("Iphone");
        //2. Id
		boolean b = driver.findElement(By.id("logo")).isDisplayed();
		System.out.println(b);
        //3.Linktext
		
		//driver.findElement(By.linkText("Cameras")).click();
		driver.findElement(By.linkText("Tablets")).click();
		
	}

}
