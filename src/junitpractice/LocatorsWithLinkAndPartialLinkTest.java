package junitpractice;



import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class LocatorsWithLinkAndPartialLinkTest {
	static WebDriver driver;
	
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	void FacebookCreateAPagePracticeWithLinkAndPartialLinkTest() throws InterruptedException {
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		//driver.findElement(By.linkText("Create a Page")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Page")).click();
	}
		
		@Test
		void IndiaTodayPracticeWithLinkAndPartialLinkTest() throws InterruptedException {
			/** India Today some article*/
			driver.get("https://www.indiatoday.in/");
			Thread.sleep(2000);
			driver.findElement(By.linkText("3 killed after Coast Guard helicopter crashes in Gujarat's Porbandar")).click();
			Thread.sleep(2000);
			
	}
		
		
			/** TO know How many total links are there in application*/
		
		@Test
		void IndiaTodayTotalLinks() throws InterruptedException {
			driver.get("https://www.indiatoday.in/");
			Thread.sleep(2000);
			List<WebElement> totallinks = driver.findElements(By.tagName("a"));
			System.out.println("The total links in India Today : "+totallinks.size());
		}
		}
		


