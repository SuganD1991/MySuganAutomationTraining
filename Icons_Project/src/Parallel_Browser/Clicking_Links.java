package Parallel_Browser;


import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Clicking_Links {
	
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	
	@Parameters("browserName")
	@BeforeTest
	public void setup(String browserName) {
		


	
        if (browserName.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", projectPath+"/Drivers/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", projectPath+"/Drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        }
        
	}
	
	  @Test
		public void URL() throws Exception {
		driver.navigate().to("https://freecrm.com/");
		driver.manage().window().maximize();
		}
	  
	  @Test(dependsOnMethods = "URL")
	  public void Twitter_Click() throws Exception {
		  
		  JavascriptExecutor execute = (JavascriptExecutor)driver;
		  execute.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
		
		  WebDriverWait wait = new WebDriverWait(driver,10);
		  WebElement Twitter = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@href='https://twitter.com/cogmento']")));
		  Twitter.click();
		  
		  
		  
		  
	  }
	  
	  @Test(dependsOnMethods = "Twitter_Click")
	  public void Facebook_Click() throws Exception {
		  
		  JavascriptExecutor execute1 = (JavascriptExecutor)driver;
		  execute1.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
		  WebDriverWait wait0 = new WebDriverWait(driver,50);
		  WebElement Facebook = wait0.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='https://www.facebook.com/cogmento']")));
		  Facebook.click();
		  
		
	  }
	  
	  
	  @Test(dependsOnMethods = "Facebook_Click")
	  public void Git_Click() throws Exception {
		  
		  JavascriptExecutor execute2 = (JavascriptExecutor)driver;
		  execute2.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
		  WebDriverWait wait1 = new WebDriverWait(driver,10);
		  WebElement GitHub = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='https://github.com/cogmento']")));
		  GitHub.click();
		  
		  
	  }

	  
	  @Test(dependsOnMethods = "Git_Click")
	  public void Telegram_Click() throws Exception {
		  
		  JavascriptExecutor execute3 = (JavascriptExecutor)driver;
		  execute3.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
		  WebDriverWait wait2 = new WebDriverWait(driver,10);
		  WebElement Telegram = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='https://t.me/cogmento']")));
		  Telegram.click();
		  
		  
	  }
	  
	  @Test(dependsOnMethods = "Telegram_Click")
	  public void Mail_Click() throws Exception{
		  
		  JavascriptExecutor execute3 = (JavascriptExecutor)driver;
		  execute3.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
		  WebDriverWait wait3 = new WebDriverWait(driver,10);
		  WebElement Mail = wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='https://medium.com/@cogmento']")));
		  Mail.click();
		  
		  
	  }
	  
	  @Test(dependsOnMethods = "Mail_Click")
	  public void Linkdin_Click() throws Exception {
		  
		  JavascriptExecutor execute4 = (JavascriptExecutor)driver;
		  execute4.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
		  WebDriverWait wait4 = new WebDriverWait(driver,10);
		  WebElement Link = wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='https://www.linkedin.com/company/cogmento']")));
		  Link.click();
		  
		  
	  }
	  
	  @Test(dependsOnMethods = "Linkdin_Click")
	  public void Youtube_Click() throws Exception {
		  
		  JavascriptExecutor execute5 = (JavascriptExecutor)driver;
		  execute5.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
		  WebDriverWait wait5 = new WebDriverWait(driver,10);
		  WebElement YouTube = wait5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='https://youtu.be/ow44nHQPMJw']")));
		  YouTube.click();
		  
		  
	  }
	  
	  /*@AfterTest
		public void finish() {
		driver.quit();
		System.out.println("Test is successful");
		}*/
	  
}
