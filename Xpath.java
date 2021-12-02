package MavenProject1.MavenProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Xpath 
{
	public static void main(String[] args)throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");  
	    WebDriver driver=new ChromeDriver();
	    
	    driver.get("https://rahulshettyacademy.com/locatorspractice/");
	    
	    driver.findElement(By.xpath("//*[@id=\"inputUsername\"]")).sendKeys("ajeya");
	    driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/form/input[2]")).sendKeys("ajeya123");
	    driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/form/button")).click();
	    
	    //driver.findElement(By.id("user_name")).sendKeys("ajeya");
	    //driver.findElement(By.name("password")).sendKeys("ajeya123");
	    
         System.out.println(driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/form/p")).getText());
		

		driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/form/div[2]/a")).click();
		

		Thread.sleep(1000);
		


		driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/form/input[1]")).sendKeys("ajeya");
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/form/input[2]")).sendKeys("shreeajeya2000@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/form/input[3]")).sendKeys("7349208224");
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/form/div/button[2]")).click();


				System.out.println(driver.findElement(By.cssSelector("#container > div.form-container.sign-up-container > form > p")).getText());
				

				driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/form/div")).click();
				Thread.sleep(1000);
				

				driver.findElement(By.cssSelector("#inputUsername")).sendKeys("ajeya");
				driver.findElement(By.cssSelector("#container > div.form-container.sign-in-container > form > input[type=password]:nth-child(4)")).sendKeys("rahulshettyacademy");
				driver.findElement(By.id("chkboxTwo")).click();
				driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/form/button")).click();
				

				driver.close();
			}

		}



