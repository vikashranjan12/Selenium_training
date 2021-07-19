package seleniumTaining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusSignin {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );
		String titleofPage=driver.getTitle();
		System.out.println(titleofPage);
		driver.findElement(By.id("sign-in-icon-down")).click();
		
		driver.findElement(By.id("signInLink")).click();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='/login?offerType=PaymentOffers&defaultSlide=home&isOnlyMobile=false']")));
		
		driver.findElement(By.id("mobileNoInp")).sendKeys("123");
		driver.switchTo().defaultContent();

	}

}
