package JavaSelenum;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProgram {

	public static void main(String[] args) {

		// 1. Lunch Chrome(browser)

		ChromeDriver driver = new ChromeDriver();

		// 2. Open Url : https://www.flipkart.com/
            String url = "https://demo.opencart.com/";
		driver.get(url);

		// 3. Validate Title should be "Your Store"

		String act_title = driver.getTitle();

		if (act_title.equals("Your Store"))
		{
			System.out.println("Test Passed");
		} 
		else 
		{
			System.out.println("Test Failed");

		}
		// 4. Close Browser
		driver.close();

	}

}
