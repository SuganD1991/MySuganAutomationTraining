package Validation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Assert;

public class Check_Button_Text_Change {
	
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	
	
	@BeforeClass
	public void setup() {
		
		
		
		System.setProperty("webdriver.chrome.driver", projectPath+"/Drivers/chromedriver.exe");
            driver = new ChromeDriver();
        
        
        }
	
	 @Test
	 public void URL() throws Exception {
	 driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	 
		
		
		}
	 
	 @Test(dependsOnMethods = "URL")
	 public void Brocolli() throws Exception{
	WebDriverWait wait = new WebDriverWait(driver,30);
		WebElement Brocolli_Button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='root']/div/div[1]/div/div[1]/div[3]/button")));
		Brocolli_Button.click();
		
		WebElement Actual_Bro = driver.findElement(By.xpath("//div[@id='root']/div/div[1]/div/div[1]/div[3]/button"));
		String Act_Bro = Actual_Bro.getText();
		System.out.println("Brocolli After Clicking Add to cart button Print the Text:" + Act_Bro);
		
		Thread.sleep(5000);
		WebElement Expected_Bro = driver.findElement(By.xpath("//div[@id='root']/div/div[1]/div/div[1]/div[3]/button"));
		String Exp_Bro = Expected_Bro.getText();
		System.out.println("Brocolli Again button button text changes Print the Text:" + Exp_Bro);
		
	 }
	 
	 @Test(dependsOnMethods = "Brocolli")
	 public void Cauliflower() throws Exception{
		WebElement Cauliflower_Button = driver.findElement(By.xpath("//*[@id='root']/div/div[1]/div/div[2]/div[3]/button"));
		Cauliflower_Button.click();
		
		WebElement Actual_Cauli = driver.findElement(By.xpath("//div[@id='root']/div/div[1]/div/div[2]/div[3]/button"));
		String Act_Cauli = Actual_Cauli.getText();
		System.out.println("Cauliflower After Clicking Add to cart button Print the Text:" + Act_Cauli);
		
		Thread.sleep(5000);
		WebElement Expected_Cauli = driver.findElement(By.xpath("//div[@id='root']/div/div[1]/div/div[2]/div[3]/button"));
		String Exp_Cauli = Expected_Cauli.getText();
		System.out.println("Cauliflower Again button button text changes Print the Text:" + Exp_Cauli);
		
	 }
	 
	 @Test(dependsOnMethods = "Cauliflower")
	 public void Cucumber() throws Exception{
		WebElement Cucumber_Button = driver.findElement(By.xpath("//*[@id='root']/div/div[1]/div/div[3]/div[3]/button"));
		Cucumber_Button.click();
		
		WebElement Actual_Cucu = driver.findElement(By.xpath("//div[@id='root']/div/div[1]/div/div[3]/div[3]/button"));
		String Act_Cucu = Actual_Cucu.getText();
		System.out.println("Cucumber After Clicking Add to cart button Print the Text:" + Act_Cucu);
		
		Thread.sleep(5000);
		WebElement Expected_Cucu = driver.findElement(By.xpath("//div[@id='root']/div/div[1]/div/div[3]/div[3]/button"));
		String Exp_Cucu = Expected_Cucu.getText();
		System.out.println("Cucumber Again button button text changes Print the Text:" + Exp_Cucu);
		
	 }
	 
	 @Test(dependsOnMethods = "Cucumber")
	 public void Beetroot() throws Exception{
		WebElement Beetroot_Button = driver.findElement(By.xpath("//*[@id='root']/div/div[1]/div/div[4]/div[3]/button"));
		Beetroot_Button.click();
		
		WebElement Actual_Beet = driver.findElement(By.xpath("//div[@id='root']/div/div[1]/div/div[4]/div[3]/button"));
		String Act_Beet = Actual_Beet.getText();
		System.out.println("Beetroot After Clicking Add to cart button Print the Text:" + Act_Beet);
		
		Thread.sleep(5000);
		WebElement Expected_Beet = driver.findElement(By.xpath("//div[@id='root']/div/div[1]/div/div[4]/div[3]/button"));
		String Exp_Beet = Expected_Beet.getText();
		System.out.println("Beetroot Again button button text changes Print the Text:" + Exp_Beet);
		
		
	 }
	 
	 @Test(dependsOnMethods = "Beetroot")
	 public void Carrot() throws Exception{
		WebElement Carrot_Button = driver.findElement(By.xpath("//*[@id='root']/div/div[1]/div/div[5]/div[3]/button"));
		Carrot_Button.click();
		
		WebElement Actual_Carro = driver.findElement(By.xpath("//div[@id='root']/div/div[1]/div/div[5]/div[3]/button"));
		String Act_Carro = Actual_Carro.getText();
		System.out.println("Carrot After Clicking Add to cart button Print the Text:" + Act_Carro);
		
		Thread.sleep(5000);
		WebElement Expected_Carro = driver.findElement(By.xpath("//div[@id='root']/div/div[1]/div/div[5]/div[3]/button"));
		String Exp_Carro = Expected_Carro.getText();
		System.out.println("Carrot Again button button text changes Print the Text:" + Exp_Carro);
		
	 }
	 
	 @Test(dependsOnMethods = "Carrot")
	 public void Tomato() throws Exception{
		WebElement Tomato_Button = driver.findElement(By.xpath("//*[@id='root']/div/div[1]/div/div[6]/div[3]/button"));
		Tomato_Button.click();
		
		WebElement Actual_Tomo = driver.findElement(By.xpath("//div[@id='root']/div/div[1]/div/div[6]/div[3]/button"));
		String Act_Tomo = Actual_Tomo.getText();
		System.out.println("Tomato After Clicking Add to cart button Print the Text:" + Act_Tomo);
		
		Thread.sleep(5000);
		WebElement Expected_Tomo = driver.findElement(By.xpath("//div[@id='root']/div/div[1]/div/div[6]/div[3]/button"));
		String Exp_Tomo = Expected_Tomo.getText();
		System.out.println("Tomato Again button button text changes Print the Text:" + Exp_Tomo);
		
		
	 }
	 
	 @Test(dependsOnMethods = "Tomato")
	 public void Beans() throws Exception{
		WebElement Beans_Button = driver.findElement(By.xpath("//*[@id='root']/div/div[1]/div/div[7]/div[3]/button"));
		Beans_Button.click();
		
		WebElement Actual_Bean = driver.findElement(By.xpath("//div[@id='root']/div/div[1]/div/div[7]/div[3]/button"));
		String Act_Bean = Actual_Bean.getText();
		System.out.println("Beans After Clicking Add to cart button Print the Text:" + Act_Bean);
		
		Thread.sleep(5000);
		WebElement Expected_Bean = driver.findElement(By.xpath("//div[@id='root']/div/div[1]/div/div[7]/div[3]/button"));
		String Exp_Bean = Expected_Bean.getText();
		System.out.println("Beans Again button button text changes Print the Text:" + Exp_Bean);
		
		
	 }
	 
	 @Test(dependsOnMethods = "Beans")
	 public void Brinjal() throws Exception{
		WebElement Brinjal_Button = driver.findElement(By.xpath("//*[@id='root']/div/div[1]/div/div[8]/div[3]/button"));
		Brinjal_Button.click();
		
		WebElement Actual_Brin = driver.findElement(By.xpath("//div[@id='root']/div/div[1]/div/div[8]/div[3]/button"));
		String Act_Brin = Actual_Brin.getText();
		System.out.println("Brinjal After Clicking Add to cart button Print the Text:" + Act_Brin);
		
		Thread.sleep(5000);
		WebElement Expected_Brin = driver.findElement(By.xpath("//div[@id='root']/div/div[1]/div/div[8]/div[3]/button"));
		String Exp_Brin = Expected_Brin.getText();
		System.out.println("Brinjal Again button button text changes Print the Text:" + Exp_Brin);
		
		
	 }
	 
	 @Test(dependsOnMethods = "Brinjal")
	 public void Capsicum() throws Exception{
		WebElement Capsicum_Button = driver.findElement(By.xpath("//*[@id='root']/div/div[1]/div/div[9]/div[3]/button"));
		Capsicum_Button.click();
		
		WebElement Actual_Cap = driver.findElement(By.xpath("//div[@id='root']/div/div[1]/div/div[9]/div[3]/button"));
		String Act_Cap = Actual_Cap.getText();
		System.out.println("Capsicum After Clicking Add to cart button Print the Text:" + Act_Cap);
		
		Thread.sleep(5000);
		WebElement Expected_Cap = driver.findElement(By.xpath("//div[@id='root']/div/div[1]/div/div[9]/div[3]/button"));
		String Exp_Cap = Expected_Cap.getText();
		System.out.println("Capsicum Again button button text changes Print the Text:" + Exp_Cap);
		
		
	 }
	 
	 @Test(dependsOnMethods = "Capsicum")
	 public void Mushroom() throws Exception{
		WebElement Mushroom_Button = driver.findElement(By.xpath("//*[@id='root']/div/div[1]/div/div[10]/div[3]/button"));
		Mushroom_Button.click();
		
		WebElement Actual_Mush = driver.findElement(By.xpath("//div[@id='root']/div/div[1]/div/div[10]/div[3]/button"));
		String Act_Mush = Actual_Mush.getText();
		System.out.println("Mushroom After Clicking Add to cart button Print the Text:" + Act_Mush);
		
		Thread.sleep(5000);
		WebElement Expected_Mush = driver.findElement(By.xpath("//div[@id='root']/div/div[1]/div/div[10]/div[3]/button"));
		String Exp_Mush = Expected_Mush.getText();
		System.out.println("Mushroom Again button button text changes Print the Text:" + Exp_Mush);
		
		
	 }
	 
	 

}
