package MavenProject1.MavenProject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class FrameEg
{
	public static void main(String[] args)throws NoSuchElementException, InterruptedException
	{  
	    System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");  
		WebDriver driver = new ChromeDriver(); 
	    driver.get("http://demo.guru99.com/test/guru99home/");  

	    driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;

	   js.executeScript("window.scrollBy(0,2000)");

	    driver.switchTo().frame("a077aa5e"); //Switching to the frame
		
	    System.out.println("********We are switched to the iframe*******");
	
	    Thread.sleep(1000);
	
		driver.findElement(By.xpath("/html/body/a/img")).click();		

	    driver.switchTo().defaultContent();

	    System.out.println("*********We are done***************");
	
	    //driver.close();	
	
	  }
}
