package seleniumTaining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeHRM {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );
		String titleofPage=driver.getTitle();
		System.out.println(titleofPage);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("menu_pim_viewMyDetails")));
		String url=driver.getCurrentUrl();
		driver.findElement(By.className("current main-menu-first-level-list-item")).click();
		
		driver.findElement(By.partialLinkText("Emergency Contacts")).click();
		driver.findElement(By.xpath("input[@id='btnAddContact']")).click();
		
		driver.findElement(By.xpath("input[@id='emgcontacts_name']")).sendKeys("xyz");
		driver.findElement(By.xpath("input[@id='emgcontacts_relationship']")).sendKeys("abc");
		driver.findElement(By.xpath("input[@id='emgcontacts_homePhone']")).sendKeys("234");
		
		driver.findElement(By.id("btnSaveEContact")).click();
   
	}

}
