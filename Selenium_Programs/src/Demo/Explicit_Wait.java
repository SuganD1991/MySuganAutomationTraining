package Demo;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

public class Explicit_Wait {
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	
	
	@BeforeClass
	public void setup() {
		
		
		
		System.setProperty("webdriver.chrome.driver", projectPath+"/Drivers/chromedriver.exe");
            driver = new ChromeDriver();
        
        
        }

    @Test
	public void URL() throws Exception {
	driver.get("https://pega-86-demo.iqzsystems.io/prweb/app/default/b0aUC_g2NnC90uEC3dhEbKXJdQTMkXeP*/!STANDARD");
	
	
	}
    
    
    @Test(dependsOnMethods = "URL")
	public void Username() throws Exception {
    WebDriverWait wait = new WebDriverWait(driver,30);
    WebElement uname =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='txtUserID']")));
    uname.sendKeys("tcapron");
	
	}
	
	@Test(dependsOnMethods = "Username")
	public void Password() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver,30);
	    WebElement password =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='txtPassword']")));	
	    password.sendKeys("Password@123");
	
	}
	
	@Test(dependsOnMethods = "Password")
	public void Login_Button() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver,30);
	    WebElement button =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='sub']")));	
	    button.click();
	
	}
	
	
    
	@Test(dependsOnMethods = "Login_Button")
	public void Title() throws Exception {
	  System.out.println("Page Title :" + driver.getTitle());
	
	
	}
	
	
    
	
    
	@AfterClass
	public void finish() {
	driver.quit();
	System.out.println("Test is successful");
	
	}
    	
    
}



