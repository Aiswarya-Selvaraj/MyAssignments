package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Loginpage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		//Used parent to child xpath
		driver.findElement(By.xpath("//div[@id='button']/a")).click();
		WebElement account = driver.findElement(By.linkText("Accounts"));
		Actions a=new Actions(driver);
		a.moveToElement(account).click().perform();
		driver.findElement(By.linkText("Accounts")).click();
		WebElement createacc = driver.findElement(By.xpath("//span[text()='Create Account']"));
		a.moveToElement(createacc).click().perform();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@name='accountName']")).sendKeys("Testabcdef");
		driver.findElement(By.xpath("//input[@name='primaryPhoneCountryCode']")).sendKeys("91");
		driver.findElement(By.xpath("//input[@name='primaryPhoneAreaCode']")).sendKeys("042");
		driver.findElement(By.xpath("//input[@name='primaryPhoneNumber']")).sendKeys("6577237");
		driver.findElement(By.xpath("//input[@name='primaryEmail']")).sendKeys("ghi@gmail.com");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[text()='Create Account']")).click();
}
}
