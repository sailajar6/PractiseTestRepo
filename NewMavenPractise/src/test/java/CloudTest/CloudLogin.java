package CloudTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class CloudLogin {
	WebDriver driver;
  @Test
  public void LoginTest() {
	  driver.get("https://customer.cloudamqp.com/login");
	  driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sailaja.ryali@altusgroup.com");
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Argus@123");
	  driver.findElement(By.xpath("//input[@type='submit']")).sendKeys("Argus@123");
	
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","D:\\Sailaja\\chromedriver.exe");

      driver = new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
