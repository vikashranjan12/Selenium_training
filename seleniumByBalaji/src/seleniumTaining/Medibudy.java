package seleniumTaining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Medibudy {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.medibuddy.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );
		String titleofPage=driver.getTitle();
		System.out.println(titleofPage);
		driver.findElement(By.linkText("Signup")).click();
		

	}

}
