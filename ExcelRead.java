package seleniumexamples;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelRead {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Prepare the path of excel file
			String filePath="//C:\\Users\\EI13120\\Documents\\";
			String fileName="automation.xlsx";
			String sheetName="Sheet1";
			File file = new File(filePath+"\\"+fileName);
			
			//Create an object of FileInputStream class to read excel file
			FileInputStream inputStream = new FileInputStream(file);
			Workbook workBook = new XSSFWorkbook(inputStream);
			org.apache.poi.ss.usermodel.Sheet sheet = workBook.getSheet(sheetName);
			    
			System.setProperty("webdriver.chrome.driver", "C:\\bhuvanesh\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://en-gb.facebook.com/");
			driver.manage().window().maximize();
		
			Row row = ((org.apache.poi.ss.usermodel.Sheet) sheet).getRow(1);
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys(row.getCell(0).getStringCellValue());
			driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(row.getCell(1).getStringCellValue());
			driver.findElement(By.xpath("//button[@name='login']")).click();

	}

}
