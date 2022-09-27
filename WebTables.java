package seleniumexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\bhuvanesh\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("//C:/Users/EI13120/Desktop/webTable.html");	
		driver.findElement(By.xpath("//table/tbody/tr[5]/td[1]/input")).click();
		System.out.println(driver.findElement(By.xpath("//table/tbody/tr[5]/td[2]")).getText());
		System.out.println(driver.findElement(By.xpath("//table/tbody/tr[5]/td[3]")).getText());

	}

}
