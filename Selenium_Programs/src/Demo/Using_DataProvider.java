package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Using_DataProvider {
	
 String [][] data =	{
		{"tcapronss","Password@12345"},
		{"tcapron","Password@123"}
	};
	
	
	@DataProvider(name="logindata")
	public String[][] loginDataProvider() {
		
		return data;
	}
	
	
	
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
    
    
    @Test(dependsOnMethods = "URL" ,dataProvider ="logindata")
    public void Username(String name, String pname) throws Exception {
	WebElement uname = driver.findElement(By.xpath("//input[@id='txtUserID']"));
	uname.sendKeys(name);
	Thread.sleep(10000);
	
	
	WebElement pword = driver.findElement(By.xpath("//input[@id='txtPassword']"));
	pword.sendKeys(pname);
	Thread.sleep(10000);
	
	
	WebElement button = driver.findElement(By.xpath("//button[@id='sub']"));
	button.click();
	Thread.sleep(10000);
    }
	
	
	
    
	@Test(dependsOnMethods = "Username")
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



