package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageTitleTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver(); // opens firefox browser
		driver.manage().window().maximize();
		driver.get("http://www.google.in");
		String actualTitle = driver.getTitle();
		String expectedTitle="Google";
		boolean result = actualTitle.equals(expectedTitle);
		if(result)
			System.out.println("Pass");
		else
			System.out.println("Fail");
	}

}
