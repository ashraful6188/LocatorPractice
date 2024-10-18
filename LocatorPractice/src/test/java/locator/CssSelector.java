package locator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelector {
	
	public static void main(String[]args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	
		// capture element by tag#valueOfId
	//	driver.findElement(By.cssSelector("input#name")).sendKeys("Ashraful");

		// capture element by #valueOfId 
	//	driver.findElement(By.cssSelector("#name")).sendKeys("Ashraful");

		// capture element by tag.classValue
	//	driver.findElement(By.cssSelector("input.wikipedia-search-input")).sendKeys("haq");

		// capture element by .classValue
	//	driver.findElement(By.cssSelector(".wikipedia-search-input")).sendKeys("haq");

		// capture element by tag[attribute=\"value\"]
	//	driver.findElement(By.cssSelector("input[type=\"text\"]")).sendKeys("Ashraful");
		
		// capture element by tag[attribute='value']
	//		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Ashraful");

		// capture element by [attribute=\"value\"]
   //  	   driver.findElement(By.cssSelector("[type=\"text\"]")).sendKeys("Ashraful");
		
			// capture element by [attribute='value']
	//		 	driver.findElement(By.cssSelector("[type= 'text']")).sendKeys("Ashraful");

			// capture element by tag.class_value[attribute=\"value\"]
	//	      driver.findElement(By.cssSelector("input.form-control[type=\"text\"]")).sendKeys("As");
  
		// capture element by tag.class_value[attribute='value']
	//	driver.findElement(By.cssSelector("input.form-control[type='text']")).sendKeys("A");
	
		// capture element by .class_value[attribute=\"value\"]
	//	 driver.findElement(By.cssSelector(".form-control[type=\"text\"]")).sendKeys("AA");
		
		 // Capture element by .class_value[attribute='value']
       	driver.findElement(By.cssSelector("input.form-control[type='text']")).sendKeys("Mona");
		


		
	//	driver.quit();
		
		
	}

}
