
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Prac2_5_xPath {

	public static void main(String[] args) {
		
        // Set path for geckodriver
        System.setProperty("webdriver.gecko.driver", "E:\\Sem_3\\STQA\\Selenium_setup\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        // Open demo site
        driver.get("https://demo.guru99.com/test/selenium-xpath.html");

        // Absolute XPath - Locate 'UserID' text field
        WebElement userId = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input"));
        userId.sendKeys("ABC");

        // Relative XPath - Locate 'Password' text field
        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("mypassword");

        // Using 'contains()' - Locate Submit button
        WebElement submitBtn = driver.findElement(By.xpath("//input[contains(@name,'btnLogin')]"));
        submitBtn.click();

	}

}
