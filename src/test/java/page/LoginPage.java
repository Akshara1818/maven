package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	    WebDriver driver;
	    //=============Web Elements ========//
	    
	    @FindBy(xpath="//*[contains(text(),'Sign in')]")
	    WebElement lnkLogin;
	    @FindBy(xpath="//input[@name='login']")
	    WebElement editUsername;
	    @FindBy(xpath="//input[@id='password']")
	    WebElement editpwd;
	    @FindBy(xpath="//input[@value='Sign in']")
	    WebElement btnPwd;
	    
	    public LoginPage(WebDriver testdriver) {
	        this.driver =  testdriver;
	        PageFactory.initElements(driver, this);
	    }
	    
	    //============Methods======================//
	    
	    public void Login(String Username, String Password) {
	        
	       // WebElement signin = driver.findElement(By.xpath("//*[contains(text(),'Sign in')]"));
	        
	        lnkLogin.click();
	        
	        //WebElement email = driver.findElement(By.xpath("//*[@name='login']"));
	        
	        editUsername.sendKeys(Username);
	        

	       // WebElement Pwd = driver.findElement(By.xpath("//*[@id='password']"));
	    
	        editpwd.sendKeys(Password);
	        
//	        WebElement chkBox = driver.findElement(By.className("rememberMe"));
	        
	       // chkBox.click();
	        
	       // WebElement btnPwd = driver.findElement()
	        btnPwd.click();
	        }
	    }

	 




