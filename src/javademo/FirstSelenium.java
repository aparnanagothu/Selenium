package javademo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelenium {
	static WebDriver driver;
	public static void main(String[] args) throws Exception  { 
		/** How to Launch a Browser*/
		
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		Thread.sleep(1000);
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		driver.quit();
		
		
		
		
	}

}
