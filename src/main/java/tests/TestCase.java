package tests;

//import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import common.TestBase;

public class TestCase {
	public TestBase testBase = new TestBase();
	@BeforeMethod
	
	public void openWeb() {
		testBase.openWeb("https://demoqa.com/", "Chrome");
	}
	
//	@AfterMethod
	public void tearDown() {
		testBase.driver.quit();
	}
}
