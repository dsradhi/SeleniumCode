package autoITExample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoITEx {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.convertfiles.com/");
		Thread.sleep(4000);
		driver.findElement(By.name("uploadedfile")).click();
		Runtime.getRuntime().exec("cmd /C C:\\LearnJava\\FileUpload.exe");
	}

}
