package MavenProject1.MavenProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample2 {

	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");  

		WebDriver driver = new ChromeDriver(); 

		driver.get("https://tsky.in/Recharge/QuickRecharge"); 
		
		driver.findElement(By.xpath("//*[@id=\"subscriberId\"]")).sendKeys("7349208224");
	    driver.findElement(By.xpath("//*[@id=\"amount\"]")).sendKeys("1500");
	    driver.findElement(By.xpath("//*[@id=\"submitRecharge\"]")).click();

	    System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		driver.close();
	}

}
