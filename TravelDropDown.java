package MavenProject1.MavenProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class TravelDropDown {

	public static void main(String[] args)throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");  
		

		WebDriver driver = new ChromeDriver(); 
		
		String url = "https://www.rahulshettyacademy.com/dropdownsPractise/"; 
		
		driver.get(url); 

		WebElement TravelDropDown = driver.findElement(By.xpath("//*[@id=\"travelOptions\"]"));
		Select dropdown = new Select(TravelDropDown);  

		dropdown.selectByIndex(3);
		
		WebElement selectedElement=dropdown.getFirstSelectedOption();
		
		System.out.println(selectedElement.getText());
		dropdown.selectByVisibleText("One Way");
		System.out.println(dropdown.getFirstSelectedOption().getText());

		dropdown.selectByValue("Round Trip");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		dropdown.selectByValue("Multicity");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		Thread.sleep(1000);
		driver.close();
		

		}
	}


