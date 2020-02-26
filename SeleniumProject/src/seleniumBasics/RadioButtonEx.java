package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonEx {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nngroup.com/articles/checkboxes-vs-radio-buttons/");
		WebElement radiobtn = driver.findElement(By.id("five"));
		boolean state = radiobtn.isSelected();
		if(state)
			System.out.println("checkbox already selected");
		else
			radiobtn.click();

	}

}
