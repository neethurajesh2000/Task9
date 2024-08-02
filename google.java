package Task9;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class google {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		//Set the up Firefox Driver 
		 WebDriver driver=new  FirefoxDriver();
		 
		//load the url 
		 driver.get("https://www.mozilla.org/en-US/firefox/");
		 
		//to maximize the browser
		 driver.manage().window().maximize();
		 
		//navigate to the  website 
		 driver.navigate().to("https://www.google.com/");
		 
		//Locating an element 
		 Thread.sleep(3000);
		 
		//To print current url of the website
		 String  url=driver.getCurrentUrl();
		 System.out.println("The current url is"+url);
		 
		//To reload the page
		 driver.navigate().refresh();
		 Thread.sleep(2000);
		 
		//To get the screenshort
		 File screenshot1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(screenshot1, new File("seleniumconceptjat20wd\\google.png"));
		 
		//close the driver
		 driver.close();
	}

}
