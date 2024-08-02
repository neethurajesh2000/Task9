package Task9;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class wikipedia {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		//Set the up Chrome Driver 
		 WebDriver driver=new  ChromeDriver();
		 
		//load the url 
		 driver.get("https://www.google.com/");
		 
		//navigate to the  website 
		 driver.navigate().to("https://www.wikipedia.org/");		 
		//avoid implicit syncronization
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		//to maximize the browser
		 driver.manage().window().maximize();
		 
		//type the input in text box   
		 driver.findElement(By.id("searchInput")).sendKeys("Artifical Intelligence");
		 
		//submit button and click
		 WebElement searchbuttonfield=driver.findElement(By.cssSelector("button[type=\"submit\"]"));
		 searchbuttonfield.click();
		 Thread.sleep(2000);
		// click  anchor tag
		 WebElement historyfield=driver.findElement(By.xpath("//a[@href='#History']"));
		 historyfield.click();
		 
		// To print tittle
		 String tittle=driver.getTitle();
		 System.out.println("The tittle is"+tittle);
		// To get screenshort
		 File screenshot3 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(screenshot3, new File("seleniumconceptjat20wd\\wikipedia.png"));
		 
		// close the driver
		 driver.close();

	}

}
