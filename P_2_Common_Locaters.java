package A_Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P_2_Common_Locaters {

	public static void main(String[] args) throws InterruptedException{
		commonlocater();
	}
	public static void commonlocater() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		driver.manage().window().minimize();
		
		String expectedTitle ="Test Login | Practice Test Automation";
		
		String actualTitle =driver.getTitle();
		
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("Website Opened Successfully");
		}
		else {
			System.out.println("Website Opened unsuccessfully");
			System.out.println("actualTitlegot"+actualTitle+"ExpectedTitleWas "+expectedTitle);
		}
		//Common Locaters= id, name ,class name
		
		Thread.sleep(4000);
		WebElement searchbar=driver.findElement(By.name("username"));
		searchbar.sendKeys("student");
		
		Thread.sleep(4000);
		WebElement searchbutton=driver.findElement(By.id("password"));
		searchbutton.sendKeys("Password123");
		
		Thread.sleep(4000);
		WebElement submitbutton=driver.findElement(By.className("btn"));
		submitbutton.click();
	}
}
