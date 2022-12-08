import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class IdentifyBikes {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/RASHIMI/Downloads/chromedriver_win32 (2)/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		takeScreenShot("ch");
		
		  driver.get("https://www.zigwheels.com/");
		  
		  takeScreenShot("hg");
		  driver.findElement(By.xpath("//*[@href='/used-car']")).click();
		  driver.switchTo().alert().dismiss();
		  driver.findElement(By.xpath("//*[text()='Chennai' and @data-track-label='used-cars-chennai']")).click();
		  driver.switchTo().alert().dismiss();
		
		  
			/*
			 * driver.findElement(By.xpath("//*[@href='/used-car']"));
			 * )).sendKeys("Mobiles under 30000");
			 * driver.findElement(By.xpath("//*[@id='nav-search-submit-button']")).click();
			 * takeScreenShot("gg");
			 * 
			 * 
			 * 
			 * validation for search results
			 * 
			 * 
			 * 
			 * String gty = driver.findElement(By.
			 * xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).
			 * getText(); System.out.println(gty);
			 * 
			 * 
			 * dropdown for sortby and listing
			 * 
			 * 
			 * Select fr = new Select(driver.findElement(By.id("s-result-sort-select")));
			 * List<WebElement> num = fr.getOptions();
			 * System.out.println("Total no of values in the dropdowns are : " +
			 * num.size()); fr.selectByIndex(4);
			 * 
			 * takeScreenShot("gk");
			 */
		 
		driver.quit();
	}

	public static void takeScreenShot(String filename) throws IOException {

		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f, new File("C:\\Users\\RASHIMI\\eclipse-workspace\\\\IdentifyBikes\\screenshots\\" + filename + ".png"));

	}

}
