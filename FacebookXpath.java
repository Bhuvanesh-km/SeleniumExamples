package seleniumexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\bhuvanesh\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("bhuvanesh");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("KM");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("bhuvanesh1@gmalil.com");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("bhuvanesh1@gmalil.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Bhuvi@12345");
		driver.findElement(By.xpath("//select[@id='day']")).sendKeys("10");
		driver.findElement(By.xpath("//select[@id='month']")).sendKeys("May");
		driver.findElement(By.xpath("//select[@id='year']")).sendKeys("2001");
		driver.findElement(By.xpath("//input[@value='2']")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
	}
}
