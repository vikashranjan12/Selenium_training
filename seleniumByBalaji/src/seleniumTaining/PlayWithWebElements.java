package seleniumTaining;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlayWithWebElements {

	public static void main(String[] args) {
			
		WebDriver driver=new ChromeDriver();	
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.get("https://www.google.com/");
			
			List<WebElement> elements= driver.findElements(By.xpath("//a"));
			int linkCount=elements.size();
			System.out.println(linkCount);
			
			for(int i=0;i<linkCount;i++)
			{
				WebElement ele = elements.get(i);
				
				String href = ele.getAttribute("href");
				String text=ele.getText();	
				System.out.println(href);
				System.out.println(text);
			}
			
			for(WebElement ele : elements)
			{
				String href = ele.getAttribute("href");
				String text=ele.getText();	
				System.out.println(href);
				System.out.println(text);
			}

	}

}
