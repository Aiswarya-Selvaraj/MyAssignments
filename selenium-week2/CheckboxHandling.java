package selenium;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.findElement(By.xpath("//span[contains(text(),'Basic')]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Ajax')]")).click();
		String element = driver.findElement(By.xpath("//span[text()='Checked']")).getText();
		boolean text = driver.findElement(By.xpath("//span[text()='Checked']")).isDisplayed();
		if (text==true) {
			System.out.println(element);
		}
		
		driver.findElement(By.xpath("//label[text()='Python']")).click();		
		driver.findElement(By.xpath("//label[text()='Java']")).click();
		WebElement tristate = driver.findElement(By.xpath("(//div[@id='j_idt87:ajaxTriState']//div)[2]"));
		tristate.click();
		String text1 = driver.findElement(By.xpath("//p[text()='State = 1']")).getText();
		if(tristate.isDisplayed()==false)
		{
			System.out.println(text1);
		}
		else 
		{
			tristate.click();
			if(tristate.isDisplayed()==true) {
				String text2 = driver.findElement(By.xpath("//p[text()='State = 2']")).getText();
				System.out.println(text2);
			}
			
		}
		
		WebElement toggle = driver.findElement(By.className("ui-toggleswitch-slider"));
		toggle.click();
		String toggletext = driver.findElement(By.className("ui-growl-title")).getText();
		boolean tog = driver.findElement(By.className("ui-toggleswitch-slider")).isDisplayed();
		if (tog==true)
		{
			System.out.println(toggletext);
		}
		
		boolean dis = driver.findElement(By.xpath("(//div[contains(@class,'ui-selectbooleancheckbox ui-chkbox')])[3]")).isEnabled();
		System.out.println(dis);
		
		WebElement city = driver.findElement(By.xpath("//ul[contains(@class,'ui-selectcheckboxmenu-multiple-container ui-widget')]"));
		city.click();
		driver.findElement(By.xpath("(//label[text()='London'])[2]")).click();
		String london = driver.findElement(By.xpath("(//label[text()='London'])[2]")).getText();
		
		driver.findElement(By.xpath("(//label[text()='Paris'])[2]")).click();
		String paris = driver.findElement(By.xpath("(//label[text()='Paris'])[2]")).getText();
		if (city.isDisplayed()==true);
		{
			System.out.println("selected cities are: " +london+ "," +paris+"," );
		}
		
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-close']")).click();
		
		driver.close();
		
		
	
		

	}

}
