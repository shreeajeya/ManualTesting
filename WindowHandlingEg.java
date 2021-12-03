package MavenProject1.MavenProject;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WindowHandlingEg
{
	public static void main(String[] args)
	{
  
	    System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");  
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String> windows = driver.getWindowHandles(); //[parentid,childid,subchildId]
		Iterator<String>it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());		
		driver.switchTo().window(parentId);
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("shreeajeya2000@gmail.com");
		
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("ajeya123");
	       
        WebElement WindowHandlingEg = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[5]/select"));
        Select windowhandlingeg = new Select(WindowHandlingEg);  
        windowhandlingeg.selectByIndex(1);  
      
        driver.findElement(By.xpath("//*[@id=\"terms\"]")).click();
      
        driver.findElement(By.xpath("//*[@id=\"signInBtn\"]")).click();
      
		//driver.close();
	    //driver.quit();

	}
		

}
