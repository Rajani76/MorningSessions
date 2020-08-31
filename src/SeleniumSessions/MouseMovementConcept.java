package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementConcept {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:/chromedriver_win32/chromedriver.exe");
		System.setProperty("webdriver.ie.driver","C:/Users/palem/Desktop/CareManagerAutomation/caremanager-app-automation-git/src/main/resources/drivers/IEDriverServer.exe");
		System.setProperty("webdriver.firefox.marionette","C:/geckodriver_win64/geckodriver.exe");

	
	
		   // Initialize browser
   WebDriver driver =new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver", "/Users/naveenkhunteta/Downloads/chromedriver");	
		//WebDriver driver = new ChromeDriver(); //launch chrome
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://spicejet.com/");
		
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.linkText("About Us"))).build().perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Fleet")).click();
		
		//a[contains(text(),'Sales')]
		
		
	}

}
