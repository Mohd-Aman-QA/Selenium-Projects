package A_Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P_3_LinkedText {

	public static void main(String[] args) throws InterruptedException {
		linkedText();
	}
	
	public static void linkedText() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://practicetestautomation.com/practice/");
		
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
		Thread.sleep(4000);
		WebElement testloginpage= driver.findElement(By.partialLinkText("Test Login Page"));
		testloginpage.click();
		
		Thread.sleep(4000);
		WebElement username=driver.findElement(By.name("username"));
		username.sendKeys("student");
		
		Thread.sleep(4000);
		WebElement searchbar= driver.findElement(By.id("password"));
		searchbar.sendKeys("Password123");
		
		Thread.sleep(4000);
		WebElement submit= driver.findElement(By.className("btn"));
		submit.click();
		
		Thread.sleep(4000);
		WebElement logout= driver.findElement(By.linkText("Log out"));
		logout.click();
	}
}
