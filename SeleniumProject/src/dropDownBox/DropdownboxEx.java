package dropDownBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownboxEx {

	public static void main(String[] args) {
		
			WebDriver driver = new FirefoxDriver();
			driver.get("http://amazon.in");
			WebElement dropdownAll = driver.findElement(By.id("searchDropdownBox"));

			
			Select sel = new Select(dropdownAll);
			
			
			List<WebElement> items = sel.getOptions();
			
			System.out.println(items.size());
			
			for(int i=0;i<items.size();i++) {
				if(items.get(i).getText().equals("Clothing & Accessories ")) {
					System.out.println("item found");
					i=items.size();
				} else if(i==items.size()-1) {
					System.out.println("item not found");
				}
			}
	}

}
