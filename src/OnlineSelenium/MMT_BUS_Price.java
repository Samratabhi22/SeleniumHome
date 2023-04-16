package OnlineSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MMT_BUS_Price {
	public static void main(String[] args) throws Throwable {
		
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			
			ChromeOptions options = new ChromeOptions();
  options.addArguments("--remote-allow-origins=*");
			WebDriver driver= new ChromeDriver(options);
			driver.get("https://www.makemytrip.com/");
			driver.manage().window().maximize();
//			WebDriverWait wait = new WebDriverWait(driver,10);
//			wait.until(ExpectedConditions.visibilityOf(By.xpath("//i[@class='wewidgeticon we_close']")).click();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.switchTo().frame("webklipper-publisher-widget-container-notification-frame");
			WebElement ele =driver.findElement(By.xpath("//a[@id='webklipper-publisher-widget-container-notification-close-div']"));
			
			WebDriverWait wait = new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.visibilityOf(ele));
			ele.click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//span[text()='Buses']")).click();
			
		WebElement from  =	driver.findElement(By.xpath("//span[text()=\"From\"]"));
		 from.click();
		driver.findElement(By.xpath("//span[text()=\"Bangalore, Karnataka\"]")).click();
		
		
			
			WebElement to=	driver.findElement(By.xpath("//span[text()=\"To\"]"));
			to.click();
			to.sendKeys("Mangaluru (Mangalore), Karnataka");
			
		
	}

}
