package MavenProject1.MavenProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
public class SeleniumBasicsScripts {
	
	public static void main(String[] args) 
	{
	    System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");  
	    WebDriver driver=new ChromeDriver();  
	     //driver.get("https://rahulshettyacademy.com");
	     //String title=driver.getTitle();
	     //System.out.println(title);
	    //driver.close();
	    driver.get("https://rahulshettyacademy.com");
	    //driver.navigate().to("https://javapoint.com/selenium-tutorial");
	   // driver.findElement(By.id("lst-ib")).sendKeys("javatpoint tutorials");

	    
	}

}



