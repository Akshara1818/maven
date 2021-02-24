package test;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import page.LoginPage;

 

public class Testcase1 {
	WebDriver driver;
	XSSFWorkbook wb;
	XSSFSheet sheet;
  
   
    
   
    
    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "/home/aksharaappannat/Downloads/chromedriver");
       
        
        driver = new ChromeDriver();
        
        driver.get("https://github.com/");
        
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        
 
            
    }
    
    @Test
    public void LoginTest() 
    	throws IOException {
    	FileInputStream file = new FileInputStream("TestData.xlsx");
        wb = new XSSFWorkbook(file);
        sheet = wb.getSheet("datasheet");
        String UserName = sheet.getRow(1).getCell(0).getStringCellValue();
        String Password = sheet.getRow(1).getCell(0).getStringCellValue();
        LoginPage obj = new LoginPage(driver);
        obj.Login(UserName,Password);
    }
    @AfterMethod
    public void CloseBrowser() {
        driver.quit();
    }
}
	


