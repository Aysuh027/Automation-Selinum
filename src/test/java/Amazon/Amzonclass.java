package Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amzonclass {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver  driver = new ChromeDriver();
		String url = "https://www.amazon.in/";
		driver.get(url);
	}

}
