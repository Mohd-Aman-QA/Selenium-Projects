package A_Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P_5_CSS_Selectors {

	public static void main(String[] args)throws InterruptedException {
		cssSelectors();
	}
	public static void cssSelectors() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://practicetestautomation.com/practice-test-login/");
	
	String expectedTitle="Test Login | Practice Test Automation";
	String actualTitle=driver.getTitle();
	
	if(expectedTitle.equals(actualTitle)){
		System.out.println("Website opened successfully");
	}
	else {
		System.out.println("Website opened unsuccessfully");
		System.out.println("expected Title is :"+expectedTitle+"actual Title is :"+actualTitle);
	}
	
	//driver.findElement(By.xpath("//input[@title='Search for Products']")).sendKeys("mobile");
	
	Thread.sleep(4000);
	WebElement searchbar=driver.findElement(By.cssSelector("input[name='username']")); // Attribute Selector
	searchbar.sendKeys("student");
	
	Thread.sleep(4000);
	WebElement searchbutton=driver.findElement(By.cssSelector("#password")); // id Selector
	searchbutton.sendKeys("Password123");
	
	Thread.sleep(4000);
	WebElement submitbutton=driver.findElement(By.cssSelector(".btn")); // class Selector
	submitbutton.click();

	driver.get("https://www.flipkart.com/");
	
	Thread.sleep(4000);
	WebElement searchbar1=driver.findElement(By.cssSelector("input[title^='Search for Products']")); // Prefix matching Selector
	searchbar1.sendKeys("mobile",Keys.ENTER);
/*	
	Thread.sleep(4000);
	WebElement searchbar2=driver.findElement(By.cssSelector("input[title$='Brands and More']")); //suffix matching Selector
	searchbar2.sendKeys("mobile",Keys.ENTER);
	
	Thread.sleep(4000);
	WebElement searchbar3=driver.findElement(By.cssSelector("input[title*=' Products, Brands ']")); //substring matching Selector
	searchbar3.sendKeys("mobile",Keys.ENTER);
	
	//input[title='Search for Products, Brands and More']
*/	
	
	}
}
