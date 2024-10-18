package locator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathAxes {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
//		driver.get("https://www.target.com/");
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));

//		// capture descendant element 
//		driver
//		.findElement(By.xpath("//div[@class='sc-9ce4b6cf-0 hamaVj']/descendant::input"))
//		.sendKeys("Iphone");

		// capture element with self tag/ self-node
//		driver.findElement(By.xpath("//option[contains(text(), 'Red')]/self::option")).click();

//		// capture element with child tag
//		driver
//		.findElement(By.xpath("//span[@class='wikipedia-input-box']/child::input")).sendKeys("asd");

//		// capture element with parent tag/*
//		String textStatus = driver
//		.findElement(By.xpath("//*[starts-with(text(), 'Drag me to my target')]/parent::div")).getText();
//		System.out.println(textStatus);

//		// capture element with ancestor tag
//		      String textStatus = driver
//				.findElement(By.xpath("//p[contains(text(), 'Drop here')]/ancestor::div")).getText();
//		       System.out.println(textStatus);

//		// capture element with following-sibling
//		       String textStatus = driver
//			.findElement(By.xpath("//button[text()='Alert']/following-sibling::button")).getText();
//				       System.out.println(textStatus);

		// capture element with following-sibling
		String textStatus = driver.findElement(By.xpath("//button[text()='Prompt']/preceding-sibling::button[1]"))
				.getText();
		System.out.println(textStatus);

	}

}
