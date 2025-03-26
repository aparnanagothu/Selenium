package junitpractice;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class JunitPractice {
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

	@Disabled
	@Test
	void Amazon() {
		driver.get("https://www.amazon.com/");
		
	}
	
	@Test
	void Flipkart() {
		driver.get("https://www.flipkart.com/");
	}
	
	@Test
	void Myntra() {
		driver.get("https://www.myntra.com/");
	}
	
	@Disabled
	@Test
	void Swiggy() {
		driver.get("https://www.swiggy.com/");
	}

}
