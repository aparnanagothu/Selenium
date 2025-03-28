package junitpractice;



import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class XpathPractice {
	static WebDriver driver;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	void XpathForFacebook() throws InterruptedException {
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("nagothuaparna@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name=\"pass\"]")).sendKeys("12345");
		
	}

	@Test
	void XpathForTechLearn() throws InterruptedException {
		driver.get("https://www.techlearn.in/");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[contains(text(),'Contact Us')]")).click();
		Thread.sleep(2000);
		
	}

}
