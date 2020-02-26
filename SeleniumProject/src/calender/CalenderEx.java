package calender;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderEx {

	public static void main(String[] args) {
		
		CalenderEx cal = new CalenderEx();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.apsrtconline.in/oprs-web");
		driver.findElement(By.name("txtJourneyDate")).click();
		List<WebElement> rows = driver.findElements(By.xpath("(.//table[@class='ui-datepicker-calendar'])[1]/tbody/tr"));
		
		outerloop:for(int i=1;i<=rows.size();i++) {
			List<WebElement> cols = driver.findElements(By.xpath("(.//table[@class='ui-datepicker-calendar'])[1]/tbody/tr["+i+"]/td"));
			System.out.println(cols.size());
			innerloop: for(int j=1;j<=cols.size();j++) {
				WebElement ele = driver.findElement(By.xpath("(.//table[@class='ui-datepicker-calendar'])[1]/tbody/tr["+i+"]/td["+j+"]"));
				String date = ele.getText();
				cal.selectDate(ele,date);
			}
		}
	}
	public void selectDate(WebElement ele,String date) {
		if(date.equals("28")) {
			ele.click();
		}
	}
}
