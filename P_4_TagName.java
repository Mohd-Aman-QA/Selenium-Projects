package A_Webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P_4_TagName {

	public static void main(String[] args) throws InterruptedException{
		Tagname();
	}
	public static void Tagname() throws InterruptedException {
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
		List<WebElement> links =driver.findElements(By.tagName("a"));
		int numberoflinks=links.size();
		System.out.println(numberoflinks);
		
		int count=1;
		for(WebElement link:links) {
			String url=link.getAttribute("href");
			System.out.println("url "+count+": "+url);
			count++;
		}
			List<WebElement> images =driver.findElements(By.tagName("img"));
			int numberofimages=images.size();
			System.out.println(numberofimages);
			
			int count1=1;
			for(WebElement image:images) {
				String imageurl=image.getAttribute("src");
				System.out.println("url "+count1+": "+imageurl);
				count1++;
		}
}
}