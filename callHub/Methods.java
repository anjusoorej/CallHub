package callHub;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Methods {
	
	WebDriver driver;
	ConfigReader conf;
	
	public Methods(){
		conf = new ConfigReader();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://app.callhub.io/phonebooks/#");
	}
	
	public void timeDelay(int sec) {
		WebDriverWait wait = new WebDriverWait(driver,sec);
	}
	
	public void authentication() {
		driver.findElement(By.id("id_user")).sendKeys("anjusoorej");
		driver.findElement(By.id("change-btn-text")).click();
		driver.findElement(By.id("id_password")).sendKeys("callhub123");
		driver.findElement(By.id("change-btn-text")).click();
		timeDelay(10);
		System.out.println("Login - PASS");
	}
	
	public void PhoneBook() {
	
	    driver.get("https://app.callhub.io/phonebooks/");
		
	}
	
	public void CreatePhoneBook() {
		driver.findElement(By.xpath("//a[@class='btn btn-primary'][1]")).click();
		driver.findElement(By.name("name")).sendKeys("CallHub QA Test");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Test Contact Book");
		driver.findElement(By.id("create-phonebook-btn")).click();
	}

	//*[@id="phonebook-table"]/tbody/tr[1]/td[7]/span[1]/a

}
