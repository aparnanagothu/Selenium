package junitpractice;



import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class LocatorsWithSelectors {
	static WebDriver driver;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}

	@Test
	void FacebookPracticeWithCssSelectors() throws InterruptedException {
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#email")).sendKeys("nagothuaparna19@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#pass")).sendKeys("1234");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#u_0_5_gw")).click();
		//driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#email")).clear();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#email")).sendKeys("nagothuaparna@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#pass")).sendKeys("1234");
		
		
	}

}
