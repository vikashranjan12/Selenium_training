package seleniumTaining;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleTabcitiBank {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://online.citibank.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );
		String titleofPage=driver.getTitle();
		System.out.println(titleofPage);
		
		driver.findElement(By.xpath("//img[@class='appClose']")).click();
		
		driver.findElement(By.linkText("APPLY FOR CREDIT CARDS")).click();
	    
		String titleofPage2=driver.getTitle();
		System.out.println(titleofPage2);
		
		//switch to window tab
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		
		
		Set<String> window=driver.getWindowHandles();
		
		for(String win : window)
		{
			System.out.println(win);
			driver.switchTo().window(win);
			System.out.println(driver.getTitle());
			
		}
		
		
		driver.findElement(By.id("Email_Id")).sendKeys("vik@gmail.com");
		
		Thread.sleep(5000);
		//alert handling
		driver.switchTo().alert().accept();
		
		driver.findElement(By.linkText("Travel")).click();
		driver.findElement(By.id("Email_Id")).sendKeys("vik@gmail.com");
		driver.findElement(By.id("mobile_number")).sendKeys("9574417894");
		driver.findElement(By.id("FirstName")).sendKeys("john kal");
		
		
		//radio button
		driver.findElement(By.xpath("//input[@id='existcust' and @value='Yes']" )).click();
		


	   Thread.sleep(5000);
	   //driver.close();
    }
		
		
		
		
		

}
