package A_Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class M1_practiceClass {


	
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\lenovo\\Documents\\driver[1]\\driver\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
	
		
		driver.get("https://www.amazon.in");
		
		WebElement mobile=driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']"));
		mobile.sendKeys("mobile");
		
		WebElement search=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		search.click();
		WebElement home=driver.findElement(By.xpath("//div[@id='nav-global-location-slot']//preceding::a[@id='nav-logo-sprites']"));
		home.click();
		
	}
	
}
