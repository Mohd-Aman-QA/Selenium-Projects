package A_Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P_6_AbsoluteXpath {

	public static void main(String[] args)throws InterruptedException {
		absoluteXpath();
	}
	
	public static void absoluteXpath() throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//driver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(3000);
		WebElement speaker=driver.findElement(By.xpath("html/body/div/div/div/div/div/div/div/div/div/div/div/div/div[2]/div/div/div[4]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div[3]"));
		speaker.click();
		
	}
}
