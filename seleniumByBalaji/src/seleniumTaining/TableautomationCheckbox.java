package seleniumTaining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableautomationCheckbox {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );
		String titleofPage=driver.getTitle();
		System.out.println(titleofPage);
		
		//table row1 col1 
		String name1=driver.findElement(By.xpath("//table[@id='example']/tbody/tr[1]/td[2]")).getText();
		System.out.println(name1);
		
		//table row2 col1
		String name2=driver.findElement(By.xpath("//table[@id='example']/tbody/tr[2]/td[2]")).getText();
		System.out.println(name2);
		
		//dynamic table automation
		int rowCount=driver.findElements(By.xpath("//table[@id='example']/tbody/tr")).size();
		System.out.println(rowCount);
        boolean pageCheck=false;
		
		for(int p=1;p<=6;p++)
		{
			int rowCounts=driver.findElements(By.xpath("//table[@id='example']/tbody/tr")).size();
			System.out.println(rowCount);
			
			for(int i=1;i<=rowCounts;i++)
			{
				String name=driver.findElement(By.xpath("//table[@id='example']/tbody/tr["+i+"]/td[2]")).getText();
				System.out.println(name);	
				
				if(name.equals("Michael Silva123"))
				{
					driver.findElement(By.xpath("//table[@id='example']/tbody/tr["+i+"]/td[1]")).click();
					String sal=driver.findElement(By.xpath("//table[@id='example']/tbody/tr["+i+"]/td[6]")).getText();
					System.out.println(sal);
					pageCheck=true;
					break;
				}
			}
			
			if(pageCheck)
			{
				break;
			}
			if(driver.findElement(By.linkText("Next")).isEnabled())
			{
				driver.findElement(By.linkText("Next")).click();
			}
			
			
		}
	}

}
