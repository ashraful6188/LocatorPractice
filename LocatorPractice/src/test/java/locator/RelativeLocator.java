package locator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RelativeLocator {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		
		// capture element with relative Xpath in single attribute
//		driver.findElement(By.xpath("//textarea[@id='textarea']")).sendKeys("wer");
		
		// capture element with relative Xpath in single attribute with *
//		driver.findElement(By.xpath("//*[@id='textarea']")).sendKeys("wer");

		// capture element with relative Xpath in multiple attribute
//		   driver.
//		   findElement(By.xpath("//textarea[@id='textarea'][@class='form-control']")).sendKeys("werr");

		// capture element with relative Xpath in multiple attribute without tag
//		 driver.
//		 findElement(By.xpath("//*[@id='textarea'][@class='form-control']")).sendKeys("rr");
		
		// capture element with relative Xpath in multiple attribute with and operator
//		 driver.
//		 findElement(By.xpath("//*[@id='textarea'and
//		 @class='form-control']")).sendKeys("ttt");

		// capture element with relative Xpath in multiple attribute with or operator
//    	driver.
//    	findElement(By.xpath("//input[@class='wikipedia-search-input' or @type='we']")).sendKeys("ttt");

		// capture element with relative Xpath with text() method
		// text() only work with linktext and inner text
//		boolean textStatus = 
//				driver.findElement(By.xpath("//h2[text()=\"New Browser Window\"]")).isDisplayed();
//		System.out.println(textStatus);
		
		// capture element with relative Xpath with text() method
		// text() only work with linktext and inner text without tag
		boolean textStatus = 
				driver.findElement(By.xpath("//*[text()=\"New Browser Window\"]")).isDisplayed();
		System.out.println(textStatus);
		
		// capture element with relative Xpath with contains() method
		// contains() can work with full attribute value or half attribute value with tag
//	     boolean textStatus2 = 
//		driver.findElement(By.xpath("//button[contains(@onclick, 'myFunction()')]")).isDisplayed();
//		System.out.println(textStatus2);
//		
		// capture element with relative Xpath with contains() method
		// contains() can work with full attribute value or half attribute value without tag
//		boolean textStatus3 = 
//				driver.findElement(By.xpath("//*[contains(@onclick, 'ction()')]")).isDisplayed();
//		System.out.println(textStatus3);
		
	
		
//		// capture element with relative Xpath with starts-with() method
//		// statrts-with() can work with full attribute value or 
//		//half attribute value beggining of the text with tag
//	    driver.findElement(By.xpath("//button[starts-with(@onclick, 'myFunction()')]")).click();
	       
	    
//	    // capture element with relative Xpath with starts-with() method
//	    // statrts-with() can work with full attribute value or 
//	    //half attribute value beggining of the text without tag
//	    driver.findElement(By.xpath("//*[starts-with(@onclick, 'myFun')]")).click();
	
		
		
		
		
		
		
		
		
		

	}

}
