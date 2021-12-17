package Add_Cart;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Assert;

public class Proceed_Checkout {
	
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
		
		WebElement Brocolli_Name = driver.findElement(By.xpath("//div[@id='root']/div/div[1]/div/div[1]/h4"));
		String Bro_N = Brocolli_Name.getText();
		
		if(Bro_N.equals("Brocolli - 1 Kg")) {
			
			System.out.println("Print the Brocolli Name" + Bro_N);
			
		}
		
		WebElement Brocolli_Cost = driver.findElement(By.xpath("//div[@id='root']/div/div[1]/div/div[1]/p"));
		String Bro_C = Brocolli_Cost.getText();
		
		if(Bro_C.equals("120")) {
			System.out.println("Print the Brocolli Cost" + Bro_C);
		}
		
	 }
	 
	 @Test(dependsOnMethods = "Brocolli")
	 public void Cauliflower() throws Exception{
		WebElement Cauliflower_Button = driver.findElement(By.xpath("//*[@id='root']/div/div[1]/div/div[2]/div[3]/button"));
		Cauliflower_Button.click();
		
		WebElement Cauliflower_Name = driver.findElement(By.xpath("//div[@id='root']/div/div[1]/div/div[2]/h4"));
		String Cauli_N=Cauliflower_Name.getText();
		
		if(Cauli_N.equals("Cauliflower - 1 Kg")) {
			
			System.out.println("Print the Cauliflower Name" + Cauli_N);
			
		}
		
		WebElement Cauliflower_Cost = driver.findElement(By.xpath("//div[@id='root']/div/div[1]/div/div[2]/p"));
		String Cauli_C = Cauliflower_Cost.getText();
		
		if(Cauli_C.equals("60")) {
			System.out.println("Print the Cauliflower Cost" + Cauli_C);
		}
	 }
	 
	 @Test(dependsOnMethods = "Cauliflower")
	 public void Cucumber() throws Exception{
		WebElement Cucumber_Button = driver.findElement(By.xpath("//*[@id='root']/div/div[1]/div/div[3]/div[3]/button"));
		Cucumber_Button.click();
		
		WebElement Cucumber_Name = driver.findElement(By.xpath("//div[@id='root']/div/div[1]/div/div[3]/h4"));
		String Cucu_N=Cucumber_Name.getText();
		
		if(Cucu_N.equals("Cucumber - 1 Kg")) {
			
			System.out.println("Print the Cucumber Name" + Cucu_N);
			
		}
		
		WebElement Cucumber_Cost = driver.findElement(By.xpath("//div[@id='root']/div/div[1]/div/div[3]/p"));
		String Cucu_C = Cucumber_Cost.getText();
		
		if(Cucu_C.equals("48")) {
			System.out.println("Print the Cucumber Cost" + Cucu_C);
		}
	 }
	 
	 @Test(dependsOnMethods = "Cucumber")
	 public void Beetroot() throws Exception{
		WebElement Beetroot_Button = driver.findElement(By.xpath("//*[@id='root']/div/div[1]/div/div[4]/div[3]/button"));
		Beetroot_Button.click();
		
		WebElement Beetroot_Name = driver.findElement(By.xpath("//div[@id='root']/div/div[1]/div/div[4]/h4"));
		String Beet_N=Beetroot_Name.getText();
		
		if(Beet_N.equals("Beetroot - 1 Kg")) {
			
			System.out.println("Print the Beetroot Name" + Beet_N);
			
		}
		
		WebElement Beetroot_Cost = driver.findElement(By.xpath("//div[@id='root']/div/div[1]/div/div[4]/p"));
		String Beet_C = Beetroot_Cost.getText();
		
		if(Beet_C.equals("32")) {
			System.out.println("Print the Beetroot Cost" + Beet_C);
		}
	 }
	 
	 @Test(dependsOnMethods = "Beetroot")
	 public void Carrot() throws Exception{
		WebElement Carrot_Button = driver.findElement(By.xpath("//*[@id='root']/div/div[1]/div/div[5]/div[3]/button"));
		Carrot_Button.click();
		
		WebElement Carrot_Name = driver.findElement(By.xpath("//div[@id='root']/div/div[1]/div/div[5]/h4"));
		String Carr_N=Carrot_Name.getText();
		
		if(Carr_N.equals("Carrot - 1 Kg")) {
			
			System.out.println("Print the Carrot Name" + Carr_N);
			
		}
		
		WebElement Carrot_Cost = driver.findElement(By.xpath("//div[@id='root']/div/div[1]/div/div[5]/p"));
		String Carro_C = Carrot_Cost.getText();
		
		if(Carro_C.equals("56")) {
			System.out.println("Print the Carrot Cost" + Carro_C);
		}
	 }
	 
	 @Test(dependsOnMethods = "Carrot")
	 public void Tomato() throws Exception{
		WebElement Tomato_Button = driver.findElement(By.xpath("//*[@id='root']/div/div[1]/div/div[6]/div[3]/button"));
		Tomato_Button.click();
		
		WebElement Tomato_Name = driver.findElement(By.xpath("//div[@id='root']/div/div[1]/div/div[6]/h4"));
		String Tomo_N=Tomato_Name.getText();
		
		if(Tomo_N.equals("Tomato - 1 Kg")) {
			
			System.out.println("Print the Tomato Name" + Tomo_N);
			
		}
		
		WebElement Tomato_Cost = driver.findElement(By.xpath("//div[@id='root']/div/div[1]/div/div[6]/p"));
		String Tomo_C = Tomato_Cost.getText();
		
		if(Tomo_C.equals("16")) {
			System.out.println("Print the Tomato Cost" + Tomo_C);
		}
	 }
	 
	 @Test(dependsOnMethods = "Tomato")
	 public void Beans() throws Exception{
		WebElement Beans_Button = driver.findElement(By.xpath("//*[@id='root']/div/div[1]/div/div[7]/div[3]/button"));
		Beans_Button.click();
		
		WebElement Beans_Name = driver.findElement(By.xpath("//div[@id='root']/div/div[1]/div/div[7]/h4"));
		String Bean_N=Beans_Name.getText();
		
		if(Bean_N.equals("Beans - 1 Kg")) {
			
			System.out.println("Print the Beans Name" + Bean_N);
			
		}
		
		WebElement Beans_Cost = driver.findElement(By.xpath("//div[@id='root']/div/div[1]/div/div[7]/p"));
		String Bean_C = Beans_Cost.getText();
		
		if(Bean_C.equals("82")) {
			System.out.println("Print the Beans Cost" + Bean_C);
		}
	 }
	 
	 @Test(dependsOnMethods = "Beans")
	 public void Brinjal() throws Exception{
		WebElement Brinjal_Button = driver.findElement(By.xpath("//*[@id='root']/div/div[1]/div/div[8]/div[3]/button"));
		Brinjal_Button.click();
		
		WebElement Brinjal_Name = driver.findElement(By.xpath("//div[@id='root']/div/div[1]/div/div[8]/h4"));
		String Brin_N=Brinjal_Name.getText();
		
		if(Brin_N.equals("Brinjal - 1 Kg")) {
			
			System.out.println("Print the Brinjal Name" + Brin_N);
			
		}
		
		WebElement Brinjal_Cost = driver.findElement(By.xpath("//div[@id='root']/div/div[1]/div/div[8]/p"));
		String Brin_C = Brinjal_Cost.getText();
		
		if(Brin_C.equals("35")) {
			System.out.println("Print the Brinjal Cost" + Brin_C);
		}
	 }
	 
	 @Test(dependsOnMethods = "Brinjal")
	 public void Capsicum() throws Exception{
		WebElement Capsicum_Button = driver.findElement(By.xpath("//*[@id='root']/div/div[1]/div/div[9]/div[3]/button"));
		Capsicum_Button.click();
		
		WebElement Capsicum_Name = driver.findElement(By.xpath("//div[@id='root']/div/div[1]/div/div[9]/h4"));
		String Caps_N=Capsicum_Name.getText();
		
		if(Caps_N.equals("Capsicum")) {
			
			System.out.println("Print the Capsicum Name" + Caps_N);
			
		}
		
		WebElement Capsicum_Cost = driver.findElement(By.xpath("//div[@id='root']/div/div[1]/div/div[9]/p"));
		String Caps_C = Capsicum_Cost.getText();
		
		if(Caps_C.equals("60")) {
			System.out.println("Print the Capsicum Cost" + Caps_C);
		}
	 }
	 
	 @Test(dependsOnMethods = "Capsicum")
	 public void Mushroom() throws Exception{
		WebElement Mushroom_Button = driver.findElement(By.xpath("//*[@id='root']/div/div[1]/div/div[10]/div[3]/button"));
		Mushroom_Button.click();
		
		WebElement Mushroom_Name = driver.findElement(By.xpath("//div[@id='root']/div/div[1]/div/div[10]/h4"));
		String Mush_N=Mushroom_Name.getText();
		
		if(Mush_N.equals("Mushroom - 1 Kg")) {
			
			System.out.println("Print the Mushroom Name" + Mush_N);
			
		}
		
		WebElement Mushroom_Cost = driver.findElement(By.xpath("//div[@id='root']/div/div[1]/div/div[10]/p"));
		String Mush_C = Mushroom_Cost.getText();
		
		if(Mush_C.equals("75")) {
			System.out.println("Print the Mushroom Cost" + Mush_C);
		}
	 }
	 
	 @Test(dependsOnMethods = "Mushroom")
	 public void Assert() throws Exception{
		 
		 int a = 120;
		 int b = 60;
		 int c = 48;
		 int d = 32;
		 int e = 56;
		 int f = 16;
		 int g = 82;
		 int h = 35;
		 int i = 60;
		 int j = 75;
		 int k = a+b+c+d+e+f+g+h+i+j;
		 
		 System.out.println("Adding The Product Price :" + k);
		 Assert.assertEquals(k, 584);
		 System.out.println("Successfully Passed After Assertion");
		 
	 }
	 
	 @Test(dependsOnMethods = "Assert")
	 public void Cart() throws Exception{
		 
		 WebElement Cart = driver.findElement(By.xpath("//img[@src='https://res.cloudinary.com/sivadass/image/upload/v1493548928/icons/bag.png']"));
		 Cart.click();
		 
	 }
	 
	 @Test(dependsOnMethods = "Cart")
	 public void Checkout() throws Exception{
		 
		 WebElement Checkout = driver.findElement(By.xpath("//div[@id='root']/div/header/div[1]/div[3]/div[2]/div[2]/button"));
		 Checkout.click();
		 
	 }
	 @Test(dependsOnMethods = "Checkout")
	 public void Place_Order() throws Exception{
		 WebDriverWait wait = new WebDriverWait(driver,30);
		 WebElement Order = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='root']/div/div/div/div/button")));
		 Order.click();
		 
	 }
	 
	 @Test(dependsOnMethods = "Place_Order")
	 public void dropdown() throws Exception{
		 
		 
		 WebElement Dropdown = driver.findElement(By.xpath("//div[@id='root']/div/div/div/div/div/select"));
		 Select select = new Select(Dropdown);
		 
		 select.selectByVisibleText("India");
		 
	 }
	 
	 @Test(dependsOnMethods = "dropdown")
	 public void Checkbox() throws Exception {
		 
		 WebElement Checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		 Checkbox.click();
		 
	 }
	 
	 @Test(dependsOnMethods = "Checkbox")
	 public void Final_Proceed() throws Exception{
		 
		 WebElement Proceed_Button = driver.findElement(By.xpath("//div[@id='root']/div/div/div/div/button"));
		 Proceed_Button.click();
		 
	 }
	 

}
