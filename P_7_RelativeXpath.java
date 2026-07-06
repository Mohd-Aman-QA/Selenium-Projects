package A_Webdriver;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class P_7_RelativeXpath{

		static WebDriver driver;
		static WebElement home;
		public static void main(String[] args)throws InterruptedException {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//driver//chromedriver.exe");
		     driver=new ChromeDriver();
			
			driver.get("https://www.flipkart.com/");
			
			
		    home=driver.findElement(By.xpath("//img[@title='Flipkart']"));
		    
			//XpathusingAttribute();
			//XpathusingContains();
			//XpathusingStart_with();
		    //XpathusingText();
		    //XpathusingContainsText();
		    XpathusingIndex();
		    //XpathusingAnd_Or();
		}
		
		public static void XpathusingAttribute() throws InterruptedException  {
			
			Thread.sleep(3000);
			WebElement mobile=driver.findElement(By.xpath("//a[@aria-label='Mobiles & Tablets']"));
			mobile.click();
			
		}
		
public static void XpathusingContains() throws InterruptedException  {
			
			Thread.sleep(3000);
			WebElement appliances=driver.findElement(By.xpath("//img[contains(@alt,'Applia')]"));
			appliances.click();
			
			
			 home=driver.findElement(By.xpath("//img[@title='Flipkart']"));
			home.click();
		}

public static void XpathusingStart_with() throws InterruptedException  {
	
	Thread.sleep(3000);
	WebElement appliances=driver.findElement(By.xpath("//img[starts-with(@alt,'TVs')]"));
	appliances.click();
	
	home=driver.findElement(By.xpath("//img[@title='Flipkart']"));
	home.click();
}

public static void XpathusingText() throws InterruptedException  {
	
	Thread.sleep(3000);
	WebElement appliances=driver.findElement(By.xpath("//span[text()='TVs & Appliances']"));
	appliances.click();
	
	home=driver.findElement(By.xpath("//img[@title='Flipkart']"));
	home.click();
}
public static void XpathusingContainsText() throws InterruptedException  {
	
	Thread.sleep(3000);
	WebElement appliances=driver.findElement(By.xpath("//span[contains(text(),'TVs &')]"));
	appliances.click();
	
	home=driver.findElement(By.xpath("//img[@title='Flipkart']"));
	home.click();
}

public static void XpathusingIndex() throws InterruptedException  {
	
	Thread.sleep(3000);
	WebElement appliances=driver.findElement(By.xpath("(//img[contains(@alt,'App')])[3]"));
	appliances.click();
	
	home=driver.findElement(By.xpath("//img[@title='Flipkart']"));
	home.click();
}

public static void XpathusingAnd_Or() throws InterruptedException  {
	
	Thread.sleep(3000);
	WebElement login=driver.findElement(By.xpath("//a[@title='Login' and @aria-haspopup='true']"));
	login.click();
	
	home=driver.findElement(By.xpath("//img[@title='Flipkart']"));
	home.click();
	
	Thread.sleep(3000);
	WebElement dots=driver.findElement(By.xpath("//a[@title='Login' or @aria-haspopup='true']"));
	dots.click();
}
}
