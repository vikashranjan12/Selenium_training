package seleniumTaining;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertsExampleopenemr {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.openemr.io/openemr/interface/login/login.php?site=default");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );
		String titleofPage=driver.getTitle();
		System.out.println(titleofPage);
		
		driver.findElement(By.name("authUser")).sendKeys("admin");
		driver.findElement(By.name("clearPass")).sendKeys("pass");
		
		//drop-down
		Select selectLanguage=new Select(driver.findElement(By.name("languageChoice")));
		selectLanguage.selectByVisibleText("English (Standard)");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//mouse-hover
        Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//div[text()='Patient/Client']"))).click();

		driver.findElement(By.xpath("//div[text()='Patient/Client']")).click();

		
		driver.findElement(By.xpath("//div[text()='Patients']")).click();

		//frame switched 1
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='/openemr/interface/main/finder/dynamic_finder.php']")));
		driver.findElement(By.id("create_patient_btn1")).click();
		driver.switchTo().defaultContent();
		//returned to default frame from frame 1
		
		
		//frame switched to 2
		driver.switchTo().frame("pat");
		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='/openemr/interface/new/new.php']")));
		driver.findElement(By.id("form_fname")).sendKeys("John");
		driver.findElement(By.id("form_lname")).sendKeys("wick");
		
		//current date with format
		DateTimeFormatter dtf= DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate localdate=LocalDate.now();
		driver.findElement(By.id("form_DOB")).sendKeys(dtf.format(localdate));
		
		Select selectGender=new Select(driver.findElement(By.id("form_sex")));
		selectGender.selectByVisibleText("Male");
		
		driver.findElement(By.id("create")).click();
		
		driver.switchTo().defaultContent();
		//returned to default frame from frame 2
		
		//frame switched to 3
		driver.switchTo().frame("modalframe");
	    driver.findElement(By.xpath("//input[@type='button' and @value='Confirm Create New Patient']")).click();
		
	    driver.switchTo().defaultContent();
		//returned to default frame from frame 3
		
		//alert handling and getting text wait for delayed alert
	    //Thread.sleep(5000);
	    WebDriverWait wait=new WebDriverWait(driver,50);
	    wait.until(ExpectedConditions.alertIsPresent());
	    
	    String AlertMssg=driver.switchTo().alert().getText();
	    System.out.println(AlertMssg);
	    driver.switchTo().alert().accept();
	    
	    //popup comes sometime, sometimes doesn't
	    if(driver.findElements(By.className("closeDlgIframe")).size()>0)
	    {
	  	driver.findElement(By.className("closeDlgIframe")).click();
	  	}
	    
		//frame switched to 4
		driver.switchTo().frame("pat");
	  	String NewU=driver.findElement(By.id("text_title")).getText();
	  	System.out.println(NewU);
	  	 driver.switchTo().defaultContent();
	    //returned to default frame from frame 4
		
	  	 driver.quit();
		}
		
		
		
	}


