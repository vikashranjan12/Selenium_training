package seleniumTaining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropdwnWithoutSelectTagRoyalCaribbean {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.royalcaribbean.com/");
		
		if(driver.findElements(By.xpath("//*[@class='email-capture__close']")).size()>0)
		{
			if(driver.findElement(By.xpath("//*[@class='email-capture__close']")).isDisplayed())
			{
				driver.findElement(By.xpath("//*[@class='email-capture__close']")).click();
			}
		}
		
		//click on sign in
		driver.findElement(By.id("rciHeaderSignIn")).click();
		//click on create an account 
		driver.findElement(By.linkText("Create an account")).click();
		//enter firstname as Dennis
		driver.findElement(By.xpath("//input[@data-placeholder='First name/Given name']")).sendKeys("Dennis");
		//lastname as riche
		driver.findElement(By.xpath("//input[@data-placeholder='Last name/Surname']")).sendKeys("Richie");
		
		//Dropdown month select without select tag i.ewith span/div etc 
		driver.findElement(By.xpath("//span[text()='Month']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='December']")).click();
		
		//day - 30 
		driver.findElement(By.xpath("//span[text()='Day']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='30']")).click();
		
		// year -1992
		driver.findElement(By.xpath("//input[@data-placeholder='Year']")).sendKeys("Richie");
		//country as India
		driver.findElement(By.xpath("//span[text()='Country/Region of residence']")).click();
		
		driver.findElement(By.xpath("//span[normalize-space()='India']")).click();
		//driver.findElement(By.xpath("(//span[contains(text(),'India')])[2]")).click();
		//check terms and condition
		
		//this check box is hidden not able to click with span tag we are getting error so use
		//use java script or go for input tag
		driver.findElement(By.xpath("//input[@aria-labelledby='agreements']/..")).click();
		
	}

}
