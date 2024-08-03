package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Used parent to child xpath
		driver.findElement(By.xpath("//div[@id='button']/a")).click();
		
		//navigate to leads tab and click on leads
		WebElement crrld = driver.findElement(By.linkText("Leads"));
		Actions a = new Actions(driver);
		a.moveToElement(crrld).click().build().perform();
		
		//navigate to create leads
		WebElement create = driver.findElement(By.xpath("//a[text()='Create Lead']"));
		a.moveToElement(create).click().build().perform();
		
		//enter the required details
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Test");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("TestPriya");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Ram");
		driver.findElement(By.xpath("//input[@name='generalProfTitle']")).sendKeys("Tester");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		//title of the page
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.close();
		
	}

}
