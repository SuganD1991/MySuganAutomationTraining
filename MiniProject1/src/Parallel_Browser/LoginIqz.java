package Parallel_Browser;

import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginIqz {

	WebDriver driver;
	String projectPath = System.getProperty("user.dir");

	@Parameters("browserName")
	@BeforeTest
	public void setup(String browserName) {

		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", projectPath + "/Drivers/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", projectPath + "/Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", projectPath + "/Drivers/msedgedriver.exe");
			driver = new EdgeDriver();
		}

	}

	@Test
	public void URL() throws Exception {
		driver.navigate()
				.to("https://pega-86-demo.iqzsystems.io/prweb/app/default/b0aUC_g2NnC90uEC3dhEbKXJdQTMkXeP*/!STANDARD");
		driver.manage().window().maximize();
	}

	@Test(dependsOnMethods = "URL")
	public void logincredentials() {

		WebElement username = driver.findElement(By.xpath("//input[@id='txtUserID']"));
		username.sendKeys("tcapron");

		WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
		password.sendKeys("rules@123");

		WebElement loginbtn = driver.findElement(By.xpath("//button[@id='sub']"));
		loginbtn.click();

	}

	@Test(dependsOnMethods = "logincredentials")
	public void userportal() throws InterruptedException {

		String PageTitle = driver.getTitle();

		System.out.println("Print the Title of the Page :" + PageTitle);

		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement btnplus = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//a[@class='menu-item-anchor menu-item-expand']/span[1]/span")));
		btnplus.click();
		

		WebDriverWait wait1 = new WebDriverWait(driver, 20);
		WebElement btnindividuallead = wait1.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//span[text()='Individual Lead']")));
		btnindividuallead.click();
		
		
		WebDriverWait wait2 = new WebDriverWait(driver, 20);
		WebElement firstname=wait2.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//input[@id='546ad300']")));
		firstname.sendKeys("Lokesh");
		
		WebDriverWait wait3 = new WebDriverWait(driver, 20);
		WebElement lastname=wait3.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//input[@id='6e54da89']")));
		lastname.sendKeys("Kumar");
		
		WebDriverWait wait4 = new WebDriverWait(driver, 20);
		WebElement btnsubmit=wait4.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//button[text()='Submit']")));
		btnsubmit.click();
		
		
		}
	
	@Test(dependsOnMethods = "userportal")
	public void individuallead() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement btnedit=wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//div[@class='content-item content-field item-1 flex flex-row button-full-width dataValueRead']//following::span[4]/button[1]")));
		btnedit.click();
		WebDriverWait wait0 = new WebDriverWait(driver, 20);
		WebElement btnemail = wait0.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//input[@id='ed7814e7']")));
		btnemail.sendKeys("Charles.c@iqzsystems.com");
		
		WebDriverWait wait1 = new WebDriverWait(driver, 20);
		WebElement btnsubmit=wait1.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//button[text()='Submit']")));
		btnsubmit.click();
		
		
		Thread.sleep(3000);
		WebDriverWait wait2 = new WebDriverWait(driver, 30);
		WebElement btnaction=wait2.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//div[@class='content-item content-field item-3 remove-all-spacing flex flex-row margin-l-auto summary-actions dataValueRead']//following::span[4]/button")));
		btnaction.click();
		
		Thread.sleep(3000);
		WebDriverWait wait8 = new WebDriverWait(driver, 30);
		WebElement convertlead = wait8.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//span[text()='Convert lead']")));
		convertlead.click();
		
		WebDriverWait wait3 = new WebDriverWait(driver, 30);
		WebElement oppurtunityname = wait3.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//input[@id='8dcd183b']")));
		oppurtunityname.sendKeys("feroz khan");
		
		WebDriverWait wait4 = new WebDriverWait(driver, 30);
		WebElement amount = wait4.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//input[@id='1dfe6fd2']")));
		amount.sendKeys("1000");
		
		WebDriverWait wait5 = new WebDriverWait(driver, 30);
		WebElement calender = wait5.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//img[@name='CalendarImg-c0445fa3']")));
		calender.click();
		
		WebDriverWait wait6 = new WebDriverWait(driver, 30);
		WebElement date = wait6.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//a[text()='24']")));
		date.click();
		WebDriverWait wait7 = new WebDriverWait(driver, 30);
		WebElement submit = wait7.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//button[text()='Submit']")));
		submit.click();
		
		
		
		
		
		
		
	}

}
