package junitpractice;

import org.testng.annotations.Test;

public class PopUpAlerts {
  WebDriver driver;
  @Test
  public void techlearn() {
     driver.get("https://www.techlearn.in/");
    driver.switchTo().alert().accept();
  }

  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }
}
