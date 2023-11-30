package Jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JenkinsTest {
	
	public void ts1_test() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		System.out.println("Browser launched");
	}

}
