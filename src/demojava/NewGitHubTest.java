package demojava;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewGitHubTest {
 WebDriver driver;
  @Test
  public void techlearn() {
     driver.get("https://www.Seleniumlearn.com/");   
  }

  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }
}
