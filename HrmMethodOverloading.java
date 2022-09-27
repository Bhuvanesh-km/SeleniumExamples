package seleniumexamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HrmMethodOverloading {
	WebDriver driver = new ChromeDriver();
	void login() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.linkText("Admin")).click();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\bhuvanesh\\chromedriver.exe");
		
		HrmMethodOverloading obj = new HrmMethodOverloading();
		obj.login();
		//obj.search("Admin");
		obj.search("Admin", "Paul Collings");
		
	}
	
	void search(String userName) {
		driver.findElement(By.xpath("//div[2]/input[@class='oxd-input oxd-input--active']")).sendKeys(userName);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	void search(String userName,String empName) {
		driver.findElement(By.xpath("//div[2]/input[@class='oxd-input oxd-input--active']")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys(empName);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
