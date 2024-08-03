package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonInteraction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://leafground.com/button.xhtml");
		driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(5000);
		driver.navigate().back();
		

		String btn = driver.findElement(By.xpath("//span[text()='Disabled']")).getText();
		boolean btns = driver.findElement(By.xpath("//span[text()='Disabled']")).isEnabled();
		if(btns==false);
		{
			System.out.println(btn);
		}
		
	
		 WebElement sub = driver.findElement(By.xpath("//span[text()='Submit']"));
		 System.out.println("The Position is : "+sub.getLocation());
		 
		 WebElement clr = driver.findElement(By.xpath("(//span[contains(@class,'ui-button-icon-left ui-icon')]/following-sibling::span)[2]"));
		 System.out.println("background colour of the button is : " +clr.getCssValue("background-color"));
		 
		 WebElement hig = driver.findElement(By.xpath("(//span[text()='Submit'])[2]"));
		 System.out.println("The height and width of the button is: " +hig.getSize());
		 
		
	driver.close();
		

	}

}
