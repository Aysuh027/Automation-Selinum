package JavaSelenum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThirdProgram {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		String  url = "https://demo.opencart.com/";
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.name("search")).sendKeys("Mac");
		//driver.findElement(By.xpath("//div[@class='btn btn-light btn-lg']")).click();
	}

}
