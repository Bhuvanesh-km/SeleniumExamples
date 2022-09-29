package seleniumexamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyInfoHRM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\bhuvanesh\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//click on myinfo
		driver.findElement(By.xpath("//div/ul/li[6]/a/span")).click();
		//fill details
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
//		driver.findElement(By.xpath("//input[@name='firstName']")).clear();
//		driver.findElement(By.xpath("//input[@name='firstName']")).clear();
//		driver.findElement(By.xpath("//input[@name='middleName']")).clear();
//		driver.findElement(By.xpath("//input[@name='lastName']")).clear();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/input")).sendKeys("Bhuvi");
		
//		driver.findElement(By.xpath("//form/div/div[2]/div/div/div[2]/input")).sendKeys("Bhuvi");
//		driver.findElement(By.xpath("//form/div[2]/div/div/div/div[2]/input")).sendKeys("12345");
//		driver.findElement(By.xpath("//form/div[2]/div/div[2]/div/div[2]/input")).sendKeys("12345");
//		driver.findElement(By.xpath("//form/div[2]/div[2]/div[1]/div/div[2]/input")).sendKeys("9999999");
		//driver.findElement(By.xpath("//form/div[2]/div[2]/div[1]/div/div[2]/input")).sendKeys("9999999");
	}

}
