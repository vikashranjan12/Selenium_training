package seleniumTaining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HDFC_Login_Frame {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );
		String titleofPage=driver.getTitle();
		System.out.println(titleofPage);
		
		driver.switchTo().frame("login_page");
		
		driver.findElement(By.name("fldLoginUserId")).sendKeys("test123");
		driver.findElement(By.xpath("//img[@alt='continue']")).sendKeys("test123");
		
		driver.switchTo().defaultContent();
		
	}
			

}
