package Print_Table;


import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class Results_In_Console {
	
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	
	
	@BeforeClass
	public void setup() {
		
		
		
		System.setProperty("webdriver.chrome.driver", projectPath+"/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        
       }
	
	 @Test
	 public void URL() throws Exception {
	 driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	 
		
		
		}
	 
	 @Test(dependsOnMethods = "URL")
	 public void Top_Deals() throws Exception {
		 
		 String oldwindow = driver.getWindowHandle();
		 WebElement Deals = driver.findElement(By.xpath("//a[@href='#/offers']"));
		 Deals.click();
	 
	 String PageTitle = driver.getTitle();
		 
		 System.out.println("Print the Title of the Page :" + PageTitle);
		 
	 Set<String> handles = driver.getWindowHandles();
		 
		 for (String newWindow : handles) {
			 driver.switchTo().window(newWindow);
			
		}
		 
	 }
		 
		 @Test(dependsOnMethods ="Top_Deals")
		 public void Search() throws Exception {
		 
		 Thread.sleep(5000); 
		 driver.findElement(By.xpath("//input[@id='search-field'][@type='search']")).sendKeys("Potato");
		 }
		 
		 @Test(dependsOnMethods = "Search")
		 public void Vegetable() throws Exception {
		 
		 WebElement Potato = driver.findElement(By.xpath("//td[normalize-space()='Potato']"));
		 String getPotato = Potato.getText();
		 System.out.println("Print the Vegetable Name:" + getPotato);
		 
		 }
		 
		 @Test(dependsOnMethods = "Vegetable")
		 public void Price() throws Exception {
		 
		 WebElement Price = driver.findElement(By.xpath("//td[normalize-space()='Potato']//following::td[1]"));
		 String getPrice = Price.getText();
		 System.out.println("Print the Vegetable Name:" + getPrice );
		 
		 }
		 
		 @Test(dependsOnMethods = "Price")
		 public void Dis_Price() throws Exception {
		 
		 WebElement DisPrice = driver.findElement(By.xpath("//td[normalize-space()='Potato']//following::td[2]"));
		 String getDisPrice = DisPrice.getText();
		 System.out.println("Print the Vegetable Name:" + getDisPrice );
		 
		 }
	
	 
	
		 
	 }
	 
	 
