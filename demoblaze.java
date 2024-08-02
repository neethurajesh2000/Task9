package Task9;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demoblaze {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		  //Set the up Chrome Driver 
		 WebDriver driver=new  ChromeDriver();
		 
		//load the url 
		 driver.get("https://www.google.com/");
		 
		//navigate to the  website 
		 driver.navigate().to("https://www.demoblaze.com/");
		 
		//avoid implicit syncronization
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		//to maximize the browser
		 driver.manage().window().maximize();
		 
		 //Locating an element 
		 Thread.sleep(3000);
		 
		 //To get the tittle
		 String tittle=driver.getTitle();
			if(tittle.equals("STORE")) {
			System.out.println("The page is landed on correct website");
		   }else {
			System.out.println("The page is not landed on correct website");
		   }
			
			//To get the screenshort
			
			File screenshot2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshot2, new File("seleniumconceptjat20wd\\demoblaze.png"));
			 
			//close the driver
			driver.close();
	}

}
