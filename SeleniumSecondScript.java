package MavenProject1.MavenProject;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumSecondScript {

	public static void main(String[] args) {


      System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");  
		

		WebDriver driver = new ChromeDriver(); 
		    

		String url = "https://rahulshettyacademy.com"; 
		 
		driver.get(url); 
		

		String title = driver.getTitle(); 
		

		int titleLength = driver.getTitle().length();
		

		System.out.println("Title of the page is : " + title); 
		System.out.println("Length of the title is : "+ titleLength); 
		

		String actualUrl = driver.getCurrentUrl();
		
		if (actualUrl.equals("https://rahulshettyacademy.com/#/index")){ 
			System.out.println("Verification Successful - The correct Url is opened.");
		}
		else {
			System.out.println("Verification Failed - An incorrect Url is opened."); 
			System.out.println("Actual URL is : " + actualUrl); 
			System.out.println("Expected URL is : " + url);
		}
		
		String pageSource = driver.getPageSource();
		int pageSourceLength = pageSource.length(); 
		System.out.println("Total length of the Pgae Source is : " + pageSourceLength); 
		driver.close();
  }  

}  
