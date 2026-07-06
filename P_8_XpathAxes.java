package A_Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P_8_XpathAxes {

	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//driver//chromedriver.exe");
	     driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		//XpathAxesbyfollowing();
		//XpathAxesbypreceding();
		//XpathAxesbyfollowingSiblings();
		//XpathAxesbyprecedingSiblings();
		//XpathAxesbyparent();
		//XpathAxesbyAncestor();
		XpathAxesbychild();
		XpathAxesbyDescendant();
   }
	public static void XpathAxesbyfollowing() {
		WebElement appliances=driver.findElement(By.xpath("//a[@aria-label='Mobiles & Tablets']//following::img[@alt='TVs & Appliances']"));
		appliances.click();
	}
	
	public static void XpathAxesbypreceding() {
		WebElement home=driver.findElement(By.xpath("//span[text()='Become a Seller']//preceding::img[@alt='Flipkart']"));
		home.click();
	}
	public static void XpathAxesbyfollowingSiblings() {
		WebElement appliances=driver.findElement(By.xpath("//a[@aria-label='Mobiles & Tablets']//following-sibling::a[@aria-label='TVs & Appliances']"));
		appliances.click();
	}
	
	public static void XpathAxesbyprecedingSiblings() {
		WebElement home=driver.findElement(By.xpath("//a[@href='/plus']//preceding-sibling::a"));
		home.click();
	}
	
	public static void XpathAxesbyparent() {
		WebElement appliances=driver.findElement(By.xpath("//img[@alt='TVs & Appliances']//parent::div"));
		appliances.click();
	}
	
	public static void XpathAxesbyAncestor() {
		WebElement home=driver.findElement(By.xpath("//img[@title='Flipkart']//ancestor::div[2]"));
		home.click();
		
	/*	WebElement mobile=driver.findElement(By.xpath("//img[@alt='Mobiles & Tablets']//ancestor::div[3]"));
		mobile.click();  */
	}
	
	public static void XpathAxesbychild() {
		WebElement mobile=driver.findElement(By.xpath("//div//child::img[@alt='Mobiles & Tablets']"));
		mobile.click();
	}
	
	public static void XpathAxesbyDescendant() {
		WebElement home=driver.findElement(By.xpath("//div[@id='container']//descendant::img[@alt='Flipkart']"));
		home.click();
	}
}
