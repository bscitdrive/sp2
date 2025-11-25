/*
Write a selenium script to use css locators to find elements on the following wepage  
https://demoqa.com/automation-practice-form. 
*/
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Prac2_3_css {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","E:\\Sem_3\\STQA\\Selenium_setup\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		
		//locate First name textbox using css selector with id attribute
		WebElement firstName=driver.findElement(By.cssSelector("input[id='firstName']"));
		firstName.sendKeys("ABC");
		
		//locate Last name textbox using css selector with id attribute using hash(#)
		WebElement lastName=driver.findElement(By.cssSelector("input#lastName"));
		lastName.sendKeys("XYZ");
		
		//locate Last name textarea using css selector with class attribute 
		WebElement currAddress=driver.findElement(By.cssSelector("textarea[class='form-control']"));
		//WebElement currAddress=driver.findElement(By.cssSelector("textarea.form-control"));//using dot(.)
		currAddress.sendKeys("Ratnagiri,Maharashtra");
		
		//locate mobile number textbox
		WebElement mobNo=driver.findElement(By.cssSelector("input[id='userNumber'][placeholder='Mobile Number']"));
		mobNo.sendKeys("1234567890");
		

	}

}

