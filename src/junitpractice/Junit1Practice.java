package junitpractice;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Junit1Practice {
	static WebDriver driver;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		driver.quit();
	}

	@Test
	void Amazon() throws Exception {
		driver.get("https://www.amazon.com");
		Thread.sleep(2000);
	}
	
	
	@Test
	void Wikipedia() throws Exception {
		driver.get("https://www.wikipedia.org/");
		Thread.sleep(2000);		
	}
	
	@Test
	void Flipkart() throws Exception {
		driver.get("https://www.flipkart.com");
		Thread.sleep(2000);
	}
	
	@Test
	void Myntra() throws Exception {
		driver.get("https://www.myntra.com");
		Thread.sleep(2000);
	}

}
