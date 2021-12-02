package MavenProject1.MavenProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class DropDownList 
{
	public static void main(String[] args)throws InterruptedException
	{		
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");  		
		WebDriver driver = new ChromeDriver();
		 driver.get("https://github.com/login");
		 driver.findElement(By.xpath("//*[@id=\"login_field\"]")).sendKeys("shreeajeya");
		 driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("$ajeya@shree123$");
		 driver.findElement(By.xpath("//*[@id=\"login\"]/div[4]/form/div/input[12]")).click();
		 
		 Select dropdownlist = new Select(driver.findElement(By.xpath("/html/body/div[1]/header/div[7]/details/summary/img")));
		 dropdownlist.selectByVisibleText("Your repositories");
		 dropdownlist.selectByIndex(2);
		 dropdownlist.selectByValue("Your_repositories");	

	}

}
