package seleniumTaining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class GotoMeeting {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.gotomeeting.com/en-in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );
		String titleofPage=driver.getTitle();
		System.out.println(titleofPage);
		driver.findElement(By.linkText("Start for Free")).click();
		
		driver.findElement(By.linkText("first-name")).sendKeys("abc");
		driver.findElement(By.linkText("last-name")).sendKeys("abc");
		
		driver.findElement(By.linkText("login__email")).sendKeys("abc@gmail.com");
		Select joobtitle=new Select(driver.findElement(By.id("JobTitle")));
		joobtitle.selectByVisibleText("Engineering");
	}

}
