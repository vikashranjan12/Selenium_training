package seleniumTaining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AlertsExampleopenemr {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.openemr.io/openemr/interface/login/login.php?site=default");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );
		String titleofPage=driver.getTitle();
		System.out.println(titleofPage);
		
		driver.findElement(By.name("authUser")).sendKeys("admin");
		driver.findElement(By.name("clearPass")).sendKeys("pass");
		
		Select selectLanguage=new Select(driver.findElement(By.name("languageChoice")));
		selectLanguage.selectByVisibleText("English (Standard)");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
        /*Actions action=new Actions(driver.findElement(By.xpath("//[text()='Patient/Client']")));
		action.moveToElement(target)*/
		
		driver.findElement(By.xpath("//div[text()='Patients']")).click();

		driver.switchTo().frame(driver.findElement(By.xpath("")));
		
		
		driver.findElement(By.id("create_patient_btn1")).click();
		
		
		
	}

}
