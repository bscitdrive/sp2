/*
Write a selenium script to find elements on http://demo.guru99.com/test/newtours/ using 
id,name, linktext, partial link locators. 
*/
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Prac2_4_NameLinktextPartialLink {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.gecko.driver", "E:\\Sem_3\\STQA\\Selenium_setup\\geckodriver.exe");
	     WebDriver driver = new FirefoxDriver();

	     // Open demo site
	     driver.get("http://demo.guru99.com/test/newtours/");

	     // ---- Locate by name ----
	     WebElement userName = driver.findElement(By.name("userName"));
	     userName.sendKeys("ABC");

	     WebElement password = driver.findElement(By.name("password"));
	     password.sendKeys("mypassword@123");
	     
	     // ---- Locate by id ---- (on Register page, First Name input has id)
	     driver.findElement(By.linkText("REGISTER")).click();
	     
	     // ---- Locate by partialLinkText ----
	     WebElement partialhomeLink = driver.findElement(By.partialLinkText("light"));
	     partialhomeLink.click();
	}

}

