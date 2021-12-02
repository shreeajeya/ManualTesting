package MavenProject1.MavenProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class DropDown {

	public static void main(String[] args)throws InterruptedException
	{   
	    System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");  
		

		WebDriver driver = new ChromeDriver(); 
		
		String url = "https://www.rahulshettyacademy.com/dropdownsPractise/"; 
		
		driver.get(url); 

		WebElement DropDown = driver.findElement(By.xpath("//*[@id='ctl00_mainContent_DropDownListCurrency']"));
		Select dropdown = new Select(DropDown);  

		dropdown.selectByIndex(3);
		
		WebElement selectedElement=dropdown.getFirstSelectedOption();
		
		System.out.println(selectedElement.getText());
		dropdown.selectByVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());

		dropdown.selectByValue("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		
		
		Thread.sleep(1000);
		driver.close();
		

		}
	}

