package Autentication;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Authentication {

	public static void main(String[] args) {
		
		WebDriver driver= null;
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://admin:admin@the-internet.herokuapp.com/digest_auth");

	}

}
