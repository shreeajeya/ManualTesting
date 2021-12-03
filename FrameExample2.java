package MavenProject1.MavenProject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class FrameExample2 {

	public static void main(String[] args)throws NoSuchElementException, InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");  
			WebDriver driver = new ChromeDriver(); 
		    driver.get("https://www.aiet.org.in/");  

		    driver.manage().window().maximize();

			JavascriptExecutor js = (JavascriptExecutor) driver;

		   js.executeScript("window.scrollBy(0,1000)");

		    driver.switchTo().frame("lazy"); //Switching to the frame
			
		    System.out.println("********We are switched to the iframe*******");
		
		    Thread.sleep(1000);
		
			driver.findElement(By.xpath("//*[@id=\"menu-item-17704\"]/a")).click();		

		    driver.switchTo().defaultContent();

		    System.out.println("*********We are done***************");
		
		    //driver.close();	
		
		  }
	}

