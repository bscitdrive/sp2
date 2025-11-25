/*
Locate all elements with classname “inputtext” on the given website 
http://demo.guru99.com/test/facebook.html 
*/
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Prac2_2_ClassName {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","E:\\Sem_3\\STQA\\Selenium_setup\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/facebook.html");
		List<WebElement> textbox=driver.findElements(By.className("inputtext"));
		System.out.println("Number of textbox:"+textbox.size());
		
		for(int i=0;i<textbox.size();i++) {
			System.out.println(textbox.get(i).getAttribute("name"));
		}
		textbox.get(0).sendKeys("abc@gmail.com");
		textbox.get(1).sendKeys("password123");
		
	}

}

