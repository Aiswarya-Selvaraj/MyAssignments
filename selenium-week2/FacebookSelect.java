package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		driver.get("https://en-gb.facebook.com/");
		//Used partial match xpath
		driver.findElement(By.xpath("//a[contains(@class,'_6lti ')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("abcdefg");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("hijklmnop");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("1234abcd");
		
		//drop down by select
		WebElement dropd= driver.findElement(By.xpath("//select[@id='day']"));
		Select a = new Select(dropd);
		a.selectByVisibleText("20");
		
		WebElement dd = driver.findElement(By.xpath("//select[@id='month']"));
		Select aa = new Select(dd);
		aa.selectByVisibleText("Apr");
		
		WebElement ddown = driver.findElement(By.xpath("//select[@id='year']"));
		Select aaa = new Select(ddown);
		aaa.selectByVisibleText("1995");
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		
		
		
		
	

	}

}
