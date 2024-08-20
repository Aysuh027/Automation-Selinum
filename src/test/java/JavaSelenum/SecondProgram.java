package JavaSelenum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class SecondProgram {
    public static void main(String[] args) {
		
    	WebDriver driver = new ChromeDriver();
    	 //WebDriver driver = new EdgeDriver();
    	
    	String url = "https://www.flipkart.com/";
    	driver.get(url);
    	
    	String getTitle = driver.getTitle();
    	
    	if(getTitle.equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"))
    	{
    		System.out.println("Test Passed");
    	}
    	else
    	{
    		System.out.println("Test Failed");
    	}
    	
    	driver.close();
	}
}
