package A_Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class P_1_Webdriver {

	public static void main(String[] args) {
		//chrome();
		//firefox();
		msedeg();
	}
	public static void chrome() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().minimize();
		
		driver.close();
	}
	
	public static void firefox() {
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().minimize();
		
		driver.close();
	}
	
	public static void msedeg() {
		System.setProperty("webdriver.edge.driver",System.getProperty("user.dir")+"\\driver\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().minimize();
		
		//driver.close();
	}
	
	public static void msedgenewversion() {
		System.setProperty("webdriver.edge.driver","C:\\Users\\lenovo\\Documents\\driver[1]\\driver\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
				
		        driver.get("https://www.flipkart.com/");
		     System.out.println("Page title: " + driver.getTitle());

	}
}
