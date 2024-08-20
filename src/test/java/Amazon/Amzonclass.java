package Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amzonclass {
	
	public static void main(String[] args) {
		
		WebDriver  driver = new ChromeDriver();
		String url = "https://www.amazon.in/";
		driver.get(url);
	}

}
