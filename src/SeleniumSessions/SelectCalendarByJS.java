package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;


@SuppressWarnings("unused")
public class SelectCalendarByJS {

	public static void main(String[] args) {

		//System.setProperty("webdriver.chrome.driver", "/Users/naveenkhunteta/Downloads/chromedriver");
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver","C:/chromedriver_win32/chromedriver.exe");
				System.setProperty("webdriver.ie.driver","C:/Users/palem/Desktop/CareManagerAutomation/caremanager-app-automation-git/src/main/resources/drivers/IEDriverServer.exe");
				System.setProperty("webdriver.firefox.marionette","C:/geckodriver_win64/geckodriver.exe");

			
		WebDriver driver = new ChromeDriver(); // launch chrome

		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all the cookies

		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("http://spicejet.com/"); // enter URL
		
		WebElement date = driver.findElement(By.id("ctl00_mainContent_txt_Fromdate"));
		String dateVal = "30-12-2017";
		
		selectDateByJS(driver, date, dateVal);
		
	}
	
	
	public static void selectDateByJS(WebDriver driver, WebElement element, String dateVal){
    	JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].setAttribute('value','"+dateVal+"');", element);
		
	}
	
	
	
	

}
