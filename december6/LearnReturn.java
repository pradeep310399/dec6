package december6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnReturn {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Dropdown.html");
		//by index
		/*
		 * Select dropdown1 = new Select(driver.findElement(By.id("dropdown1")));
		 * dropdown1.selectByIndex(1); //by text Select dropdown2 =new Select
		 * (driver.findElement(By.xpath("//select[@name='dropdown2']")));
		 * dropdown2.selectByVisibleText("Appium");
		 */
		//by value
		Select dropdown3 = new Select(driver.findElement(By.xpath("//select[@name='dropdown3']")));
		dropdown3.selectByValue("3");
		//Return value of getOptions()
		 List<WebElement> options = dropdown3.getOptions();
		 
	}

}
