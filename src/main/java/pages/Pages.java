package pages;

import org.openqa.selenium.WebDriver;

import common.TestBase;

public class Pages {
	public WebDriver webDriver;
	public TestBase testBase = new TestBase();
	
	public Pages(WebDriver dr) {
		testBase.driver = dr;
		this.webDriver = testBase.driver;
	}
}
