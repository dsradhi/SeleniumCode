package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckboxEx {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nngroup.com/articles/checkboxes-vs-radio-buttons/");
		WebElement chkbox = driver.findElement(By.name("permission"));
		boolean state = chkbox.isSelected();
		if(state)
			System.out.println("checkbox already selected");
		else
			chkbox.click();
	}

}
