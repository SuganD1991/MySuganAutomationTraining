package Pega_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

public class Login_Page {
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
	Thread.sleep(10000);
	}
    
    
    @Test(dependsOnMethods = "URL")
	public void Username() throws Exception {
	WebElement uname = driver.findElement(By.xpath("//input[@id='txtUserID']"));
	uname.sendKeys("tcapron");
	Thread.sleep(10000);
	}
	
	@Test(dependsOnMethods = "Username")
	public void Password() throws Exception {
	WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
	password.sendKeys("Password@123");
	Thread.sleep(10000);
	}
	
	@Test(dependsOnMethods = "Password")
	public void Login_Button() throws Exception {
	WebElement button = driver.findElement(By.xpath("//button[@id='sub']"));
	button.click();
	Thread.sleep(10000);
	}
	
	
    
	@Test(dependsOnMethods = "Login_Button")
	public void Title() throws Exception {
	  System.out.println("Page Title :" + driver.getTitle());
	
	Thread.sleep(10000);
	}
	
	
	
	
	
	@AfterClass
	public void finish() {
	driver.quit();
	System.out.println("Test is successful");
	}
		

}
