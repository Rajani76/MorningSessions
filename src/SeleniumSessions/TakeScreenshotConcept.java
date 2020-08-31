package SeleniumSessions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshotConcept {

	public static void main(String[] args) throws IOException {

		
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver","C:/chromedriver_win32/chromedriver.exe");
				System.setProperty("webdriver.ie.driver","C:/Users/palem/Desktop/CareManagerAutomation/caremanager-app-automation-git/src/main/resources/drivers/IEDriverServer.exe");
				System.setProperty("webdriver.firefox.marionette","C:/geckodriver_win64/geckodriver.exe");

			
		//System.setProperty("webdriver.chrome.driver", "/Users/naveenkhunteta/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver(); // launch chrome
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.get("http://www.google.com");

		// Take screenshot and store as a file format
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// now copy the screenshot to desired location using copyFile //method
		FileUtils.copyFile(src, new File("/Users/naveenkhunteta/Documents/workspace/MorningSessions/src/SeleniumSessions/google.png"));

	}

}
