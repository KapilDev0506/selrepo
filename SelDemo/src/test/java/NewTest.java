import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	
	WebDriver webDriver;
	WebElement webElement;
  @Test
  public void chromeTest()
  {
	  String path="//*[@id=\"p\"]";
	webElement=  webDriver.findElement(By.xpath(path));
	String response=webElement.getText();
	assertEquals("Hello world", response);
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\kapdev\\.jenkins\\workspace\\mavenbuild\\SelDemo\\chromedriver.exe");
	  webDriver =new ChromeDriver();
	  webDriver.get("C:\\Users\\kapdev\\.jenkins\\workspace\\mavenbuild\\SelDemo\\hello.html");
  }

  @AfterTest
  public void afterTest() {
	 webDriver.close();
  }

}
