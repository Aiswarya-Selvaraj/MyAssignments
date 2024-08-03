package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DeleteLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
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
		
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		//driver.findElement(By.name("phoneCountryCode")).sendKeys("1");
		driver.findElement(By.name("phoneAreaCode")).sendKeys("212");
		driver.findElement(By.name("phoneNumber")).sendKeys("681-3029");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
			
		String text1 = driver.findElement(By.xpath("//a[@href='/crmsfa/control/viewLead?partyId=DemoLead1'][1]")).getText();
		System.out.println(text1);
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/viewLead?partyId=DemoLead1'][1]")).click();
		driver.findElement(By.linkText("Delete")).click();
		
		driver.close();
		
	}

}
