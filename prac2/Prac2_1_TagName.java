/* Locate all elements with tagname “input” on the given website 
http://demo.guru99.com/test/facebook.html */

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Prac2_1_TagName {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","E:\\Sem_3\\STQA\\Selenium_setup\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://demo.guru99.com/test/facebook.html");
		
		//locate email and password using tagName and findElements()
		List<WebElement> textboxes=driver.findElements(By.tagName("input"));
		
		//Display no. of elements in textboxes
		System.out.println("Number of elements in textboxes are:"+textboxes.size());
		
		//Display elements whose tabName is input
		for(int i=0;i<textboxes.size();i++) {
			System.out.println("TextBox number "+i+": "+textboxes.get(i).getAttribute("name"));
		}
		
		textboxes.get(1).sendKeys("abc@gmail.com");  // email
		textboxes.get(2).sendKeys("mypassword123");           // password
	}

}

