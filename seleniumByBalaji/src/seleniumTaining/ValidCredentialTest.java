package seleniumTaining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ValidCredentialTest {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://magento.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );
		String titleofPage=driver.getTitle();
		System.out.println(titleofPage);
		String TextfromPage=driver.findElement(By.className("feds-logo-text")).getText();
		System.out.println(TextfromPage);
		
		/*WebElement action=driver.findElement(By.id("gnav_557"));
		action.click();                                                 */
		driver.findElement(By.id("gnav_557")).click();
		
		driver.findElement(By.id("email")).sendKeys("vikash@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("vikashpass");
	
		//driver.quit();
	}
}
