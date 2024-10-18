package locator;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicLocator {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		// launch application
		driver.get("https://www.target.com/");
		// driver.get("https://retail.onlinesbi.sbi/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		// element capture by id
		driver.findElement(By.id("search")).sendKeys("Apple");
		// element capture by name
//		driver.findElement(By.name("searchTerm")).sendKeys("samsung");
		// element capture by tagName
//		List<WebElement> elements = driver.findElements(By.tagName("img"));
//		System.out.println(elements.size());
		// elements capture by linkText
//		driver.findElement(By.linkText("Target Circle™")).click();
		// capture element by partial linkText
//		driver.findElement(By.partialLinkText("stry")).click();
		// elements capture by className
//		List<WebElement> elements2 = driver.findElements(By.className("styles_utilityLink__Bh2js"));
//		System.out.println(elements2.size());

		// close the application
		// driver.close();

	}

}
